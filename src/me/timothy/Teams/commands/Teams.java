package me.timothy.Teams.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Teams implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable,
			String[] args) {
		if(args.length >= 1){
			if(args[0].equalsIgnoreCase("listTeams")){
				
			}
		}
		return false;
	}

}
