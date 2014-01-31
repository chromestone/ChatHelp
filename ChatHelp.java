package com.gmail.absolutevanillahelp.ChatHelp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatHelp extends JavaPlugin {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equals("/say")) {
			getServer().broadcastMessage(args[0]);
			return true;
		}
		return false;
	}
}
