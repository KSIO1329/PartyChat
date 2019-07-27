package me.ksio.partychat.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PartyCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		if (sender instanceof Player)
			if (label.equalsIgnoreCase("party") || label.equalsIgnoreCase("pc")) {
				if (args.length == 0) {
					// display help
				}
				switch (args.length) {
					case 1:{
						switch(args[0]){
							case "create":{
								// bruh enter a name
								break;
							}
						}
						break;
					}
					case 2:{
						switch(args[0]){
						case "create":{
							//Party party = new Party(args[1], (Player) sender, 10);
							
							break;
						}
					}
					}
				}
			}
		return false;
	}

}
