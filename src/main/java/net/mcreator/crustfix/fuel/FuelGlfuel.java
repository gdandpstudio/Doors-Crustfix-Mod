
package net.mcreator.crustfix.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.crustfix.item.ItemGldust;
import net.mcreator.crustfix.ElementsDoorscrustfix;

@ElementsDoorscrustfix.ModElement.Tag
public class FuelGlfuel extends ElementsDoorscrustfix.ModElement {
	public FuelGlfuel(ElementsDoorscrustfix instance) {
		super(instance, 97);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemGldust.block, (int) (1)).getItem())
			return 276447231;
		return 0;
	}
}
