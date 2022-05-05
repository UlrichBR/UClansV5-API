package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.Invites;
import me.ulrich.clans.data.PlayerData;
import me.ulrich.clans.data.ClanEnum.InviteResponse;
import me.ulrich.clans.data.ClanEnum.MemberRoles;
import me.ulrich.clans.interfaces.PlayerAPI;

public class PlayerAPIManager implements PlayerAPI {

	private Clans plugin;

	public PlayerAPIManager(Clans clans) {
		this.plugin = clans;
	}

	@Override
	public UUID getClanID(UUID uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSameClan(UUID player1, UUID player2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canPVP(UUID player1, UUID player2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPlayerData(UUID uuid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPlayerData(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PlayerData getPlayerData(UUID playerUUID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlayerData getPlayerData(String player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPlayerRole(UUID playerUUID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberRoles getEnumPlayerRole(UUID playerUUID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLockedChat(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean toggleChat(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInClan(UUID clanUUID, UUID playerUUID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePlayerSkinCache(UUID playerUUID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePlayerSkinCache(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InviteResponse inviteToClan(UUID clanUUID, UUID invitedUUID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasClan(UUID playerUUID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ClanData getPlayerClan(UUID playerUUID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean resetPlayerKdr(UUID playerUUID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void loadPlayerData(UUID playerUUID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void savePlayerData(PlayerData player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<UUID, Invites> getInvited() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadAllPlayerData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPlayerKDR(UUID playerUUID) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
