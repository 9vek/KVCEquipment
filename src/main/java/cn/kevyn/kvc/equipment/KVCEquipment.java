package cn.kevyn.kvc.equipment;

import cn.kevyn.kvc.equipment.config.KVCConfig;
import cn.kevyn.kvc.equipment.content.KVCGroups;
import cn.kevyn.kvc.equipment.content.armors.KVCArmors;
import cn.kevyn.kvc.equipment.content.bows.KVCBows;
import cn.kevyn.kvc.equipment.content.crossbows.KVCCrossbows;
import cn.kevyn.kvc.equipment.content.tools.KVCTools;
import cn.kevyn.kvc.equipment.content.tools.VanillaToolItemsOverride;
import net.fabricmc.api.ModInitializer;


public class KVCEquipment implements ModInitializer {

	/** 配置文件 */
	public static KVCConfig CONFIG = new KVCConfig("KVCEquipment.properties");

	@Override
	public void onInitialize() {

		/** 物品组 */
		KVCGroups.doRegister();

		/** 覆盖原版工具 */
		VanillaToolItemsOverride.doOverride();

		/** 工具和剑的注册 */
		KVCTools.doRegister();

		/** 盔甲的注册 */
		KVCArmors.doRegister();

		/** 弓的注册 */
		KVCBows.doRegister();

		/** 弩的注册 */
		KVCCrossbows.doRegister();

	}
}
