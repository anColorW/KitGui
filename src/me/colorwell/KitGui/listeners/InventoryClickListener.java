package me.colorwell.KitGui.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.colorwell.KitGui.Main;
import me.colorwell.KitGui.gui.InneKity;
import me.colorwell.KitGui.gui.Pomoc;
import me.colorwell.KitGui.gui.TestUI;
import me.colorwell.KitGui.gui.Zestawy;

public class InventoryClickListener implements Listener {
	

	

	public InventoryClickListener(Main plugin) {
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
	
		String title = e.getInventory().getTitle();
		if (title.equals(TestUI.inventory_name)) {
			e.setCancelled(true);
			if(e.getCurrentItem() == null) {
				return;
			}
		
		} if (title.equals(TestUI.inventory_name)) {
			TestUI.clicked((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
		}
	}
		
		

	
	@EventHandler
	public void onClick1(InventoryClickEvent e) {
		String title = e.getInventory().getTitle();
		if (title.equals(Zestawy.inventory_name1)) {
			e.setCancelled(true);
			if(e.getCurrentItem() == null) {
				return;
			}
			
		} if (title.equals(Zestawy.inventory_name1)) {
			Zestawy.clicket((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
		}
		
	}
	
	@EventHandler
	public void onClick2(InventoryClickEvent e) {
		String title = e.getInventory().getTitle();
		if (title.equals(InneKity.inventory_name)) {
			e.setCancelled(true);
			if(e.getCurrentItem() == null) {
				return;
			}
			
		} if (title.equals(InneKity.inventory_name)) {
			InneKity.clicked2((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
		}
		
	}
	@EventHandler
	public void onClick3(InventoryClickEvent e) {
		String title = e.getInventory().getTitle();
		if (title.equals(Pomoc.inventory_name)) {
			e.setCancelled(true);
			if(e.getCurrentItem() == null) {
				return;
			}
			
		} if (title.equals(Pomoc.inventory_name)) {
			Pomoc.clicked3((Player) e.getWhoClicked(), e.getSlot(), e.getCurrentItem(), e.getInventory());
		}
		
	}
	
}
	

		


