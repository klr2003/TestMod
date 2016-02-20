package me.klr2003.testmod;

import me.klr2003.testmod.creativetabs.TestItemsTab;
import me.klr2003.testmod.proxies.CommonProxy;
import me.klr2003.testmod.registry.BlockRegistry;
import me.klr2003.testmod.registry.ItemRegistry;
import me.klr2003.testmod.registry.RecipeRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)

public class TestModMain {
	
	@SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.SERVER_PROXY)
	public static CommonProxy proxy;
	
	public static final TestItemsTab tabTestItems = new TestItemsTab("tabTestItems");
			
	//PreInit Phase 2/7
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		BlockRegistry.init();
		BlockRegistry.register();
		ItemRegistry.init();
		ItemRegistry.register();
		RecipeRegistry.Recipes();
	}
	//Init Phase 5/7
	@EventHandler
	public void Init(FMLInitializationEvent event){
			proxy.registerRenders();
		}
	//PostInit Phase 6/7
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
					
				}
}
