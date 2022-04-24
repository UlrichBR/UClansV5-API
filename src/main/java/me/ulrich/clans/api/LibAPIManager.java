package me.ulrich.clans.api;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.LibAPI;
import me.ulrich.clans.library.hologram.HoloData;
import me.ulrich.clans.library.hologram.HoloManager;
import me.ulrich.clans.manager.SignManager;

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
	public boolean createHolo(String id, Location loc, String[] lines, Object type) {
		return false;
	}
	
	@Override
	public boolean hasHolo(String id) {
		return false;
	}
	
	@Override
	public HoloData getHolo(String id) {
		return null;
	}
	
	@Override
	public boolean deleteHolo(String id) {
		return false;
	}
	
	@Override
	public String parseColor(String text) {
		return null;
	}
	
	public Clans getPlugin() {
		return plugin;
	}

	@Override
	public ItemStack removeNbtString(ItemStack itemStack, String key) {
		return null;
	}

	@Override
	public ItemStack setNbt(ItemStack itemStack, String key, Object value) {
		return null;
	}

	@Override
	public boolean hasNbt(ItemStack currentItem, String name, String nbts) {
		return false;
	}

	@Override
	public String getNbtString(ItemStack currentItem, String name) {
		return null;
	}

	@Override
	public int getNbtInteger(ItemStack currentItem, String name) {
		return 0;
	}

}
