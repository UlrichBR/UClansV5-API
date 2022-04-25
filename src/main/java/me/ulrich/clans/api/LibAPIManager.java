package me.ulrich.clans.api;

import org.bukkit.Location;
import org.bukkit.command.SimpleCommandMap;
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
		return this.plugin.getLibManager().isSign();
	}

	@Override
	public SignManager getSignManager() {
		return this.plugin.getLibManager().getSignManager();
	}
	
	@Override
	public boolean isHolo() {
		return this.plugin.getLibManager().isHolo();
	}

	@Override
	public HoloManager getHoloManager() {
		return this.plugin.getLibManager().getHoloManager();
	}
	
	@Override
	public boolean createHolo(String id, Location loc, String[] lines, Object type) {
		return this.plugin.getLibManager().createHolo(id, loc, lines, type);
	}
	
	@Override
	public boolean hasHolo(String id) {
		return this.plugin.getLibManager().hasHolo(id);
	}
	
	@Override
	public HoloData getHolo(String id) {
		return this.plugin.getLibManager().getHolo(id);
	}
	
	@Override
	public boolean deleteHolo(String id) {
		return this.plugin.getLibManager().deleteHolo(id);
	}
	
	@Override
	public ItemStack removeNbtString(ItemStack itemStack,final String key) {
		return this.plugin.getLibManager().removeNbtString(itemStack, key);
    }
	@Override
	public ItemStack setNbt(ItemStack itemStack, final String key, final Object value) {
		return this.plugin.getLibManager().setNbt(itemStack, key, value);
    }
	@Override
	public boolean hasNbt(final ItemStack currentItem, final String name, final String nbts) {
		return this.plugin.getLibManager().hasNbt(currentItem, name, nbts);
    }
	@Override
	public String getNbtString(final ItemStack currentItem, final String name) {
		return this.plugin.getLibManager().getNbtString(currentItem, name);
    }
	@Override
	public int getNbtInteger(final ItemStack currentItem, final String name) {
		return this.plugin.getLibManager().getNbtInteger(currentItem, name);
    }
	
	@Override
	public String parseColor(String text) {
		return this.plugin.getLibManager().parseColor(text);
	}
	
	@Override
	public SimpleCommandMap getSimpleCommandMap(Clans plugin) {
		return this.plugin.getLibManager().getSimpleCommandMap(plugin);
	}
	
	public Clans getPlugin() {
		return plugin;
	}

}
