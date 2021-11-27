package me.colorwell.KitGui.gui;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.colorwell.KitGui.utils.Utils;


public class Zestawy {

	
	
	
	
	
	public static HashMap<String, Long> cooldowng = new HashMap<>();
	public static HashMap<String, Long> cooldownv = new HashMap<>();
	public static HashMap<String, Long> cooldownsv = new HashMap<>();
	public static HashMap<String, Long> cooldownsp = new HashMap<>();
	
	

	public static Inventory inv1;
	public static String inventory_name1;
	public static int inv_rows1 = 4 * 9;
	
	
	public static void initialized() {
		inventory_name1 = Utils.chat("&bZestawy");
		
		inv1 = Bukkit.createInventory(null, inv_rows1);
	}
	


	
	
	
	
	
	

	
	public static Inventory GUI1 (Player p) {
		 Inventory toReturn = Bukkit.createInventory(null, inv_rows1, inventory_name1);
		 
		 
				
		if(p.hasPermission("sponsor.sponsor")) {
			Utils.createItemByte(inv1, 160, 15, 1, 1, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 2, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 3, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 4, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 5, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 6, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 7, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 8, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 9, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 10, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 12, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 14, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 16, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 17, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 18, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 19, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 20, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 21, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 22, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 23, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 24, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 25, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 26, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 27, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 28, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 29, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 30, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 31, "&8Puste Pole");
			Utils.createItem(inv1, 331,  1, 32, "&4Inne");
			Utils.createItemByte(inv1, 160, 15, 1, 33, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 34, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 35, "&8Puste Pole");
			Utils.createItemByte(inv1, 160, 15, 1, 36, "&8Puste Pole");
			
			
			Utils.createItem(inv1, 311, 1, 17, "&6Zestaw &cS&eP&bO&5N&2S&1O&cR");
			Utils.createItem(inv1, 315, 1, 15, "&6Zestaw &bSVIP");
			Utils.createItem(inv1, 307, 1, 13, "&6Zestaw &eVIP");
			Utils.createItem(inv1, 303, 1, 11, "&6Zestaw &7Gracz");
		} else {
			if(p.hasPermission("svip.svip")) {
				Utils.createItemByte(inv1, 160, 15, 1, 1, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 2, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 3, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 4, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 5, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 6, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 7, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 8, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 9, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 10, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 11, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 13, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 15, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 17, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 18, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 19, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 20, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 21, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 22, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 23, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 24, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 25, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 26, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 27, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 28, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 29, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 30, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 31, "&8Puste Pole");
				Utils.createItem(inv1, 331,  1, 32, "&4Inne");
				Utils.createItemByte(inv1, 160, 15, 1, 33, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 34, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 35, "&8Puste Pole");
				Utils.createItemByte(inv1, 160, 15, 1, 36, "&8Puste Pole");
				
				Utils.createItem(inv1, 315, 1, 16, "&6Zestaw &bSVIP");
				Utils.createItem(inv1, 307, 1, 14, "&6Zestaw &eVIP");
				Utils.createItem(inv1, 303, 1, 12, "&6Zestaw &7Gracz");
			} else {
				if(p.hasPermission("vip.vip")  ) {
					Utils.createItemByte(inv1, 160, 15, 1, 1, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 2, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 3, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 4, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 5, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 6, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 7, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 8, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 9, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 10, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 11, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 12, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 14, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 16, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 17, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 18, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 19, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 20, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 21, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 22, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 23, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 24, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 25, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 26, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 27, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 28, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 29, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 30, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 31, "&8Puste Pole");
					Utils.createItem(inv1, 331,  1, 32, "&4Inne");
					Utils.createItemByte(inv1, 160, 15, 1, 33, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 34, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 35, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 36, "&8Puste Pole");
					
					Utils.createItem(inv1, 307, 1, 15, "&6Zestaw &eVIP");
					Utils.createItem(inv1, 303, 1, 13, "&6Zestaw &7Gracz");
				} else {
					Utils.createItemByte(inv1, 160, 15, 1, 1, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 2, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 3, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 4, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 5, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 6, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 7, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 8, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 9, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 10, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 11, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 12, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 13, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 15, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 16, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 17, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 18, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 19, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 20, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 21, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 22, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 23, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 24, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 25, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 26, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 27, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 28, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 29, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 30, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 31, "&8Puste Pole");
					Utils.createItem(inv1, 331,  1, 32, "&4Inne");
					Utils.createItemByte(inv1, 160, 15, 1, 33, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 34, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 35, "&8Puste Pole");
					Utils.createItemByte(inv1, 160, 15, 1, 36, "&8Puste Pole");
					
					Utils.createItem(inv1, 303, 1, 14, "&6Zestaw &7Gracz");
				}
			}
		}
		toReturn.setContents(inv1.getContents());
		return toReturn;	
	}
	
	
	
		
			
	
	
  	 
	
	
public static void clicket(Player p, int slot, ItemStack clicked, Inventory inv1) {
	
	if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4Inne"))) {
    	
		
		
		
    		p.openInventory(InneKity.GUIInne(p));
    	
    		
    	
    	
    	
    }
	
	
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&6Zestaw &7Gracz"))){
			
			
			long jetztg = System.currentTimeMillis();
            
            if(cooldowng.containsKey(p.getName())){
                long beg = cooldowng.get(p.getName());
                
                int restg = (int) ((beg + (1000*60*60)) - jetztg);
                
                if(restg > 0){
                    int godzinag = restg/1000/60/60;
                    restg = restg-(godzinag*1000*60*60);
                    int minutag = restg/1000/60;
                    restg = restg-(minutag*1000*60);
                    int sekundag = restg/1000;
                    
                    p.sendMessage("§cMusisz odczekac jeszcze "+godzinag+(godzinag == 1 ? " godziny " : " godzin ")  +minutag+(minutag == 1 ? " minuty " : " minut ") +
                            +sekundag+(sekundag == 1 ? " sekundy " : " sekund ") + " przed nastepnym uzyciem zestawu.");
                   
                }
                
            } else {
            	
            	
            	
            	p.sendMessage(Utils.chat("§aPomyslnie odebrales zestaw " + "&7GRACZ"));
                cooldowng.put(p.getName(), jetztg);
                
                p.getInventory().addItem(new ItemStack(Material.IRON_PICKAXE, 1));
				p.getInventory().addItem(new ItemStack(Material.WOOD, 32));
				p.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 32));
            }
            
			
			}
		
		
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&6Zestaw &eVIP"))){
			
			 
			 long jetztv = System.currentTimeMillis();
	            
	            if(cooldownv.containsKey(p.getName())){
	                long bev = cooldownv.get(p.getName());
	                
	                int restv = (int) ((bev + (6*1000*60*60)) - jetztv);
	                
	                if(restv > 0){
	                    int godzinav = restv/1000/60/60;
	                    restv = restv-(godzinav*1000*60*60);
	                    int minutav = restv/1000/60;
	                    restv = restv-(minutav*1000*60);
	                    int sekundav = restv/1000;
	                    
	                    p.sendMessage("§cMusisz odczekac jeszcze "+godzinav+(godzinav == 1 ? " godziny " : " godzin ")  +minutav+(minutav == 1 ? " minuty " : " minut ") +
	                            +sekundav+(sekundav == 1 ? " sekundy " : " sekund ") + " przed nastepnym uzyciem zestawu.");
	                   
	                }
	                
	            } else {
	            	p.closeInventory();
	            	p.sendMessage("§aPomyslnie odebrales zestaw " + ChatColor.GOLD + "VIP");
	                cooldownv.put(p.getName(), jetztv);
	                
	                ItemStack miecz = new ItemStack(Material.DIAMOND_SWORD, 1);
	                miecz.addEnchantment(Enchantment.DAMAGE_ALL, 4);
	                miecz.addEnchantment(Enchantment.DURABILITY, 1);
	                ItemMeta mieczm = (ItemMeta) miecz.getItemMeta();
	                mieczm.setDisplayName(ChatColor.GOLD + "VIP");
	                miecz.setItemMeta(mieczm);
	                p.getInventory().addItem(miecz);
	                
	                ItemStack mieczk = new ItemStack(Material.IRON_SWORD, 1);
	                mieczk.addEnchantment(Enchantment.KNOCKBACK, 1);
	                mieczk.addEnchantment(Enchantment.DURABILITY, 2);
	                ItemMeta mieczkm = (ItemMeta) mieczk.getItemMeta();
	                mieczkm.setDisplayName(ChatColor.GOLD + "VIP");
	                mieczk.setItemMeta(mieczkm);
	                p.getInventory().addItem(mieczk);
	                
	                ItemStack kilof = new ItemStack(Material.DIAMOND_PICKAXE, 1);
	                kilof.addEnchantment(Enchantment.DIG_SPEED, 3);
	                kilof.addEnchantment(Enchantment.DURABILITY, 1);
	                ItemMeta kilofm = (ItemMeta) kilof.getItemMeta();
	                kilofm.setDisplayName(ChatColor.GOLD + "VIP");
	                kilof.setItemMeta(kilofm);
	                p.getInventory().addItem(kilof);
	                
	                
	                
	                
	                
	                
	                ItemStack kask = new ItemStack(Material.DIAMOND_HELMET, 1);
	                kask.addEnchantment(Enchantment.DURABILITY, 1);
	                kask.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	                ItemMeta kaskm = (ItemMeta) kask.getItemMeta();
	                kaskm.setDisplayName(ChatColor.GOLD + "VIP");
	                kask.setItemMeta(kaskm);
	                p.getInventory().addItem(kask);
	                
	                ItemStack klata = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
	                klata.addEnchantment(Enchantment.DURABILITY, 1);
	                klata.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	                ItemMeta klatam = (ItemMeta) klata.getItemMeta();
	                klatam.setDisplayName(ChatColor.GOLD + "VIP");
	                klata.setItemMeta(klatam);
	                p.getInventory().addItem(klata);
	                
	                ItemStack spodnie = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
	                spodnie.addEnchantment(Enchantment.DURABILITY, 1);
	                spodnie.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	                ItemMeta spodniem = (ItemMeta) spodnie.getItemMeta();
	                spodniem.setDisplayName(ChatColor.GOLD + "VIP");
	                spodnie.setItemMeta(spodniem);
	                p.getInventory().addItem(spodnie);
	                
	                ItemStack buty = new ItemStack(Material.DIAMOND_BOOTS, 1);
	                buty.addEnchantment(Enchantment.DURABILITY, 1);
	                buty.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	                ItemMeta butym = (ItemMeta) buty.getItemMeta();
	                butym.setDisplayName(ChatColor.GOLD + "VIP");
	                buty.setItemMeta(butym);
	                p.getInventory().addItem(buty);
	                
	                
	                
	                
	            }
		}
			
	            if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&6Zestaw &bSVIP"))){
	            	
	            
					 long jetztsv = System.currentTimeMillis();
			            
			            if(cooldownsv.containsKey(p.getName())){
			                long besv = cooldownsv.get(p.getName());
			                
			                int restsv = (int) ((besv + (12*1000*60*60)) - jetztsv);
			                
			                if(restsv > 0){
			                    int godzinasv = restsv/1000/60/60;
			                    restsv = restsv-(godzinasv*1000*60*60);
			                    int minutasv = restsv/1000/60;
			                    restsv = restsv-(minutasv*1000*60);
			                    int sekundasv = restsv/1000;
			                    
			                    p.sendMessage("§cMusisz odczekac jeszcze "+godzinasv+(godzinasv == 1 ? " godziny " : " godzin ")  +minutasv+(minutasv == 1 ? " minuty " : " minut ") +
			                            +sekundasv+(sekundasv == 1 ? " sekundy " : " sekund ") + " przed nastepnym uzyciem zestawu.");
			                   
			                }
			                
			            } else {
		            	p.sendMessage("§aPomyslnie odebrales zestaw " + ChatColor.AQUA + "SVIP");
		            	cooldownsv.put(p.getName(), jetztsv);
		            	
		            	ItemStack mieczsv = new ItemStack(Material.DIAMOND_SWORD, 1);
		                mieczsv.addEnchantment(Enchantment.DAMAGE_ALL, 4);
		                mieczsv.addEnchantment(Enchantment.DURABILITY, 2);
		                ItemMeta mieczsvm = (ItemMeta) mieczsv.getItemMeta();
		                mieczsvm.setDisplayName(ChatColor.AQUA + "SVIP");
		                mieczsv.setItemMeta(mieczsvm);
		                p.getInventory().addItem(mieczsv);
		                
		                ItemStack mieczsvk = new ItemStack(Material.IRON_SWORD, 1);
		                mieczsvk.addEnchantment(Enchantment.KNOCKBACK, 2);
		                mieczsvk.addEnchantment(Enchantment.DURABILITY, 2);
		                ItemMeta mieczsvkm = (ItemMeta) mieczsvk.getItemMeta();
		                mieczsvkm.setDisplayName(ChatColor.AQUA + "SVIP");
		                mieczsvk.setItemMeta(mieczsvkm);
		                p.getInventory().addItem(mieczsvk);
		                
		                ItemStack kilofsv = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		                kilofsv.addEnchantment(Enchantment.DIG_SPEED, 5);
		                kilofsv.addEnchantment(Enchantment.DURABILITY, 1);
		                kilofsv.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 1);
		                ItemMeta kilofsvm = (ItemMeta) kilofsv.getItemMeta();
		                kilofsvm.setDisplayName(ChatColor.AQUA + "SVIP");
		                kilofsv.setItemMeta(kilofsvm);
		                p.getInventory().addItem(kilofsv);
		                
		                
		                
		                
		                
		                
		                ItemStack kasksv = new ItemStack(Material.DIAMOND_HELMET, 1);
		                kasksv.addEnchantment(Enchantment.DURABILITY, 1);
		                kasksv.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		                ItemMeta kasksvm = (ItemMeta) kasksv.getItemMeta();
		                kasksvm.setDisplayName(ChatColor.AQUA + "SVIP");
		                kasksv.setItemMeta(kasksvm);
		                p.getInventory().addItem(kasksv);
		                
		                ItemStack klatasv = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
		                klatasv.addEnchantment(Enchantment.DURABILITY, 1);
		                klatasv.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		                ItemMeta klatasvm = (ItemMeta) klatasv.getItemMeta();
		                klatasvm.setDisplayName(ChatColor.AQUA + "SVIP");
		                klatasv.setItemMeta(klatasvm);
		                p.getInventory().addItem(klatasv);
		                
		                ItemStack spodniesv = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
		                spodniesv.addEnchantment(Enchantment.DURABILITY, 1);
		                spodniesv.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		                ItemMeta spodniesvm = (ItemMeta) spodniesv.getItemMeta();
		                spodniesvm.setDisplayName(ChatColor.AQUA + "SVIP");
		                spodniesv.setItemMeta(spodniesvm);
		                p.getInventory().addItem(spodniesv);
		                
		                ItemStack butysv = new ItemStack(Material.DIAMOND_BOOTS, 1);
		                butysv.addEnchantment(Enchantment.DURABILITY, 1);
		                butysv.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		                ItemMeta butysvm = (ItemMeta) butysv.getItemMeta();
		                butysvm.setDisplayName(ChatColor.AQUA + "SVIP");
		                butysv.setItemMeta(butysvm);
		                p.getInventory().addItem(butysv);
		            }

	            } if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&6Zestaw &cS&eP&bO&5N&2S&1O&cR"))) {
	            	
	            	long jetztsp = System.currentTimeMillis();
		            
		            if(cooldownsp.containsKey(p.getName())){
		                long besp = cooldownsp.get(p.getName());
		                
		                int restsp = (int) ((besp + (24*1000*60*60)) - jetztsp);
		                
		                if(restsp > 0){
		                    int godzinasp = restsp/1000/60/60;
		                    restsp = restsp-(godzinasp*1000*60*60);
		                    int minutasp = restsp/1000/60;
		                    restsp = restsp-(minutasp*1000*60);
		                    int sekundasp = restsp/1000;
		                    
		                    p.sendMessage("§cMusisz odczekac jeszcze "+godzinasp+(godzinasp == 1 ? " godziny " : " godzin ") +minutasp+(minutasp == 1 ? " minuty " : " minut ") +
		                            +sekundasp+(sekundasp == 1 ? " sekundy " : " sekund ") + " przed nastepnym uzyciem zestawu.");
		                   
		                }
		                
		            } else {
	            	p.sendMessage(Utils.chat("&aPomyslnie odebrales zestaw &cS&eP&bO&5N&2S&1O&cR"));
	            	cooldownsp.put(p.getName(), jetztsp);
	            	
	            	ItemStack mieczsp = new ItemStack(Material.DIAMOND_SWORD, 1);
	                mieczsp.addEnchantment(Enchantment.DAMAGE_ALL, 5);
	                mieczsp.addEnchantment(Enchantment.DURABILITY, 2);
	                ItemMeta mieczspm = (ItemMeta) mieczsp.getItemMeta();
	                mieczspm.setDisplayName(Utils.chat("&cS&eP&bO&5N&2S&1O&cR"));
	                mieczsp.setItemMeta(mieczspm);
	                p.getInventory().addItem(mieczsp);
	                

	                
	                
	                ItemStack mieczspk = new ItemStack(Material.IRON_SWORD, 1);
	                mieczspk.addEnchantment(Enchantment.KNOCKBACK, 2);
	                mieczspk.addEnchantment(Enchantment.DURABILITY, 2);
	                ItemMeta mieczspkm = (ItemMeta) mieczspk.getItemMeta();
	                mieczspkm.setDisplayName(Utils.chat("&cS&eP&bO&5N&2S&1O&cR"));
	                mieczspk.setItemMeta(mieczspkm);
	                p.getInventory().addItem(mieczspk);
	                
	                ItemStack kilofsp = new ItemStack(Material.DIAMOND_PICKAXE, 1);
	                kilofsp.addEnchantment(Enchantment.DIG_SPEED, 5);
	                kilofsp.addEnchantment(Enchantment.DURABILITY, 1);
	                kilofsp.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 1);
	                ItemMeta kilofspm = (ItemMeta) kilofsp.getItemMeta();
	                kilofspm.setDisplayName(Utils.chat("&cS&eP&bO&5N&2S&1O&cR"));
	                kilofsp.setItemMeta(kilofspm);
	                p.getInventory().addItem(kilofsp);
	                
	                
	                
	                
	                
	                
	                ItemStack kasksp = new ItemStack(Material.DIAMOND_HELMET, 1);
	                kasksp.addEnchantment(Enchantment.DURABILITY, 1);
	                kasksp.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	                ItemMeta kaskspm = (ItemMeta) kasksp.getItemMeta();
	                kaskspm.setDisplayName(Utils.chat("&cS&eP&bO&5N&2S&1O&cR"));
	                kasksp.setItemMeta(kaskspm);
	                p.getInventory().addItem(kasksp);
	                
	                ItemStack klatasp = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
	                klatasp.addEnchantment(Enchantment.DURABILITY, 1);
	                klatasp.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	                ItemMeta klataspm = (ItemMeta) klatasp.getItemMeta();
	                klataspm.setDisplayName(Utils.chat("&cS&eP&bO&5N&2S&1O&cR"));
	                klatasp.setItemMeta(klataspm);
	                p.getInventory().addItem(klatasp);
	                
	                ItemStack spodniesp = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
	                spodniesp.addEnchantment(Enchantment.DURABILITY, 1);
	                spodniesp.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	                ItemMeta spodniespm = (ItemMeta) spodniesp.getItemMeta();
	                spodniespm.setDisplayName(Utils.chat("&cS&eP&bO&5N&2S&1O&cR"));
	                spodniesp.setItemMeta(spodniespm);
	                p.getInventory().addItem(spodniesp);
	                
	                ItemStack butysp = new ItemStack(Material.DIAMOND_BOOTS, 1);
	                butysp.addEnchantment(Enchantment.DURABILITY, 1);
	                butysp.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
	                ItemMeta butyspm = (ItemMeta) butysp.getItemMeta();
	                butyspm.setDisplayName(Utils.chat("&cS&eP&bO&5N&2S&1O&cR"));
	                butysp.setItemMeta(butyspm);
	                p.getInventory().addItem(butysp);
	            	
	            	
		            } 
	            	
	            	
	            	
	            	
	            	
	            }
	            	
	            }
	            
	            
}


	            
	            
		
		
		
		
		
		
		
		
		
	
	

