
package net.mcreator.crustfix.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.crustfix.creativetab.TabCrustfixtab;
import net.mcreator.crustfix.ElementsDoorscrustfix;

import java.util.Set;
import java.util.HashMap;

@ElementsDoorscrustfix.ModElement.Tag
public class ItemGuildinglightrocktoolShovel extends ElementsDoorscrustfix.ModElement {
	@GameRegistry.ObjectHolder("crustfix:guildinglightrocktoolshovel")
	public static final Item block = null;
	public ItemGuildinglightrocktoolShovel(ElementsDoorscrustfix instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("GUILDINGLIGHTROCKTOOLSHOVEL", 100000, 100000, 100000f, 99996f, 100000)) {
			{
				this.attackSpeed = 96f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 100000);
				return ret.keySet();
			}

			@Override
			@SideOnly(Side.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setUnlocalizedName("guildinglightrocktoolshovel").setRegistryName("guildinglightrocktoolshovel").setCreativeTab(TabCrustfixtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("crustfix:guildinglightrocktoolshovel", "inventory"));
	}
}
