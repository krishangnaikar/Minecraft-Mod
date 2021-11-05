package com.kaupenjoe.mccourse.block;

import com.kaupenjoe.mccourse.MCCourseMod;
import com.kaupenjoe.mccourse.util.Registration;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {


    public static final RegistryObject<Block> HARCADUIM_ORE = register("harcaduim_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(4f, 11f).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> HARCADUIM_BLOCK = register("harcaduim_block",
            () -> new Block(AbstractBlock.Properties.create(Material.DRAGON_EGG)
                    .hardnessAndResistance(4f, 11f).sound(SoundType.METAL)));

    /*public static final RegistryObject<Block> HARCADUIM_STAIRS =
            register("harcaduim_stairs", () -> new StairsBlock(() -> ModBlocks.HARCADUIM_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.IRON)));

    public static final RegistryObject<Block> HARCADUIM_FENCE =
            register("harcaduim_fence",
                    () -> new FenceBlock(AbstractBlock.Properties.create(Material.IRON)));*/





    public static void register() {

    }


    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block) {

        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(MCCourseMod.HARCADUIM)));

        return toReturn;

    }
}
