package net.xiaoyun.colafun.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class Co2Block extends Block {
	public Co2Block(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}