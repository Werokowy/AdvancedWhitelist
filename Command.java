package a;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class c implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		if(!sender.hasPermission("advwl.admin"))
		{
			Player p = (Player)sender;
			p.sendTitle("§cACCESS DENIED", "§cNO PERMISSION");
			sender.sendMessage("§cOdmowa dostępu");
			return false;
		}
		if(args.length==0)
		{
			sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
			sender.sendMessage(" ");
			sender.sendMessage("§c/whitelist §3<on/off> §f-§6 Wyłącza lub włącza whiteliste");
			sender.sendMessage(" ");
			sender.sendMessage("§cwhitelist add §3<nick> §f-§6 Dodaje gracza do whitelisty");
			sender.sendMessage(" ");
			sender.sendMessage("§cwhitelist remove §3<nick> §f-§6 Usuwa gracza z whitelisty");
			sender.sendMessage(" ");
			sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
			return false;
		}
		if(args.length==1)
		{
			if(args[0].equalsIgnoreCase("on"))
			{
				sender.sendMessage("§aPomyślnie włączono whiteliste!");
				a.b.getConfig().set("whitelist", true);
				return true;
			}
			if(args[0].equalsIgnoreCase("off"))
			{
				a.b.getConfig().set("whitelist", false);
				sender.sendMessage("§cPomyślnie wyłączono whiteliste!");
				return true;
			}
			sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
			sender.sendMessage(" ");
			sender.sendMessage("§c/whitelist §3<on/off> §f-§6 Wyłącza lub włącza whiteliste");
			sender.sendMessage(" ");
			sender.sendMessage("§cwhitelist add §3<nick> §f-§6 Dodaje gracza do whitelisty");
			sender.sendMessage(" ");
			sender.sendMessage("§cwhitelist remove §3<nick> §f-§6 Usuwa gracza z whitelisty");
			sender.sendMessage(" ");
			sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
			return false;
		}
		if(args.length==2)
		{
			if(args[0].equalsIgnoreCase("remove"))
			{
				sender.sendMessage("usun to w configu!");
				return true;
			}
			if(args[0].equalsIgnoreCase("add"))
			{
				sender.sendMessage("dodaj to w configu!");
				return true;
			}
			sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
			sender.sendMessage(" ");
			sender.sendMessage("§c/whitelist §3<on/off> §f-§6 Wyłącza lub włącza whiteliste");
			sender.sendMessage(" ");
			sender.sendMessage("§cwhitelist add §3<nick> §f-§6 Dodaje gracza do whitelisty");
			sender.sendMessage(" ");
			sender.sendMessage("§cwhitelist remove §3<nick> §f-§6 Usuwa gracza z whitelisty");
			sender.sendMessage(" ");
			sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
			return false;
		}
		sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
		sender.sendMessage(" ");
		sender.sendMessage("§c/whitelist §3<on/off> §f-§6 Wyłącza lub włącza whiteliste");
		sender.sendMessage(" ");
		sender.sendMessage("§cwhitelist add §3<nick> §f-§6 Dodaje gracza do whitelisty");
		sender.sendMessage(" ");
		sender.sendMessage("§cwhitelist remove §3<nick> §f-§6 Usuwa gracza z whitelisty");
		sender.sendMessage(" ");
		sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
		return false;
	}

	

}
