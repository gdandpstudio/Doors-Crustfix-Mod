
package net.mcreator.crustfix.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.crustfix.ElementsDoorscrustfix;

@ElementsDoorscrustfix.ModElement.Tag
public class LootTableGlsdlt extends ElementsDoorscrustfix.ModElement {
	public LootTableGlsdlt(ElementsDoorscrustfix instance) {
		super(instance, 80);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("crustfix", "glsdlt"));
	}
}
