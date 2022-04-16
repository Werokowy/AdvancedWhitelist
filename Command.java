package a;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class c implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
		if(!sender.hasPermission(a.b.getConfig().getString("permission")))
		{
			Player p = (Player)sender;
			if(!a.isPolishVersion())
			{
				p.sendTitle("§cACCESS DENIED", "§cNO PERMISSION");
				return false;
			}
			else {
				p.sendTitle("§cODMOWA DOSTĘPU", "§cBRAK PERMISJI");
				return false;
			}
		}
		if(args.length==0)
		{
			if(a.isPolishVersion())
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
			else {
				sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
				sender.sendMessage(" ");
				sender.sendMessage("§c/whitelist §3<on/off> §f-§6 Turns on or off whitelist");
				sender.sendMessage(" ");
				sender.sendMessage("§cwhitelist add §3<nick> §f-§6 Add player to whitelist");
				sender.sendMessage(" ");
				sender.sendMessage("§cwhitelist remove §3<nick> §f-§6 Remove player from whitelist");
				sender.sendMessage(" ");
				sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
				return false;
			}
		}
		if(args.length==1)
		{
			if(args[0].equalsIgnoreCase("on"))
			{
				
				a.b.getConfig().set("whitelist", true);
				if(a.isPolishVersion())
				{
					sender.sendMessage("§cPomyślnie włączono whiteliste!");
					return true;
				}
				else {
					sender.sendMessage("§cSuccessfully enabled whitelist!");
					return true;
				}
			}
			if(args[0].equalsIgnoreCase("off"))
			{
				a.b.getConfig().set("whitelist", false);
				if(a.isPolishVersion())
				{
					sender.sendMessage("§cPomyślnie wyłączono whiteliste!");
					return true;
				}
				else {
					sender.sendMessage("§cSuccessfully disabled whitelist!");
					return true;
				}
			}
			if(a.isPolishVersion())
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
			else {
				sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
				sender.sendMessage(" ");
				sender.sendMessage("§c/whitelist §3<on/off> §f-§6 Turns on or off whitelist");
				sender.sendMessage(" ");
				sender.sendMessage("§cwhitelist add §3<nick> §f-§6 Add player to whitelist");
				sender.sendMessage(" ");
				sender.sendMessage("§cwhitelist remove §3<nick> §f-§6 Remove player from whitelist");
				sender.sendMessage(" ");
				sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
				return false;
			}
		}
		if(args.length==2)
		{
			if(args[0].equalsIgnoreCase("add"))
			{
				if(a.isPolishVersion())
				{
					List<String> templist = a.b.getConfig().getStringList("whitelisted");
					templist.add(args[1]);
					a.b.getConfig().set("whitelisted", templist);
					sender.sendMessage("§aPomyślnie dodano gracza "+args[1]+" do whitelisty!");
					return true;
				}
				sender.sendMessage("§aSuccessfully added "+args[1]+" to the whitelisted players!");
				
				return true;
			}
			if(args[0].equalsIgnoreCase("remove"))
			{
				if(a.isPolishVersion())
				{
					List<String> templist = a.b.getConfig().getStringList("whitelisted");
					templist.remove(args[1]);
					a.b.getConfig().set("whitelisted", templist);
					sender.sendMessage("§aPomyślnie usunięto gracza "+args[1]+" z configu!");
					return true;
				}
				List<String> templist = a.b.getConfig().getStringList("whitelisted");
				templist.remove(args[1]);
				a.b.getConfig().set("whitelisted", templist);
				sender.sendMessage("§aSuccessfully removed "+args[1]+" from the whitelist!");
				return true;
			}
			if(a.isPolishVersion())
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
			else {
				sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
				sender.sendMessage(" ");
				sender.sendMessage("§c/whitelist §3<on/off> §f-§6 Turns on or off whitelist");
				sender.sendMessage(" ");
				sender.sendMessage("§cwhitelist add §3<nick> §f-§6 Add player to whitelist");
				sender.sendMessage(" ");
				sender.sendMessage("§cwhitelist remove §3<nick> §f-§6 Remove player from whitelist");
				sender.sendMessage(" ");
				sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
				return false;
			}
		}
		if(a.isPolishVersion())
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
		else {
			sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
			sender.sendMessage(" ");
			sender.sendMessage("§c/whitelist §3<on/off> §f-§6 Turns on or off whitelist");
			sender.sendMessage(" ");
			sender.sendMessage("§cwhitelist add §3<nick> §f-§6 Add player to whitelist");
			sender.sendMessage(" ");
			sender.sendMessage("§cwhitelist remove §3<nick> §f-§6 Remove player from whitelist");
			sender.sendMessage(" ");
			sender.sendMessage("§7§l§m===============§c§lAdvancedWhitelist§7§l§m===============");
			return false;
		}
	}

	

}
