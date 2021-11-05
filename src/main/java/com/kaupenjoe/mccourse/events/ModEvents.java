package com.kaupenjoe.mccourse.events;

import com.kaupenjoe.mccourse.MCCourseMod;
import com.kaupenjoe.mccourse.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEvents {

    @SubscribeEvent
    public void onHarcaduim(AttackEntityEvent event) {

        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.HARCADUIM.get()) {

            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                target.addPotionEffect(new EffectInstance(Effects.LEVITATION, 5, 15));



            }

        }
    }

    @SubscribeEvent
    public void onLightning(AttackEntityEvent event) {

        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.LIGHTNING_BOLT.get()) {

            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                World w = event.getPlayer().getEntityWorld();
                double x = target.getPosX();
                double y =  target.getPosY();
                double z = target.getPosZ();







            }

        }
    }

}
