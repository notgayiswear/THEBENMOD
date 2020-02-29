package net.mcreator.thebenmod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsthebenmod.ModElement.Tag
public class MCreatorMeatin extends Elementsthebenmod.ModElement {
	public MCreatorMeatin(Elementsthebenmod instance) {
		super(instance, 21);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorRawmeat.block, (int) (1)), new ItemStack(MCreatorMeatbrick.block, (int) (1)), 1F);
	}
}
