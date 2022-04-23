package me.ulrich.clans.packets.interfaces;

import me.ulrich.clans.library.hologram.HoloManager;
import me.ulrich.clans.manager.SignManager;

public interface LibAPI {

	boolean isSign();

	SignManager getSignManager();

	boolean isHolo();

	HoloManager getHoloManager();

	String parseColor(String text);

}
