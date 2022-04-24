package me.ulrich.clans.interfaces;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.library.hologram.HoloData;
import me.ulrich.clans.library.hologram.HoloManager;
import me.ulrich.clans.manager.SignManager;

public interface LibAPI {

	boolean isSign();

	SignManager getSignManager();

	boolean isHolo();

	HoloManager getHoloManager();

	String parseColor(String text);

	boolean createHolo(String id, Location loc, String[] lines, Object type);

	boolean hasHolo(String id);

	boolean deleteHolo(String id);

	HoloData getHolo(String id);

	ItemStack removeNbtString(ItemStack itemStack, String key);

	ItemStack setNbt(ItemStack itemStack, String key, Object value);

	boolean hasNbt(ItemStack currentItem, String name, String nbts);

	String getNbtString(ItemStack currentItem, String name);

	int getNbtInteger(ItemStack currentItem, String name);

}
