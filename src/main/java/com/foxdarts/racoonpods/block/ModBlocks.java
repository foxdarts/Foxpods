package com.foxdarts.racoonpods.block;

import com.foxdarts.racoonpods.RacoonPods;
import com.foxdarts.racoonpods.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> Blocks =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RacoonPods.MOD_ID);


    public static final RegistryObject<Block> LEATHER_BLOCK = registerBlock("leather_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(6f).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {

        RegistryObject<T> toReturn = Blocks.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;

    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));

    }

    public static void register(IEventBus eventBus)
    {

        Blocks.register(eventBus);

    }

}
