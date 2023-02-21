
package net.mcreator.crustfix.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.crustfix.item.ItemIcon;
import net.mcreator.crustfix.ElementsDoorscrustfix;

@ElementsDoorscrustfix.ModElement.Tag
public class TabCrustfixtab extends ElementsDoorscrustfix.ModElement {
	public TabCrustfixtab(ElementsDoorscrustfix instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcrustfixtab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemIcon.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
