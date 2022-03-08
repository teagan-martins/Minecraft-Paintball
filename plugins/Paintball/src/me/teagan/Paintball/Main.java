package me.teagan.Paintball;

import org.bukkit.plugin.java.JavaPlugin;

import me.teagan.Paintball.listeners.HelloListener;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new HelloListener(this);
	}
}
