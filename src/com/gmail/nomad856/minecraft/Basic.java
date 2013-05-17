package com.gmail.nomad856.minecraft;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Basic extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Basic plugin;
       
	@Override
    public void onEnable(){
    	  PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + "Version" + pdfFile.getVersion()
				+ "Has Been Enabled");
    	  PluginManager pm = this.getServer().getPluginManager();
          pm.registerEvents(new PlayerListener(this), this);
          pm.registerEvents(new BlockListener(this), this); 
    }

       
	@Override
    public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
  	  this.logger.info(pdfFile.getName() + "Has Been Disabled");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args ){
		Player player = (Player) sender;
		if (commandLabel.equalsIgnoreCase("sendme")){
			player.sendMessage(ChatColor.GOLD + "sent");
}
		return true;
}
}