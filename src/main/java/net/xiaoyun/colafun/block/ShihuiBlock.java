package net.xiaoyun.colafun.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class ShihuiBlock extends Block {
	public ShihuiBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.2f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}