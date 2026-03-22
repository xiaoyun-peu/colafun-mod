/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoyun.colafun.init;

import net.xiaoyun.colafun.ColafunMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class ColafunModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ColafunMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COLOR_FUN = REGISTRY.register("color_fun",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.colafun.color_fun")).icon(() -> new ItemStack(ColafunModItems.COLOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ColafunModItems.COLOR.get());
				tabData.accept(ColafunModItems.COLORK.get());
				tabData.accept(ColafunModBlocks.SHIHUI.get().asItem());
				tabData.accept(ColafunModItems.COLORP.get());
				tabData.accept(ColafunModBlocks.CO_2.get().asItem());
				tabData.accept(ColafunModItems.COLORG.get());
				tabData.accept(ColafunModItems.COLORGK.get());
			}).build());
}