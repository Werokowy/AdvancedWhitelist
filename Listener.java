package a;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;

public class b implements Listener{
	
	@EventHandler
	public void c(PlayerLoginEvent d)
	{
		Player e = d.getPlayer();
		try {
			if(e.isOp()&&a.b.getConfig().getBoolean("operator-bypass"))
			{
				return;
			}
			if(e.hasPermission(a.b.getConfig().getString("bypasspermission")))
			{
				return;
			}
		}
		catch(Exception ex){
			Bukkit.getLogger().info("ERROR: "+ex.getMessage());
			Bukkit.getLogger().info("ERROR INFO: Report this error to spigot or github issuses!\nThis error informates is bypass permissions or operator bypass have errors");
			return;
		}
		PlayerLoginEvent.Result f = Result.KICK_WHITELIST;
		if(a.b.getConfig().getBoolean("whitelist")==true)
		{
			if(!a.b.getConfig().getStringList("whitelisted").contains(e.getName()))
			{
				d.setResult(f);
				List<String> g = a.b.getConfig().getStringList("whitelist-deny-screen");
				String h = "";
				for(int i = 0;i<g.size();i++)
				{
					h = h+g.get(i);
					h =h+"\n";
				}
				d.setKickMessage(h);
			}
		}
		
	}
	@EventHandler
    public void nazwa_moze_byc_dowolna(PlayerDeathEvent e){
       e.getEntity().getLastDamageCause().getEntity().getName();
    }
}
