package net.poweredbyhate.verysmallpets;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class VerySmallPets extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		// Plugin startup logic
		this.getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}
}
