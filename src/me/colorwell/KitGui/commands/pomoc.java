package me.colorwell.KitGui.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.colorwell.KitGui.Main;
import me.colorwell.KitGui.gui.Pomoc;


public class pomoc implements CommandExecutor {

	public pomoc(Main plugin) {
		plugin.getCommand("pomoc2").setExecutor(this);
	}
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			
			return true;
		}
		
		Player p = (Player) sender;
			p.openInventory(Pomoc.GUIPom(p));
		
		return false;
	}

}
	
	

