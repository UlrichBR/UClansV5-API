package me.ulrich.clans.interfaces;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.Clans;

import me.ulrich.clans.manager.SignManager;

import me.ulrich.npc.EntityData;
import me.ulrich.npc.EntityManager;
import me.ulrich.npc.data.EntityLine;

public interface LibAPI {

	boolean isSign();

	SignManager getSignManager();

	boolean isEntity();

	EntityManager getEntityManager();
	
	String parseColor(String text);

	boolean createEntity(String id, Location loc, List<EntityLine> lines, Object type);

	boolean hasEntity(String id);

	boolean deleteEntity(String id);

	EntityData getEntity(String id);

	ItemStack removeNbtString(ItemStack itemStack, String key);

	ItemStack setNbt(ItemStack itemStack, String key, Object value);

	boolean hasNbt(ItemStack currentItem, String name, String nbts);

	String getNbtString(ItemStack currentItem, String name);

	int getNbtInteger(ItemStack currentItem, String name);

	SimpleCommandMap getSimpleCommandMap(Clans plugin);
	
	void sendTitle(Player p, String msg, int fadeIn, int stay, int fadeOut);

	void sendSubTitle(Player p, String msg, int fadeIn, int stay, int fadeOut);

	void sendTitleSubTitle(Player p, String msg, String msg2, int fadeIn, int stay, int fadeOut);

	void sendActionBar(Player p, String message);

	String getPluginTag();

	boolean isHoloEnabled();
	
	Hologram createHolo(final Location location, String id, Object extra);

}
