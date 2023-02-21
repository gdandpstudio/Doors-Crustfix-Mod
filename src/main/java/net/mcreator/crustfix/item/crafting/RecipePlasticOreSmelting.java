
package net.mcreator.crustfix.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.crustfix.item.ItemPlasticIngot;
import net.mcreator.crustfix.block.BlockPlasticOre;
import net.mcreator.crustfix.ElementsDoorscrustfix;

@ElementsDoorscrustfix.ModElement.Tag
public class RecipePlasticOreSmelting extends ElementsDoorscrustfix.ModElement {
	public RecipePlasticOreSmelting(ElementsDoorscrustfix instance) {
		super(instance, 75);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockPlasticOre.block, (int) (1)), new ItemStack(ItemPlasticIngot.block, (int) (1)), 0.7F);
	}
}
