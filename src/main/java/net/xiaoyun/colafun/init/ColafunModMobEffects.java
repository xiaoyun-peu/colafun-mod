/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.xiaoyun.colafun.init;

import net.xiaoyun.colafun.potion.ColorxgMobEffect;
import net.xiaoyun.colafun.ColafunMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

public class ColafunModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ColafunMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> COLORXG = REGISTRY.register("colorxg", () -> new ColorxgMobEffect());
}