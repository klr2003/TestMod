package me.klr2003.testmod.proxies;

import me.klr2003.testmod.registry.BlockRegistry;
import me.klr2003.testmod.registry.ItemRegistry;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		BlockRegistry.registerRenders();
		ItemRegistry.registerRenders();
	}
}
