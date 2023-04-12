package com.x29naybla.simplesoy.item;

import com.x29naybla.simplesoy.SimpleSoy;
import com.x29naybla.simplesoy.block.ModBlocks;
import com.x29naybla.simplesoy.item.custom.SoyMilkItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SimpleSoy.MOD_ID);

    public static final RegistryObject<Item> SOYBEANS = ITEMS.register("soybeans",
            () -> new ItemNameBlockItem(ModBlocks.SOY_CROP.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SOY_MILK = ITEMS.register("soy_milk",
            () -> new SoyMilkItem(new SoyMilkItem.Properties().tab(CreativeModeTab.TAB_MISC).food(ModFoods.SOY_MILK).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE)));
    public static final RegistryObject<Item> TOFU = ITEMS.register("tofu",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.TOFU)));
    public static final RegistryObject<Item> MISO_SOUP = ITEMS.register("miso_soup",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.MISO_SOUP).stacksTo(1).craftRemainder(Items.BOWL)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
