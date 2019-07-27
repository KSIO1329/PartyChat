package me.ksio.partychat;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;

public class Party {

	String name;
	UUID owner;
	int slots;
	List<UUID> members;
	String color;
	public Party(String name_, Player p, int slots_) {
		name = name_;
		owner = p.getUniqueId();
		slots = slots_;
		members = new ArrayList<UUID>();
	}
	public String getName() {
		return name;
	}
	@SuppressWarnings("unused")
	private void setName(String name_) {
		name = name_;
	}
	public void setColor(String color_) {
		color = color_;
	}
	public void addMember(Player p) {
		members.add(p.getUniqueId());
	}
	public void kickMember(Player p) {
		if (members.contains(p.getUniqueId()))
			members.remove(p.getUniqueId());
	}
	public int getFreeSlots() {
		return slots - 1 - members.size();
	}
	public boolean isMember(Player p) {
		return members.contains(p.getUniqueId());
	}
	public boolean isOwner(Player p) {
		return owner.equals(p.getUniqueId());
	}
}
