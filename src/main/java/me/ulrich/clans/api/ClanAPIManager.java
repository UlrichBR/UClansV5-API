package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.AllyInviteReturn;
import me.ulrich.clans.data.ClanEnum.ClanActions;
import me.ulrich.clans.data.ClanEnum.PlaceholderTop;
import me.ulrich.clans.data.ClanEnum.RivalAllyCount;
import me.ulrich.clans.data.ClanEnum.RivalRemoveReturn;
import me.ulrich.clans.interfaces.ClanAPI;
import me.ulrich.clans.interfaces.ClansCommand;
import me.ulrich.clans.data.CommandData;
import me.ulrich.clans.data.CommandData_show;
import me.ulrich.clans.data.HomesData;

public class ClanAPIManager implements ClanAPI {
	
	private Clans plugin;

	public ClanAPIManager(Clans plugin) {
		this.plugin = plugin;
	}

	@Override
	public HashMap<String, CommandData> getClanCommander() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, CommandData> getUClanCommander() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reloadClanData(UUID uuid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadAllClanData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClanData(ClanData clan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unRegisterCommand(String command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertCommand(String command, String permission, String alias, double value, int cooldown, CommandData_show data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean tagExists(String tag) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRival(UUID player1, UUID player2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAlly(UUID player1, UUID player2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean promotePlayer(UUID clanUUID, UUID promoted) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean demotePlayer(UUID clanUUID, UUID demoted) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kickPlayer(UUID clanUUID, UUID kicked) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeLeader(UUID clanUUID, UUID newleader) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean leaveClan(UUID player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean leaveClan(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modDesc(ClanData clanData, String newDescription, Player sender) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modTag(ClanData clanData, String newTag, Player sender) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean toggleGlobalFF(CommandSender player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean toggleGlobalFF(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean toggleFF(ClanData clanData) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLeader(UUID player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMod(UUID uuid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteHome(UUID clanUUID, String homeName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setHome(UUID player, Location location, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasHome(UUID player, String homeName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Location getHome(UUID player, String homeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HomesData getHomeData(UUID player, String homeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteClan(UUID clanUUID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePlayerClan(UUID player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ClanData createNewClan(Player player, String tag, String desc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean clanExists(UUID clanUUID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ClanData getClan(UUID clanUUID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<UUID, Float> getTopClans(PlaceholderTop checktype) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean resetClanKDR(ClanData clanKDR, CommandSender sender) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addExtraChest(UUID clanUUID, int amount, CommandSender sender) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addSlot(String tag, int amount, CommandSender sender) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeSlot(String tag, int amount, CommandSender sender) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setSlot(String tag, int amount, CommandSender sender) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPoint(UUID clanid, int amount, CommandSender sender) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removePoint(String tag, int amount, CommandSender sender) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removePoint(String tag, int amount, CommandSender sender, StringBuilder reason) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setPoint(String tag, int amount, CommandSender sender) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setPoint(String tag, int amount, CommandSender sender, StringBuilder reason) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getPointsNextLevel(ClanData clanData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void checkClanLevelUp(ClanData clanData, CommandSender player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int slotsCount(ClanData clanData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int allyRivalCount(ClanData clanData, RivalAllyCount type) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasClanModerationOnline(UUID clanUUID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String parseText(UUID player, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasAddonEnabled(String addonName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HashMap<UUID, ClanData> getClanData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getChatspy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isGlobalFF() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getProxieds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProxieds(String json) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RivalRemoveReturn rivalRemoveSend(UUID clanUUID1, UUID clanUUID2, boolean mult) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clanChatSendOffline(UUID sender, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clanMessageSend(UUID id, String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UUID getClanByTag(String tag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void check_actions(ClanActions action, UUID clanid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ClanData> getRivalries(UUID clanUUID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClanData> getAlliances(UUID clanUUID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AllyInviteReturn allySend(UUID clanUUID1, UUID clanUUID2, boolean mult) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerCommand(String alias, ClansCommand command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteBanner(UUID clanid, Player player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setBanner(UUID clanid, Player player, ItemStack itemstack) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getClanKDR(UUID clanUUID) {
		// TODO Auto-generated method stub
		return 0;
	}




	
}
