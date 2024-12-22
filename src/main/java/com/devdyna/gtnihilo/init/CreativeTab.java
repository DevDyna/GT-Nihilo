package com.devdyna.gtnihilo.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.devdyna.gtnihilo.Main;

public class CreativeTab {

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, Main.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS
            .register("vein_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable(Main.MODID + ".tab"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ItemVein.sapphire_vein.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ItemVein.bauxite_vein_end.get());
                        output.accept(ItemVein.magnetite_vein_end.get());
                        output.accept(ItemVein.naquadah_vein.get());
                        output.accept(ItemVein.pitchblende_vein.get());
                        output.accept(ItemVein.scheelite_vein.get());
                        output.accept(ItemVein.sheldonite_vein.get());
                        output.accept(ItemVein.banded_iron_vein.get());
                        output.accept(ItemVein.beryllium_vein.get());
                        output.accept(ItemVein.certus_quartz_vein.get());
                        output.accept(ItemVein.manganese_vein.get());
                        output.accept(ItemVein.molybdenum_vein.get());
                        output.accept(ItemVein.monazite_vein.get());
                        output.accept(ItemVein.nether_quartz_vein.get());
                        output.accept(ItemVein.redstone_vein.get());
                        output.accept(ItemVein.saltpeter_vein.get());
                        output.accept(ItemVein.sulfur_vein.get());
                        output.accept(ItemVein.tetrahedrite_vein.get());
                        output.accept(ItemVein.topaz_vein.get());
                        output.accept(ItemVein.apatite_vein.get());
                        output.accept(ItemVein.cassiterite_vein.get());
                        output.accept(ItemVein.coal_vein.get());
                        output.accept(ItemVein.copper_tin_vein.get());
                        output.accept(ItemVein.galena_vein.get());
                        output.accept(ItemVein.garnet_tin_vein.get());
                        output.accept(ItemVein.garnet_vein.get());
                        output.accept(ItemVein.iron_vein.get());
                        output.accept(ItemVein.lubricant_vein.get());
                        output.accept(ItemVein.magnetite_vein_ow.get());
                        output.accept(ItemVein.mineral_sand_vein.get());
                        output.accept(ItemVein.nickel_vein.get());
                        output.accept(ItemVein.salts_vein.get());
                        output.accept(ItemVein.oilsands_vein.get());
                        output.accept(ItemVein.copper_vein.get());
                        output.accept(ItemVein.diamond_vein.get());
                        output.accept(ItemVein.lapis_vein.get());
                        output.accept(ItemVein.manganese_vein_ow.get());
                        output.accept(ItemVein.mica_vein.get());
                        output.accept(ItemVein.olivine_vein.get());
                        output.accept(ItemVein.redstone_vein_ow.get());
                        output.accept(ItemVein.sapphire_vein.get());
                    }).build());
}
