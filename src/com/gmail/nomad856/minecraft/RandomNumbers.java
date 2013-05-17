package com.gmail.nomad856.minecraft;

import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class RandomNumbers extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static RandomNumbers plugin;
       
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
		if(commandLabel.equalsIgnoreCase("flip")) {
		Random object = new Random();
		int number;
		
		for(int counter =1; counter<=1;counter++){
			number = 1+object.nextInt(2);
			
			if(number == 1){
				player.sendMessage("Heads");
			}else if(number == 2){
				player.sendMessage("Tails");
			}
		}
		}
		return false;
}
}