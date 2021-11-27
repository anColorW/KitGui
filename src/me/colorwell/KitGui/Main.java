package me.colorwell.KitGui;


import org.bukkit.plugin.java.JavaPlugin;



import me.colorwell.KitGui.commands.kity;
import me.colorwell.KitGui.commands.pomoc;
import me.colorwell.KitGui.commands.testcomand;
import me.colorwell.KitGui.gui.InneKity;
import me.colorwell.KitGui.gui.Pomoc;
import me.colorwell.KitGui.gui.TestUI;
import me.colorwell.KitGui.gui.Zestawy;
import me.colorwell.KitGui.listeners.InventoryClickListener;

public class Main extends JavaPlugin{
	

		
	
	
	
	@Override
	public void onEnable(){
		new testcomand(this);
		new kity(this);
		new pomoc(this);
	new InventoryClickListener(this);
	TestUI.initialize();
	Zestawy.initialized();
	InneKity.initialize();
	Pomoc.initialize();
	saveDefaultConfig();

	



}
}
