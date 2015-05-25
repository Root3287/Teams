package me.timothy.Teams.commands;

import me.timothy.Teams.Teams;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ListTeams implements CommandExecutor{

	public Teams plugin;
	public ListTeams(Teams main){
		plugin = main;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String lable,
			String[] args) {
		if(lable.equalsIgnoreCase("lt")){
			
		}
		return false;
	}

}
