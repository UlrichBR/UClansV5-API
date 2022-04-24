package me.ulrich.clans.events;

import org.bukkit.entity.*;
import org.bukkit.event.*;

import me.ulrich.clans.data.HoloData;

public class PlayerHologramHideEvent extends PlayerHologramEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    public PlayerHologramHideEvent(Player player, HoloData hologram) {
        super(player, hologram);
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }
}
