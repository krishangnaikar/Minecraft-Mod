package com.kaupenjoe.mccourse.world.gen;

import com.kaupenjoe.mccourse.block.ModBlocks;
import net.minecraft.block.Block;

public enum OreType {
    HARCADUIM(ModBlocks.HARCADUIM_ORE.get(), 100, 0, 50);

    private final Block block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;

    OreType(Block block, int maxVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Block getBlock() {
        return block;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public static OreType get(Block block) {
        for (OreType ore: values()) {
            if (block == ore.block) {
                return ore;
            }

        }

        return null;
    }
}
