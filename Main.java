package a;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class a extends JavaPlugin{
	public static a b;
	@Override
	public void onEnable() {
		saveDefaultConfig();
		b = this;
		Server d = Bukkit.getServer();
		d.getPluginManager().registerEvents(new b(), b);
		getCommand("whitelist").setExecutor(new c());
	}
	
}
