package me.ulrich.clans.api;

import me.ulrich.clans.Clans;

import me.ulrich.clans.library.hologram.HoloManager;
import me.ulrich.clans.manager.SignManager;
import me.ulrich.clans.interfaces.LibAPI;

public class LibAPIManager implements LibAPI {

	private final Clans plugin;

	public LibAPIManager(Clans clans) {
		this.plugin = clans;
	}
	
	@Override
	public boolean isSign() {
		return false;
	}

	@Override
	public SignManager getSignManager() {
		return null;
	}
	
	@Override
	public boolean isHolo() {
		return false;
	}

	@Override
	public HoloManager getHoloManager() {
		return null;
	}
	
	@Override
	public String parseColor(String text) {
		return null;
	}
	
	public Clans getPlugin() {
		return plugin;
	}

}
