package com.devdyna.gtnihilo;

import com.devdyna.gtnihilo.init.CreativeTab;
import com.devdyna.gtnihilo.init.ItemVein;
import com.devdyna.gtnihilo.other.ColorTinting;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main
{

    public static final String MODID = "gtnihilo";

    @SuppressWarnings("removal")
    public Main()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemVein.register(modEventBus);
        CreativeTab.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(new ColorTinting());
    }

}
