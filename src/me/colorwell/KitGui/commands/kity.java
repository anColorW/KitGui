package me.colorwell.KitGui.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.colorwell.KitGui.Main;
import me.colorwell.KitGui.gui.Zestawy;

public class kity implements CommandExecutor{

	public kity(Main plugin) {
		plugin.getCommand("kity").setExecutor(this);
	}
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			
			return true;
		}
		
		Player p = (Player) sender;
			p.openInventory(Zestawy.GUI1(p));
		
		return false;
	}

}

	
	

