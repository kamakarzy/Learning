	

    package com.gmail.nomad856.minecraft;
     
    import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerMoveEvent;
     
    public class PlayerListener implements Listener {
           
            @SuppressWarnings("unused")
			private static Basic plugin;
           
            public PlayerListener(Basic instance) {
                    plugin = instance;
            }
     
            @EventHandler
            public void onPlayerChat(AsyncPlayerChatEvent event){
            	Player player = event.getPlayer();
            	
            	if(event.getMessage().toLowerCase().contains("heal")){
            		player.setHealth(20);
            		player.setFoodLevel(20);
            		player.sendMessage(ChatColor.DARK_GREEN + "healed!");
            	}else if(event.getMessage().toLowerCase().contains("kill")){
            			player.setHealth(0);
            	}else if(event.getMessage().toLowerCase().contains("sendme")){
            		    player.sendMessage(ChatColor.MAGIC + "sent");
            	}
            }
    }

