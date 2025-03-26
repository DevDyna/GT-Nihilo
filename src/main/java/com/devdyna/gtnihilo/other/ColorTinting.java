package com.devdyna.gtnihilo.other;

import static com.devdyna.gtnihilo.init.ItemVein.ITEMS;
import static com.devdyna.gtnihilo.other.DataBase.colors;

import net.minecraft.world.item.Item;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ColorTinting {

    @SubscribeEvent
    public void registerItemColors(RegisterColorHandlersEvent.Item event) {

        for (int i = 0; i < ITEMS.getEntries().size(); i++) {
            regTintItem(event,
                    colors[i],
                    ITEMS.getEntries()
                            .stream().skip(i).findFirst().get().get());
        }

    }

    public void regTintItem(RegisterColorHandlersEvent.Item e, int color, Item i) {
        e.register((item, tintindex) -> item.getItem()==i ? color: null, i);
    }

}
