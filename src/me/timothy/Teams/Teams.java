package me.timothy.Teams;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import me.timothy.Teams.commands.ListTeams;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Teams extends JavaPlugin{
	
	public static Teams instance;
	
	public SettingsManager sm = SettingsManager.getInstance();
	
	public final Logger log = Logger.getLogger("Minecraft");
	public MySql sql = new MySql();
	
	
	public void onEnable() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		
		getCommand("lt").setExecutor(new ListTeams(this));
		
		ResultSet query = sql.query("SELECT 1 FROM settings WHERE id<>1").result();
		try {
			if(query.next()){
				
			}else{
				//create table
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
