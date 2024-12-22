package com.devdyna.gtnihilo.init;

import com.devdyna.gtnihilo.Main;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;

public class ItemVein {

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MODID);
    
    // -------------------------------------------------------------------------------//
    // ITEMS //
    // -------------------------------------------------------------------------------//
    public static final DeferredItem<Item> bauxite_vein_end = regItem("bauxite_vein_end");
    public static final DeferredItem<Item> magnetite_vein_end = regItem("magnetite_vein_end");
    public static final DeferredItem<Item> naquadah_vein = regItem("naquadah_vein");
    public static final DeferredItem<Item> pitchblende_vein = regItem("pitchblende_vein");
    public static final DeferredItem<Item> scheelite_vein = regItem("scheelite_vein");
    public static final DeferredItem<Item> sheldonite_vein = regItem("sheldonite_vein");
    public static final DeferredItem<Item> banded_iron_vein = regItem("banded_iron_vein");
    public static final DeferredItem<Item> beryllium_vein = regItem("beryllium_vein");
    public static final DeferredItem<Item> certus_quartz_vein = regItem("certus_quartz_vein");
    public static final DeferredItem<Item> manganese_vein = regItem("manganese_vein");
    public static final DeferredItem<Item> molybdenum_vein = regItem("molybdenum_vein");
    public static final DeferredItem<Item> monazite_vein = regItem("monazite_vein");
    public static final DeferredItem<Item> nether_quartz_vein = regItem("nether_quartz_vein");
    public static final DeferredItem<Item> redstone_vein = regItem("redstone_vein");
    public static final DeferredItem<Item> saltpeter_vein = regItem("saltpeter_vein");
    public static final DeferredItem<Item> sulfur_vein = regItem("sulfur_vein");
    public static final DeferredItem<Item> tetrahedrite_vein = regItem("tetrahedrite_vein");
    public static final DeferredItem<Item> topaz_vein = regItem("topaz_vein");
    public static final DeferredItem<Item> apatite_vein = regItem("apatite_vein");
    public static final DeferredItem<Item> cassiterite_vein = regItem("cassiterite_vein");
    public static final DeferredItem<Item> coal_vein = regItem("coal_vein");
    public static final DeferredItem<Item> copper_tin_vein = regItem("copper_tin_vein");
    public static final DeferredItem<Item> galena_vein = regItem("galena_vein");
    public static final DeferredItem<Item> garnet_tin_vein = regItem("garnet_tin_vein");
    public static final DeferredItem<Item> garnet_vein = regItem("garnet_vein");
    public static final DeferredItem<Item> iron_vein = regItem("iron_vein");
    public static final DeferredItem<Item> lubricant_vein = regItem("lubricant_vein");
    public static final DeferredItem<Item> magnetite_vein_ow = regItem("magnetite_vein_ow");
    public static final DeferredItem<Item> mineral_sand_vein = regItem("mineral_sand_vein");
    public static final DeferredItem<Item> nickel_vein = regItem("nickel_vein");
    public static final DeferredItem<Item> salts_vein = regItem("salts_vein");
    public static final DeferredItem<Item> oilsands_vein = regItem("oilsands_vein");
    public static final DeferredItem<Item> copper_vein = regItem("copper_vein");
    public static final DeferredItem<Item> diamond_vein = regItem("diamond_vein");
    public static final DeferredItem<Item> lapis_vein = regItem("lapis_vein");
    public static final DeferredItem<Item> manganese_vein_ow = regItem("manganese_vein_ow");
    public static final DeferredItem<Item> mica_vein = regItem("mica_vein");
    public static final DeferredItem<Item> olivine_vein = regItem("olivine_vein");
    public static final DeferredItem<Item> redstone_vein_ow = regItem("redstone_vein_ow");
    public static final DeferredItem<Item> sapphire_vein = regItem("sapphire_vein");
    // -------------------------------------------------------------------------------//

    public static DeferredItem<Item> regItem(String name) {
        return ITEMS.registerSimpleItem(name, new Item.Properties());
    }

}
