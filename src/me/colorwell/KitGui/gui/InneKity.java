package me.colorwell.KitGui.gui;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.colorwell.KitGui.utils.Utils;

public class InneKity {
	public static HashMap<String, Long> cooldowng = new HashMap<>();
	public static HashMap<String, Long> cooldownv = new HashMap<>();

	public static HashMap<String, Long> cooldownsv = new HashMap<>();
	
	
	
	public static Inventory inv;
	public static String inventory_name;
	public static int inv_rows = 3 * 9;
	
	public static void initialize() {
		inventory_name = Utils.chat("&4Inne");
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	

	
	public static Inventory GUIInne (Player p) {
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
		
		
		
		
		Utils.createItem(inv, 130, 1 , 12, "&1EnderChest", "&7Kliknij aby otrzymac zestaw &1&lEnderChest");
		
		
		if(p.hasPermission("svip.svip")) {
		Utils.createItem(inv, 46, 1 , 14, "&4TNT", "&7Kliknij aby otrzymac zestaw &4&lTNT");
		} else  {
			if (p.hasPermission("sponsor.sponsor")){
				Utils.createItem(inv, 46, 1 , 14, "&4TNT", "&7Kliknij aby otrzymac zestaw &4&lTNT");
			} else {
				Utils.createItemByte(inv, 160, 15, 1, 14, "&8Puste Pole");
			}
		}  
		
		
		
		Utils.createItem(inv, 366, 1 , 16, "&7Jedzenie", "&7Kliknij aby otrzymac zestaw &1&lJedzenie");
		
		
		toReturn.setContents(inv.getContents());
		return toReturn;
		
		
	}
	
	
	
	
	public static void clicked2(Player p, int slot, ItemStack clicked, Inventory inv) {
		
if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&1EnderChest"))){
			
			
			long jetztg = System.currentTimeMillis();
            
            if(cooldowng.containsKey(p.getName())){
                long beg = cooldowng.get(p.getName());
                
                int restg = (int) ((beg + (1500*60*60)) - jetztg);
                
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
            	p.sendMessage(Utils.chat("§aPomyslnie odebrales zestaw " + "&1&lEnderChest"));
                cooldowng.put(p.getName(), jetztg);
                p.getInventory().addItem(new ItemStack(Material.ENDER_CHEST, 1)); 
                
            }
			}

if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4TNT"))){
	
	
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
    	p.sendMessage(Utils.chat("§aPomyslnie odebrales zestaw " + "&4&lTNT"));
        cooldownv.put(p.getName(), jetztv);
        
        p.getInventory().addItem(new ItemStack(Material.TNT, 64));
        
    }
	}
if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7Jedzenie"))){
	
	
	long jetztsv = System.currentTimeMillis();
    
    if(cooldownsv.containsKey(p.getName())){
        long besv = cooldownsv.get(p.getName());
        
        int restsv = (int) ((besv + (1000*60*60)) - jetztsv);
        
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
    	p.sendMessage(Utils.chat("§aPomyslnie odebrales zestaw " + "&7Jedzenie"));
        cooldownsv.put(p.getName(), jetztsv);
        
        p.getInventory().addItem(new ItemStack(Material.COOKED_CHICKEN, 64));
        
        
        
    }
    
	
	}



		
		
		
	}
}


	
	
