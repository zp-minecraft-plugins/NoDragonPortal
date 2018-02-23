package me.zackpollard.nodragonportal;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCreatePortalEvent;

public class MyPortalListener implements Listener {
	
	public static NoDragonPortal plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public MyPortalListener(NoDragonPortal instance){
		plugin = instance;
		Bukkit.getServer().getPluginManager().registerEvents(this,instance);
	}
	@EventHandler(ignoreCancelled = true)
	public void onEntityCreatePortal(EntityCreatePortalEvent event){
		
		if(event.getEntity() instanceof EnderDragon){
			
			event.setCancelled(true);
			
			logger.info("[NoDragonPortal] - A dragon tried to create a portal but it was blocked!");
			
		}
	}
}