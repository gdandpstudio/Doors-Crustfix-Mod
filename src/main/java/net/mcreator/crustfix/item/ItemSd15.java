
package net.mcreator.crustfix.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.crustfix.ElementsDoorscrustfix;

@ElementsDoorscrustfix.ModElement.Tag
public class ItemSd15 extends ElementsDoorscrustfix.ModElement {
	@GameRegistry.ObjectHolder("crustfix:sd15")
	public static final Item block = null;
	public ItemSd15(ElementsDoorscrustfix instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("crustfix:sd15", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("sd15", ElementsDoorscrustfix.sounds.get(new ResourceLocation("crustfix:pigstep")));
			setUnlocalizedName("sd15");
			setRegistryName("sd15");
			setCreativeTab(CreativeTabs.MISC);
		}
	}
}
