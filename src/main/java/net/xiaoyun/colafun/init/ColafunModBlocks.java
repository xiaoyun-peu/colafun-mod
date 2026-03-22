/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoyun.colafun.init;

import net.xiaoyun.colafun.block.ShihuiBlock;
import net.xiaoyun.colafun.block.Co2Block;
import net.xiaoyun.colafun.ColafunMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public class ColafunModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ColafunMod.MODID);
	public static final DeferredBlock<Block> SHIHUI;
	public static final DeferredBlock<Block> CO_2;
	static {
		SHIHUI = register("shihui", ShihuiBlock::new);
		CO_2 = register("co_2", Co2Block::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}