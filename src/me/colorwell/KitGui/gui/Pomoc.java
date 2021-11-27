package me.colorwell.KitGui.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.colorwell.KitGui.utils.Utils;

public class Pomoc {

	public static Inventory inv;
	public static String inventory_name;
	public static int inv_rows = 4 * 9;
	
	public static void initialize() {
		inventory_name = Utils.chat("&ePomoc");
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	

	
	public static Inventory GUIPom (Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);
		
		
		Utils.createItemByte(inv, 160, 15, 1, 1, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 2, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 3, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 4, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 5, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 6, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 7, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 8, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 9, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 10, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 11, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 12, "&8Puste Pole");	
		Utils.createItemByte(inv, 160, 15, 1, 13, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 14, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 15, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 16, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 17, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 18, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 19, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 20, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 21, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 22, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 23, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 24, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 25, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 26, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 27, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 28, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 29, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 30, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 31, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 32, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 33, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 34, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 35, "&8Puste Pole");
		Utils.createItem(inv, 46, 1 , 36, "&asiemano");
		toReturn.setContents(inv.getContents());
		return toReturn;
		
		
		
		
	}
	public static void clicked3(Player p, int slot, ItemStack clicked, Inventory inv) {
		
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&asiemano"))){
			p.closeInventory();
			p.sendMessage(Utils.chat("&aGratuluje dziala gui"));
		
		}
	
	}
	
	
}
