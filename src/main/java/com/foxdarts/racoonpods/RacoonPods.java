package com.foxdarts.racoonpods;


import com.foxdarts.racoonpods.item.ModCreativeModeTabs;
import com.foxdarts.racoonpods.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RacoonPods.MOD_ID)
public class RacoonPods {

    public static final String MOD_ID = "racoonpods";

    private static final Logger LOGGER = LogUtils.getLogger();

    //important notes!
    public RacoonPods()
    {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {



    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {

        if(event.getTab() == CreativeModeTabs.INGREDIENTS)
        {

            event.accept(ModItems.RACOON_POUCH);
            event.accept(ModItems.BIG_RACOON_POUCH);

        }

        if(event.getTab() == ModCreativeModeTabs.RACOON_PODS_TAB)
        {

            event.accept(ModItems.RACOON_POUCH);
            event.accept(ModItems.BIG_RACOON_POUCH);

        }


    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {

        @SubscribeEvent
        public static void onClientSetup(FMLCommonSetupEvent event)
        {



        }

    }

}
