package com.foxdarts.racoonpods.item;

import com.foxdarts.racoonpods.RacoonPods;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = RacoonPods.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {

    public static CreativeModeTab RACOON_PODS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {

        RACOON_PODS_TAB = event.registerCreativeModeTab(new ResourceLocation(RacoonPods.MOD_ID, "racoon_pods_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.RACOON_POUCH.get()))
                        .title(Component.translatable("creativemodetab.racoon_pods_tab")));

    }

}
