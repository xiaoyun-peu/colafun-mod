package net.xiaoyun.colafun.procedures;

import net.xiaoyun.colafun.init.ColafunModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class Color_tyxgProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(ColafunModMobEffects.COLORXG, 3600, 1));
	}
}