package com.gmail.nomad856.minecraft;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


public class Healing extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Healing plugin;
       
	@Override
    public void onEnable(){
    	  PluginDescriptionFile pdfFile = this.getDescription();
    	  this.logger.info(pdfFile.getName()+ "Version" + pdfFile.getVersion() + "Has Been Enabled");
    }

       
	@Override
    public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
  	  this.logger.info(pdfFile.getName() + "Has Been Disabled");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args ){
		Player player = (Player) sender;
		if (commandLabel.equalsIgnoreCase("heal") || commandLabel.equalsIgnoreCase("h"));
			if (args.length == 0){
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "healed!");
				}else if(args.length == 1){
					if(player.getServer().getPlayer(args[0]) != null){
				Player TargetPlayer = player.getServer().getPlayer(args[0]);
				TargetPlayer.setHealth(20);
				TargetPlayer.sendMessage(ChatColor.GREEN + "healed!");
				}else{player.sendMessage(ChatColor.DARK_RED + "Player is not Online!");
			}
				}
			return false;
	}
}