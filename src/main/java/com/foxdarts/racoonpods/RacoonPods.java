package com.foxdarts.racoonpods;


import com.foxdarts.racoonpods.block.ModBlocks;
import com.foxdarts.racoonpods.item.ModCreativeModeTabs;
import com.foxdarts.racoonpods.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RacoonPods.MOD_ID)
public class RacoonPods {

    public static final String MOD_ID = "racoonpods";

    //private static final Logger LOGGER = LogUtils.getLogger();

    //important notes!
    public RacoonPods()
    {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {



    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        //todo redo png files for textures of items/blocks
        if(event.getTab() == CreativeModeTabs.INGREDIENTS)
        {

            event.accept(ModItems.RACOON_POUCH);
            event.accept(ModItems.BIG_RACOON_POUCH);

        }

        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS)
        {

            event.accept(ModBlocks.LEATHER_BLOCK);

        }

        if(event.getTab() == ModCreativeModeTabs.RACOONPODS_TAB)
        {

            event.accept(ModItems.RACOON_POUCH);
            event.accept(ModItems.BIG_RACOON_POUCH);
            event.accept(ModBlocks.LEATHER_BLOCK);

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
