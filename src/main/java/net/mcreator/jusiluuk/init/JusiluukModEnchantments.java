
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jusiluuk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.jusiluuk.enchantment.AutomeltEnchantment;
import net.mcreator.jusiluuk.JusiluukMod;

public class JusiluukModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, JusiluukMod.MODID);
	public static final RegistryObject<Enchantment> AUTOMELT = REGISTRY.register("automelt", () -> new AutomeltEnchantment());
}
