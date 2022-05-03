package me.ulrich.clans.api;

import java.util.HashMap;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.Addon;
import me.ulrich.clans.interfaces.AddonAPI;

public class AddonAPIManager implements AddonAPI {

	private final Clans plugin;
	private String defaultBanner = "ARMOR_STAND";

	public AddonAPIManager(Clans clans) {
		this.plugin = clans;
	}
  
	@Override
	public HashMap<Addon, Boolean> getAddonEnabledList(){
		return null;
	}
	
	@Override
	public Addon getAddon(String AddonName){
		return null;
	}

	@Override
	public String getDefaultBanner() {
		return null;
	}

	@Override
	public void setDefaultBanner(String defaultBanner) {}




}
