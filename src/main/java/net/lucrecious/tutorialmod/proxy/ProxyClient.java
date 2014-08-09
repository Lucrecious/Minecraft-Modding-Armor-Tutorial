package net.lucrecious.tutorialmod.proxy;

import java.util.HashMap;
import java.util.Map;

import net.lucrecious.tutorialmod.TutorialMod;
import net.lucrecious.tutorialmod.models.ModelCustomArmor;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;

public class ProxyClient extends ProxyCommon {
	
	public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	
	public static void register_renderers(){
		
		ModelCustomArmor custom_armor = new ModelCustomArmor(1F);
		ModelCustomArmor custom_legs = new ModelCustomArmor(0.5F);
		
		armorModels.put(TutorialMod.custom_helm, custom_armor);
		armorModels.put(TutorialMod.custom_chest, custom_armor);
		armorModels.put(TutorialMod.custom_legs, custom_legs);
		armorModels.put(TutorialMod.custom_boots, custom_armor);

	}

}
