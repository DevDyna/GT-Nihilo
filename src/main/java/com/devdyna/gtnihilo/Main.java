package com.devdyna.gtnihilo;

import com.devdyna.gtnihilo.init.CreativeTab;
import com.devdyna.gtnihilo.init.ItemVein;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(Main.MODID)
public class Main
{

    public static final String MODID = "gtnihilo";

    public Main(IEventBus modEventBus, ModContainer modContainer)
    {
        ItemVein.register(modEventBus);
        CreativeTab.register(modEventBus);
    }

}
