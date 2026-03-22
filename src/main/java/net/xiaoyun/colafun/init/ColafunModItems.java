/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoyun.colafun.init;

import net.xiaoyun.colafun.item.ColorpItem;
import net.xiaoyun.colafun.item.ColorkItem;
import net.xiaoyun.colafun.item.ColorgkItem;
import net.xiaoyun.colafun.item.ColorgItem;
import net.xiaoyun.colafun.item.ColorItem;
import net.xiaoyun.colafun.ColafunMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

public class ColafunModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ColafunMod.MODID);
	public static final DeferredItem<Item> COLOR;
	public static final DeferredItem<Item> COLORK;
	public static final DeferredItem<Item> SHIHUI;
	public static final DeferredItem<Item> COLORP;
	public static final DeferredItem<Item> COLORGK;
	public static final DeferredItem<Item> COLORG;
	public static final DeferredItem<Item> CO_2;
	static {
		COLOR = register("color", ColorItem::new);
		COLORK = register("colork", ColorkItem::new);
		SHIHUI = block(ColafunModBlocks.SHIHUI);
		COLORP = register("colorp", ColorpItem::new);
		COLORGK = register("colorgk", ColorgkItem::new);
		COLORG = register("colorg", ColorgItem::new);
		CO_2 = block(ColafunModBlocks.CO_2);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}