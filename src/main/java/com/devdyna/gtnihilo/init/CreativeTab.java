package com.devdyna.gtnihilo.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.devdyna.gtnihilo.Main;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;

import static com.devdyna.gtnihilo.init.ItemVein.ITEMS;

public class CreativeTab {

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, Main.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = CREATIVE_MODE_TABS
            .register("vein_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable(Main.MODID + ".tab"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> Items.DIAMOND.getDefaultInstance())
                    .displayItems((parameters, output) -> {

                        ITEMS.getEntries().forEach(e -> {
                            output.accept((Item) e.get());
                        });

                    }).build());
}
