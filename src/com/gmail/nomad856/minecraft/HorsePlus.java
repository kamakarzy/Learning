package com.gmail.nomad856.minecraft;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class HorsePlus extends JavaPlugin {

	public void onEnable() {
		Server server = this.getServer();

		ShapedRecipe IronHorseArmour = new ShapedRecipe(new ItemStack(417, 1));
		IronHorseArmour.shape("  I", "IWI", "III");
		IronHorseArmour.setIngredient('I', Material.IRON_INGOT);
		IronHorseArmour.setIngredient('W', Material.WOOL);
		server.addRecipe(IronHorseArmour);

		ShapedRecipe GoldHorseArmour = new ShapedRecipe(new ItemStack(418, 1));
		GoldHorseArmour.shape("  G", "GWG", "GGG");
		GoldHorseArmour.setIngredient('G', Material.GOLD_INGOT);
		GoldHorseArmour.setIngredient('W', Material.WOOL);
		server.addRecipe(GoldHorseArmour);

		ShapedRecipe DiamondHorseArmour = new ShapedRecipe(
				new ItemStack(419, 1));
		DiamondHorseArmour.shape("  D", "DWD", "DDD");
		DiamondHorseArmour.setIngredient('D', Material.DIAMOND);
		DiamondHorseArmour.setIngredient('W', Material.WOOL);
		server.addRecipe(DiamondHorseArmour);

		ShapedRecipe Saddle = new ShapedRecipe(new ItemStack(Material.SADDLE));
		Saddle.shape("LLL", "LIL", "I I");
		Saddle.setIngredient('L', Material.LEATHER);
		Saddle.setIngredient('I', Material.IRON_INGOT);
		server.addRecipe(Saddle);
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player player = (Player) sender;
		Location location = player.getLocation();

		if (cmd.getName().equalsIgnoreCase("spawnhorse")) {
			if (player.hasPermission("horseplus.spawnhorse")) {
				if (args.length == 0) {
					player.getWorld().spawnEntity(player.getLocation(),
							EntityType.COW);
				} else if (args.length == 1) {
					player.sendMessage(ChatColor.DARK_RED
							+ "Too many arguments! Use: /spawnhorse");
					return false;
				}
				player.sendMessage(ChatColor.DARK_RED
						+ "You have insufficient permissions.");
			}
		}
		return true;
	}
}