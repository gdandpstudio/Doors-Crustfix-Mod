
package net.mcreator.crustfix.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.crustfix.creativetab.TabCrustfixtab;
import net.mcreator.crustfix.ElementsDoorscrustfix;

import java.util.Set;
import java.util.HashMap;

@ElementsDoorscrustfix.ModElement.Tag
public class ItemGuildinglightrocktoolHoe extends ElementsDoorscrustfix.ModElement {
	@GameRegistry.ObjectHolder("crustfix:guildinglightrocktoolhoe")
	public static final Item block = null;
	public ItemGuildinglightrocktoolHoe(ElementsDoorscrustfix instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("GUILDINGLIGHTROCKTOOLHOE", 100000, 100000, 100000f, 99f, 100000)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 100000);
				return ret.keySet();
			}

			@Override
			@SideOnly(Side.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setUnlocalizedName("guildinglightrocktoolhoe").setRegistryName("guildinglightrocktoolhoe").setCreativeTab(TabCrustfixtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("crustfix:guildinglightrocktoolhoe", "inventory"));
	}
}
