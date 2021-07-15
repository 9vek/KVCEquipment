package cn.kevyn.kvc.equipment;

import cn.kevyn.kvc.equipment.content.bows.KVCBows;
import cn.kevyn.kvc.equipment.content.crossbows.KVCCrossbows;
import net.fabricmc.api.ClientModInitializer;

public class KVCEquipmentClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        /** 弓的动画 */
        KVCBows.doClientRegister();

        /** 弩的动画 */
        KVCCrossbows.doClientRegister();

    }

}
