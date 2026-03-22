package net.xiaoyun.colafun.item;

import net.xiaoyun.colafun.procedures.Color_tyxgProcedure;
import net.xiaoyun.colafun.init.ColafunModItems;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.UseRemainder;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.component.DataComponents;

@EventBusSubscriber
public class ColorItem extends Item {
	public ColorItem(Item.Properties properties) {
		super(properties.stacksTo(1).fireResistant().food((new FoodProperties.Builder()).nutrition(6).saturationModifier(10f).alwaysEdible().build(), Consumables.DEFAULT_DRINK));
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		event.modify(ColafunModItems.COLOR.get(), builder -> builder.set(DataComponents.USE_REMAINDER, new UseRemainder(new ItemStack(ColafunModItems.COLORK.get()))));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		Color_tyxgProcedure.execute(entity);
		return retval;
	}
}