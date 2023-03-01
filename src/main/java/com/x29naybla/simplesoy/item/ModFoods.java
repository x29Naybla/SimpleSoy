package com.x29naybla.simplesoy.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SOY_MILK = (new FoodProperties.Builder()).nutrition(0).saturationMod(0F).alwaysEat().build();
    public static final FoodProperties TOFU = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.6F).build();
}
