package net.mcreator.thebenmod;

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
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementsthebenmod.ModElement.Tag
public class MCreatorMeat_armorArmor extends Elementsthebenmod.ModElement {
	@GameRegistry.ObjectHolder("thebenmod:meat_armorarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("thebenmod:meat_armorarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("thebenmod:meat_armorarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("thebenmod:meat_armorarmorboots")
	public static final Item boots = null;

	public MCreatorMeat_armorArmor(Elementsthebenmod instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MEAT_ARMORARMOR", "thebenmod:meat_armor", 53, new int[]{7, 21, 18, 7}, 32,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("meat_armorarmorhelmet")
				.setRegistryName("meat_armorarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("meat_armorarmorbody")
				.setRegistryName("meat_armorarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("meat_armorarmorlegs")
				.setRegistryName("meat_armorarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("meat_armorarmorboots")
				.setRegistryName("meat_armorarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("thebenmod:meat_armorarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("thebenmod:meat_armorarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("thebenmod:meat_armorarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("thebenmod:meat_armorarmorboots", "inventory"));
	}
}
