package me.ulrich.clans.library.hologram;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;

public class HoloManager {

	private  Collection<HoloData> holograms = new CopyOnWriteArraySet<>();
	
	public Collection<HoloData> getHolograms() {
		return holograms;
	}
}
