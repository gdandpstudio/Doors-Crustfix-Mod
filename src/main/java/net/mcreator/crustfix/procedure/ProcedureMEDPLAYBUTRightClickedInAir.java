package net.mcreator.crustfix.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.crustfix.gui.GuiMedplaygui;
import net.mcreator.crustfix.ElementsDoorscrustfix;
import net.mcreator.crustfix.Doorscrustfix;

@ElementsDoorscrustfix.ModElement.Tag
public class ProcedureMEDPLAYBUTRightClickedInAir extends ElementsDoorscrustfix.ModElement {
	public ProcedureMEDPLAYBUTRightClickedInAir(ElementsDoorscrustfix instance) {
		super(instance, 71);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MEDPLAYBUTRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MEDPLAYBUTRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MEDPLAYBUTRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MEDPLAYBUTRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MEDPLAYBUTRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(Doorscrustfix.instance, GuiMedplaygui.GUIID, world, x, y, z);
	}
}
