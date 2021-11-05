package com.kaupenjoe.mccourse.item;

import com.kaupenjoe.mccourse.MCCourseMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class HarcaduimApple extends Item {



    public HarcaduimApple() {
        super(new Properties().group(MCCourseMod.HARCADUIM)
                .food(new Food.Builder()
                        .hunger(5).saturation(1.5f)
                        .effect(() -> new EffectInstance(Effects.REGENERATION, 300, 1), 0.5f)
                        .build()));
    }


}
