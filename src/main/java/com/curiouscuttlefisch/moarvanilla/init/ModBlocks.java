package com.curiouscuttlefisch.moarvanilla.init;

import java.util.ArrayList;
import java.util.List;
import com.curiouscuttlefisch.moarvanilla.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    
    public static final Block SMOOTH_STONE_SLAB = new BlockBase("smooth_stone_slab", Material.ROCK);
}
