package me.ksio.partychat;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.ksio.partychat.commands.PartyCommand;



public class Main extends JavaPlugin{

	List<Party> parties;
	public void onEnable() {
		parties = new ArrayList<Party>();
		this.getCommand("party").setExecutor(new PartyCommand());
		Bukkit.getLogger().info("Successfully enabled " + getDescription().getName() + " v" + getDescription().getVersion());
	}
	public void onDisable() {
		Bukkit.getLogger().info("Successfully disabled " + getDescription().getName() + " v" + getDescription().getVersion());
	}
}
