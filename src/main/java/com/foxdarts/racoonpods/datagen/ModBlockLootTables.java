package com.foxdarts.racoonpods.datagen;

import com.foxdarts.racoonpods.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

    }


    @Override
    protected Iterable<Block> getKnownBlocks()
    {

        return ModBlocks.Blocks.getEntries().stream().map(RegistryObject::get)::iterator;

    }
}
