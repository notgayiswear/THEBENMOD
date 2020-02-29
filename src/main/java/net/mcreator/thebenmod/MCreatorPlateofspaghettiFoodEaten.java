package net.mcreator.thebenmod;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementsthebenmod.ModElement.Tag
public class MCreatorPlateofspaghettiFoodEaten extends Elementsthebenmod.ModElement {
	public MCreatorPlateofspaghettiFoodEaten(Elementsthebenmod instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPlateofspaghettiFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 60, (int) 2));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 30, (int) 3));
	}
}
