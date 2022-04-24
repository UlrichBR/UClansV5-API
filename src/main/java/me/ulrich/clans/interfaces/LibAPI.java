package me.ulrich.clans.interfaces;

import org.bukkit.Location;

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

}
