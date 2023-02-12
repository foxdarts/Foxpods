package com.foxdarts.racoonpods.item;


import com.foxdarts.racoonpods.RacoonPods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RacoonPods.MOD_ID);

    public static final RegistryObject<Item> RACOON_POUCH = ITEMS.register("racoon_pouch",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BIG_RACOON_POUCH = ITEMS.register("big_racoon_pouch",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {

        ITEMS.register(eventBus);

    }

}
