package me.ulrich.clans.api;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.Hologram;
import me.ulrich.clans.interfaces.LibAPI;
import me.ulrich.clans.manager.SignManager;
import me.ulrich.npc.EntityData;
import me.ulrich.npc.EntityManager;
import me.ulrich.npc.data.EntityLine;

public class LibAPIManager implements LibAPI {

	private final Clans plugin;

	public LibAPIManager(Clans clans) {
		this.plugin = clans;
	}
	
	@Override
	public String getPluginTag() {
		return null;
	}
	
	@Override
	public void sendTitle(Player p, String msg, int fadeIn, int stay, int fadeOut) {
		
	}
	
	@Override
	public void sendSubTitle(Player p, String msg, int fadeIn, int stay, int fadeOut) {
		
	}
	
	@Override
	public void sendTitleSubTitle(Player p, String msg, String msg2, int fadeIn, int stay, int fadeOut) {
		
	}
	
	@Override
	public void sendActionBar(Player p, String message) {
		
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
	public boolean isEntity() {
		return false;
	}

	@Override
	public EntityManager getEntityManager() {
		return null;
	}
	
	@Override
	public boolean createEntity(String id, Location loc, List<EntityLine> lines, Object type) {
		return false;
	}
	
	@Override
	public boolean hasEntity(String id) {
		return false;
	}
	
	@Override
	public EntityData getEntity(String id) {
		return null;
	}
	
	@Override
	public boolean deleteEntity(String id) {
		return false;
	}
	
	@Override
	public ItemStack removeNbtString(ItemStack itemStack,final String key) {
		return null;
    }
	@Override
	public ItemStack setNbt(ItemStack itemStack, final String key, final Object value) {
		return null;
    }
	@Override
	public boolean hasNbt(final ItemStack currentItem, final String name, final String nbts) {
		return false;
    }
	@Override
	public String getNbtString(final ItemStack currentItem, final String name) {
		return null;
    }
	@Override
	public int getNbtInteger(final ItemStack currentItem, final String name) {
		return 0;
    }
	
	@Override
	public String parseColor(String text) {
		return null;
	}
	
	@Override
	public SimpleCommandMap getSimpleCommandMap(Clans plugin) {
		return null;
	}
	
	@Override
	public boolean isHoloEnabled() {
		return this.plugin.getHologramManager().isHoloEnabled();
	}

	@Override
	public Hologram createHolo(Location location, String id, Object extra) {
		return this.plugin.getHologramManager().createHolo(location, id, extra);
	}
	
	public Clans getPlugin() {
		return plugin;
	}

}
