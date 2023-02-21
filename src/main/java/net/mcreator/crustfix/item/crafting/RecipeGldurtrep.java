
package net.mcreator.crustfix.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.crustfix.item.ItemGldust;
import net.mcreator.crustfix.block.BlockGlore;
import net.mcreator.crustfix.ElementsDoorscrustfix;

@ElementsDoorscrustfix.ModElement.Tag
public class RecipeGldurtrep extends ElementsDoorscrustfix.ModElement {
	public RecipeGldurtrep(ElementsDoorscrustfix instance) {
		super(instance, 98);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockGlore.block, (int) (1)), new ItemStack(ItemGldust.block, (int) (1)), 1F);
	}
}
