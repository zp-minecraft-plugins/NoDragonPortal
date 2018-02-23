package me.zackpollard.nodragonportal;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class NoDragonPortal extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public void onDisable() {
		this.logger.info("NoDragonPortal v0.1 is now disabled.");
	}
	public void onEnable() {
		
		new MyPortalListener(this);
		
		this.logger.info("NoDragonPortal v0.1 is now enabled.");
		
	}
}