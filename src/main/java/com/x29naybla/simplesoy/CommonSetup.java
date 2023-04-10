package com.x29naybla.simplesoy;

import com.x29naybla.simplesoy.item.ModItems;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;


public class CommonSetup {

    public static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            registerCompostables();
        });
    }

    public static void registerCompostables() {
        ComposterBlock.COMPOSTABLES.put(ModItems.SOYBEANS.get(), 0.3F);
    }
}

