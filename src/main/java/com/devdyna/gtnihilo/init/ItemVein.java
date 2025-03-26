package com.devdyna.gtnihilo.init;

import com.devdyna.gtnihilo.Main;
import static com.devdyna.gtnihilo.other.DataBase.veins;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemVein {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static void register(IEventBus bus) {

        veins.forEach(i -> {
            ITEMS.register(i, ()-> new SimpleItem());
        });

        ITEMS.register(bus);
    }
}


class SimpleItem extends Item{
    public SimpleItem() {
        super(new Item.Properties());
    }
}