package me.timothy.Teams;

import java.util.logging.Logger;

import me.timothy.Teams.commands.ListTeams;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Teams extends JavaPlugin{
	
	public static Teams instance;
	
	public final Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		
		getCommand("lt").setExecutor(new ListTeams(this));
	}

}
