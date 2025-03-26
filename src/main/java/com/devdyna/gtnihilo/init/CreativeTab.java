package com.devdyna.gtnihilo.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import com.devdyna.gtnihilo.Main;
import net.minecraft.world.item.Items;
import static com.devdyna.gtnihilo.init.ItemVein.ITEMS;

public class CreativeTab {

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, Main.MODID);

    public static final RegistryObject<CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("example_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .title(Component.translatable(Main.MODID + ".tab"))
                    .icon(() -> Items.DIAMOND.getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        ITEMS.getEntries().forEach(e -> {
                            output.accept((Item) e.get());
                        });
                    }).build());

}
