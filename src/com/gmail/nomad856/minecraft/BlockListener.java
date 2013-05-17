	

    package com.gmail.nomad856.minecraft;
     
    import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockPlaceEvent;
     
     
    public class BlockListener implements Listener {
     
    public BlockListener(Basic instance) {
                    plugin = instance;
            }       
    public static Basic plugin;
    public static Material[] blacklist = {Material.TNT, Material.BEDROCK};
            
            
     
   
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event){
    	Material block = event.getBlock().getType();
    	Player player = event.getPlayer();
    	
    	for(Material blocked : blacklist){
    		if(blocked == block){
    		if(player.isOp()){}else{
    			event.getBlock().setType(Material.AIR);
    			player.chat("I JUST PLACED" + blocked);
    		}
    	}
    }
    }
    }
