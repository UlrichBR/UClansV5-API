package me.ulrich.clans.api;

import java.util.List;
import java.util.UUID;

import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanEnum.BarActions;
import me.ulrich.clans.interfaces.BossBarAPI;

public class BossBarAPIManager implements BossBarAPI {

	private Clans plugin;

	public BossBarAPIManager(Clans clans) {
		this.plugin = clans;
	}
	
	@Override
	public void customBossBar(Player player, BarColor barcolor, BarStyle barstyle, List<BarFlag> flags, String message, int seconds, boolean animated, List<String> data) {
		this.plugin.getBossBarManager().customBossBar(player, barcolor, barstyle, flags, message, seconds, animated, data);
	}

	@Override
	public void startBossBar(Player player, BarActions action, List<String> data) {
		this.plugin.getBossBarManager().startBossBar(player, action, data);
	}
	
	@Override
	public void removeAllBar(UUID uuid) {
		this.plugin.getBossBarManager().removeAllBar(uuid);
	}
}
