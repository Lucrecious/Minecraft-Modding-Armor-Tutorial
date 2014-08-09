package net.lucrecious.tutorialmod;

import net.lucrecious.tutorialmod.armor.ArmorTM;
import net.lucrecious.tutorialmod.proxy.ProxyClient;
import net.lucrecious.tutorialmod.proxy.ProxyCommon;
import net.lucrecious.tutorialmod.resources.References;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = References.mod_id, version = References.version, name = References.name)
public class TutorialMod{
	
	@SidedProxy(clientSide=References.proxy_client, serverSide=References.proxy_common)
	public static ProxyCommon proxy_common;
	public static ProxyClient proxy_client;
	
	public static Item custom_helm;;
	public static Item custom_chest;
	public static Item custom_legs;
	public static Item custom_boots;
	
    
    @EventHandler
    public void pre_init(FMLPreInitializationEvent event) {
    	
    	ArmorMaterial Useless = EnumHelper.addArmorMaterial("useless", 0, new int[]{0, 0, 0, 0}, 0);
    	
    	custom_helm = new ArmorTM(Useless, 1, 0).setUnlocalizedName("custom_helm");
    	custom_chest = new ArmorTM(Useless, 1, 1).setUnlocalizedName("custom_chest");
    	custom_legs = new ArmorTM(Useless, 1, 2).setUnlocalizedName("custom_legs");
    	custom_boots = new ArmorTM(Useless, 1, 3).setUnlocalizedName("custom_boots");	
    
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    	GameRegistry.registerItem(custom_helm, "custom_helm");
    	GameRegistry.registerItem(custom_chest, "custom_chest");
    	GameRegistry.registerItem(custom_legs, "custom_legs");
    	GameRegistry.registerItem(custom_boots, "custom_boots");
    	
 
    	proxy_client.register_renderers();
    	
    }
}
