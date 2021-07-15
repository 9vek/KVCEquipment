package cn.kevyn.kvc.equipment.config;

import net.fabricmc.loader.api.FabricLoader;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;

public class KVCConfig {

    private String configFileName;
    private File configFile;
    private HashMap<String, String> config;
    private int brokenPair;

    public KVCConfig(String configFileName) {

        this.configFileName = configFileName;
        this.config = new HashMap<>();

        try {
            loadDefaultConfig();
            loadConfig();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void loadDefaultConfig() throws IOException {
        URL url = this.getClass().getClassLoader().getResource(configFileName);
        InputStream input = url.openStream();
        Scanner reader = new Scanner(input);
        while (reader.hasNextLine()) {
            readKeyValuePair(reader.nextLine());
            brokenPair++;
        }
        reader.close();
        input.close();
    }

    private void loadConfig() throws IOException {

        Path path = FabricLoader.getInstance().getConfigDir();
        configFile = path.resolve(configFileName).toFile();

        if (!configFile.exists()) {
            Files.createFile(configFile.toPath());
            String target = configFile.getAbsolutePath();
            FileOutputStream output = new FileOutputStream(target);
            URL url = this.getClass().getClassLoader().getResource(configFileName);
            InputStream input = url.openStream();
            byte [] buffer = new byte[4096];
            int bytesRead = input.read(buffer);
            while (bytesRead != -1) {
                output.write(buffer, 0, bytesRead);
                bytesRead = input.read(buffer);
            }
            output.close();
            input.close();
        }

        else {
            FileInputStream input = new FileInputStream(configFile);
            Scanner reader = new Scanner(input);
            while (reader.hasNextLine()) {
                readKeyValuePair(reader.nextLine());
                brokenPair--;
            }
            reader.close();
            input.close();
        }

    }

    private void repairConfig() {}

    private boolean isBroken() {
        return brokenPair > 0;
    }

    private void destroy() {
        config.clear();
        configFile = null;
    }

    private void readKeyValuePair(String line) {
        if(!line.isEmpty() && !line.startsWith("#")) {
            String[] pair = line.split("=", 2);
            if(pair.length == 2) {
                config.put(pair[0], pair[1]);
            }
        }
    }

    private String get(String key) {
        return config.get(key);
    }

    public Object getOfType(String type, String key) {
        String value = get(key);

        if (value == null) {
            System.out.println(key);
            return null;
        }

        if (type.equals("String")) {
            return value;
        }
        else if (type.equals("int")) {
            return Integer.parseInt(value);
        }
        else if (type.equals("float")) {
            return Float.parseFloat(value);
        }
        else if (type.equals("double")) {
            return Double.parseDouble(value);
        }
        else if (type.equals("boolean")) {
            return key.equalsIgnoreCase("true");
        }
        else if (type.equals("int[]")) {
            value = value.replace("{", "").replace("}", "").replace(" ", "");
            String[] values = value.split(",");
            int[] intValues = new int[values.length];
            for (int i = 0; i < values.length; i++) {
                intValues[i] = Integer.parseInt(values[i]);
            }
            return intValues;
        }
        return null;
    }

}
