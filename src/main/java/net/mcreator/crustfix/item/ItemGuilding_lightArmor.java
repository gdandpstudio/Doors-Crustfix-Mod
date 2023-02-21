
package net.mcreator.crustfix.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.crustfix.creativetab.TabCrustfixtab;
import net.mcreator.crustfix.ElementsDoorscrustfix;

@ElementsDoorscrustfix.ModElement.Tag
public class ItemGuilding_lightArmor extends ElementsDoorscrustfix.ModElement {
	@GameRegistry.ObjectHolder("crustfix:guilding_lightarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("crustfix:guilding_lightarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("crustfix:guilding_lightarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("crustfix:guilding_lightarmorboots")
	public static final Item boots = null;
	public ItemGuilding_lightArmor(ElementsDoorscrustfix instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("GUILDING_LIGHTARMOR", "crustfix:guilding_light", 150,
				new int[]{1000, 1000, 1000, 1000}, 100,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("guilding_lightarmorhelmet")
				.setRegistryName("guilding_lightarmorhelmet").setCreativeTab(TabCrustfixtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("guilding_lightarmorbody")
				.setRegistryName("guilding_lightarmorbody").setCreativeTab(TabCrustfixtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("guilding_lightarmorlegs")
				.setRegistryName("guilding_lightarmorlegs").setCreativeTab(TabCrustfixtab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("guilding_lightarmorboots")
				.setRegistryName("guilding_lightarmorboots").setCreativeTab(TabCrustfixtab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("crustfix:guilding_lightarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("crustfix:guilding_lightarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("crustfix:guilding_lightarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("crustfix:guilding_lightarmorboots", "inventory"));
	}
}
