package com.foxdarts.racoonpods.datagen;

import com.foxdarts.racoonpods.RacoonPods;
import com.foxdarts.racoonpods.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class MobBlockStateProvider extends BlockStateProvider
{

    public MobBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {

        super(output, RacoonPods.MOD_ID, exFileHelper);

    }

    @Override
    protected void registerStatesAndModels()
    {

        blockWithItem(ModBlocks.LEATHER_BLOCK);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject)
    {

        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));

    }

}
