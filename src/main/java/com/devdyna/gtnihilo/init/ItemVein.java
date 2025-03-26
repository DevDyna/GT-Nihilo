package com.devdyna.gtnihilo.init;

import com.devdyna.gtnihilo.Main;
import static com.devdyna.gtnihilo.other.DataBase.veins;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;

public class ItemVein {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MODID);

    public static void register(IEventBus bus) {

        veins.forEach(i -> {
            ITEMS.registerSimpleItem(i, new Item.Properties());
        });

        ITEMS.register(bus);
    }
}
