package me.colorwell.KitGui.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.colorwell.KitGui.utils.Utils;

public class TestUI {
	

	public static Inventory inv;
	public static String inventory_name;
	public static int inv_rows = 3 * 9;
	
	public static void initialize() {
		inventory_name = Utils.chat("");
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	

	
	public static Inventory GUI (Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);
		
		
		Utils.createItemByte(inv, 160, 15, 1, 1, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 2, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 3, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 4, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 6, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 7, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 8, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 9, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 10, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 11, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 15, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 13, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 15, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 5, "&8Puste Pole");
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
		
		
		
		if(p.hasPermission("sponsor.sponsor")){
			Utils.createItem(inv, 310, 1 , 16, "&cS&eP&bO&5N&2S&1O&cR", "&7Kliknij aby sprawdzic informacje na temat rangi &cS&eP&bO&5N&2S&1O&cR", "&7Posiadasz range Sponsor &a&l✔");
			Utils.createItem(inv, 314, 1 , 14, "&bSVIP", "&7Kliknij aby sprawdzic informacje na temat rangi &bSVIP", "&7Posiadasz range SVIP &a&l✔");
			Utils.createItem(inv, 306, 1 , 12, "&eVIP", "&7Kliknij aby sprawdzic informacje na temat rangi &eVIP", "&7Posiadasz range vip &a&l✔");
		} else {
			if(p.hasPermission("svip.svip")) {
				Utils.createItem(inv, 310, 1 , 16, "&cS&eP&bO&5N&2S&1O&cR", "&7Kliknij aby sprawdzic informacje na temat rangi &cS&eP&bO&5N&2S&1O&cR", "&7Posiadasz range Sponsor &c&l✘");
				Utils.createItem(inv, 314, 1 , 14, "&bSVIP", "&7Kliknij aby sprawdzic informacje na temat rangi &bSVIP", "&7Posiadasz range SVIP &a&l✔");
				Utils.createItem(inv, 306, 1 , 12, "&eVIP", "&7Kliknij aby sprawdzic informacje na temat rangi &eVIP", "&7Posiadasz range vip &a&l✔");
			}else {
				if(p.hasPermission("vip.vip")) {
					Utils.createItem(inv, 310, 1 , 16, "&cS&eP&bO&5N&2S&1O&cR", "&7Kliknij aby sprawdzic informacje na temat rangi &cS&eP&bO&5N&2S&1O&cR", "&7Posiadasz range Sponsor &c&l✘");
					Utils.createItem(inv, 314, 1 , 14, "&bSVIP", "&7Kliknij aby sprawdzic informacje na temat rangi &bSVIP", "&7Posiadasz range SVIP &c&l✘");
					Utils.createItem(inv, 306, 1 , 12, "&eVIP", "&7Kliknij aby sprawdzic informacje na temat rangi &eVIP", "&7Posiadasz range vip &a&l✔");
				} else {
					Utils.createItem(inv, 306, 1 , 12, "&eVIP", "&7Kliknij aby sprawdzic informacje na temat rangi &eVIP", "&7Posiadasz range vip &c&l✘");
					Utils.createItem(inv, 314, 1 , 14, "&bSVIP", "&7Kliknij aby sprawdzic informacje na temat rangi &bSVIP", "&7Posiadasz range SVIP &c&l✘");
					Utils.createItem(inv, 310, 1 , 16, "&cS&eP&bO&5N&2S&1O&cR", "&7Kliknij aby sprawdzic informacje na temat rangi &cS&eP&bO&5N&2S&1O&cR", "&7Posiadasz range Sponsor &c&l✘");
				}
			}
		} 
		
		
	
		
		toReturn.setContents(inv.getContents());
		return toReturn;
		
		
	}
	
	public static Inventory GUIV (Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);
		
			
			Utils.createItemByte(inv, 160, 15, 1, 1, "&8Puste Pole");
			Utils.createItemByte(inv, 160, 15, 1, 2, "&8Puste Pole");
			Utils.createItemByte(inv, 160, 15, 1, 3, "&8Puste Pole");
			Utils.createItemByte(inv, 160, 15, 1, 4, "&8Puste Pole");
			Utils.createItemByte(inv, 160, 15, 1, 6, "&8Puste Pole");
			Utils.createItemByte(inv, 160, 15, 1, 7, "&8Puste Pole");
			Utils.createItemByte(inv, 160, 15, 1, 8, "&8Puste Pole");
			Utils.createItemByte(inv, 160, 15, 1, 9, "&8Puste Pole");
			Utils.createItemByte(inv, 160, 15, 1, 10, "&8Puste Pole");
			Utils.createItemByte(inv, 160, 15, 1, 11, "&8Puste Pole");
			Utils.createItemByte(inv, 160, 15, 1, 12, "&8Puste Pole");
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
			
			Utils.createItem(inv, 340, 1 , 5, "&6&lInformacje", "&7Posiada specjalne powitanie" , "" ,  "&7VIP na 7 dni koszt x zl", "&7VIP na 14 dni koszt x zl", "&7VIP na 30 dni koszt x zl", "&7Range zakupisz na stronie https://xyz.pl");
			Utils.createItem(inv, 307, 1 , 13, "&6Zestawy", "&e/kit vip", "&7 - Posiada diamentowa zbroje 4/3", "&7 - Miecz 5/2, Kilof 4/3, oraz siekiere 5/3","&7 - 1 koxa oraz 4 refile");
			Utils.createItem(inv, 371, 1 , 14, "&6Nick", "&7Twoj nick zmieni sie na &7[&eVIP&7]&e " + p.getDisplayName() );
			Utils.createItem(inv, 323, 1, 15, "&6Komendy", "&7 - /repair", "&7 - /enderchest,");
			
			Utils.createItem(inv, 166, 1, 27, "&cPowrot");
			
			
			
			toReturn.setContents(inv.getContents());
			return toReturn;
			
			
		}
	public static Inventory GUISV (Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);
		
		Utils.createItemByte(inv, 160, 15, 1, 1, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 2, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 3, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 4, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 6, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 7, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 8, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 9, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 10, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 11, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 12, "&8Puste Pole");
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

		
		
			
			Utils.createItem(inv, 340, 1 , 5, "&6&lInformacje", "&7Posiada specjalne powitanie", "&7Zmniejszone itemy na gildie", "" , "&7SVIP na 7 dni koszt x zl", "&7SVIP na 14 dni koszt x zl", "&7SVIP na 30 dni koszt x zl", "&7Range zakupisz na stronie https://xyz.pl");
			Utils.createItem(inv, 315, 1 , 13, "&6Zestawy", "&b/kit svip", "&7 - Posiada diamentowa zbroje 4/3", "&7 - Miecz 5/2, Kilof 5/3/3, oraz siekiere 5/3","&7 - 2 koxy oraz 5 refili", "&e/kit vip", "&7 - Posiada diamentowa zbroje 4/3", "&7 - Miecz 5/2, Kilof 4/3, oraz siekiere 5/3","&7 - 1 koxa oraz 4 refile");
			Utils.createItemByte(inv, 351, 12,  1 , 14, "&6Nick", "&7Twoj nick zmieni sie na &7[&bSVIP&7] &b " + p.getDisplayName() );
			Utils.createItem(inv, 323, 1, 15, "&6Komendy", "&7 - /repair", "&7 - /repair all" , "&7 - /enderchest");
			
			Utils.createItem(inv, 166, 1, 27, "&cPowrot");
			
			
			
			toReturn.setContents(inv.getContents());
			return toReturn;
			
			
		}
	
	public static Inventory GUISP (Player p) {
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);
		
		Utils.createItemByte(inv, 160, 15, 1, 1, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 2, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 3, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 4, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 6, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 7, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 8, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 9, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 10, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 11, "&8Puste Pole");
		Utils.createItemByte(inv, 160, 15, 1, 12, "&8Puste Pole");
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

		
		
			
			Utils.createItem(inv, 340, 1 , 5, "&6&lInformacje", "&7Posiada specjalne powitanie", "&7Zmniejszone itemy na gildie", "" , "&7SVIP na 7 dni koszt x zl", "&7SVIP na 14 dni koszt x zl", "&7SVIP na 30 dni koszt x zl", "&7Range zakupisz na stronie https://xyz.pl");
			Utils.createItem(inv, 311, 1 , 13, "&6Zestawy", "&7/kit &cS&eP&bO&5N&2S&1O&cR", "&7 - Posiada dwie diamentowe zbroje 4/3", "&7 - Miecz 5/2, Knock 3, Kilof 6/3/3", "&7 - 4 koxy i 8 refili" ,  "&7/kit &bsvip", "&7 - Posiada diamentowa zbroje 4/3", "&7 - Miecz 5/2, Kilof 5/3/3, oraz siekiere 5/3","&7 - 2 koxy oraz 5 refili", "&7/kit &evip", "&7 - Posiada diamentowa zbroje 4/3", "&7 - Miecz 5/2, Kilof 4/3, oraz siekiere 5/3","&7 - 1 koxa oraz 4 refile");
			Utils.createItemByte(inv, 351, 12,  1 , 14, "&6Nick", "&7Twoj nick zmieni sie na &7[&cS&eP&bO&5N&2S&1O&cR&7] " + p.getDisplayName() );
			Utils.createItem(inv, 323, 1, 15, "&6Komendy", "&7 - /repair", "&7 - /repair all" , "&7 - /enderchest");
			
			Utils.createItem(inv, 166, 1, 27, "&cPowrot");
			
			
			
			toReturn.setContents(inv.getContents());
			return toReturn;
			
			
		}
	
	
	
	public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv) {
		
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&eVIP"))) {
			p.openInventory(TestUI.GUIV(p));
			
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&bSVIP"))) {
			p.openInventory(TestUI.GUISV(p));
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&cS&eP&bO&5N&2S&1O&cR"))) {
			p.openInventory(TestUI.GUISP(p));
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&8Puste Pole"))) {
			p.closeInventory();
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&cPowrot"))) {
			p.openInventory(TestUI.GUI(p));
		}	
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&3Jasne pole"))) {
			 ItemStack testEnchant = new ItemStack (Material.BOW, 1);
			 ItemMeta testEnchantMeta = testEnchant.getItemMeta();
			 testEnchantMeta.addEnchant(Enchantment.ARROW_FIRE, 10, true);
			 testEnchant.setItemMeta(testEnchantMeta);
			 p.getInventory().addItem(testEnchant);
			 
		}
		
	}
}


	
	
