package me.ulrich.clans.events;

import org.bukkit.entity.*;
import org.bukkit.event.player.*;

import me.ulrich.clans.data.HoloData;

public abstract class PlayerHologramEvent extends PlayerEvent {

    private final HoloData hologram;

    public PlayerHologramEvent(Player player, HoloData hologram) {
        super(player);
        this.hologram = hologram;
    }


    public HoloData getHologram() {
        return hologram;
    }

}
