package me.teagan.Paintball.listeners;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import me.teagan.Paintball.Main;

public class HelloListener implements Listener {
	
	private Main plugin;
	
	public HelloListener(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void paintballEvent(PlayerInteractEvent event) {
		
		Player user = event.getPlayer();
		
		Material mat = event.getItem().getType();
		
		Action act = event.getAction();
		
		if (act.equals(Action.RIGHT_CLICK_AIR) && (mat==Material.RED_DYE)) {
			
			Location loc = user.getLocation();
			
			Entity snowball = loc.getWorld().spawnEntity(loc.add(loc.getDirection()), EntityType.SNOWBALL);
			snowball.setCustomName("redpb");
			snowball.setVelocity(loc.getDirection().multiply(2.5));
			
		}
		
		else if (act.equals(Action.RIGHT_CLICK_AIR) && (mat==Material.BLUE_DYE)) {
			
			Location loc = user.getLocation();
			
			Entity snowball = loc.getWorld().spawnEntity(loc.add(loc.getDirection()), EntityType.SNOWBALL);
			snowball.setCustomName("bluepb");
			snowball.setVelocity(loc.getDirection().multiply(2.5));
		}
		
		else if (act.equals(Action.RIGHT_CLICK_AIR) && (mat==Material.PINK_DYE)) {
			
			Location loc = user.getLocation();
			
			Entity snowball = loc.getWorld().spawnEntity(loc.add(loc.getDirection()), EntityType.SNOWBALL);
			snowball.setCustomName("pinkpb");
			snowball.setVelocity(loc.getDirection().multiply(2.5));
		}
		
		else if (act.equals(Action.RIGHT_CLICK_AIR) && (mat==Material.LIME_DYE)) {
			
			Location loc = user.getLocation();
			
			Entity snowball = loc.getWorld().spawnEntity(loc.add(loc.getDirection()), EntityType.SNOWBALL);
			snowball.setCustomName("limepb");
			snowball.setVelocity(loc.getDirection().multiply(2.5));
		}
		
		else if (act.equals(Action.RIGHT_CLICK_AIR) && (mat==Material.PURPLE_DYE)) {
			
			Location loc = user.getLocation();
			
			Entity snowball = loc.getWorld().spawnEntity(loc.add(loc.getDirection()), EntityType.SNOWBALL);
			snowball.setCustomName("purplepb");
			snowball.setVelocity(loc.getDirection().multiply(2.5));
		}
		
		else if (act.equals(Action.RIGHT_CLICK_AIR) && (mat==Material.YELLOW_DYE)) {
			
			Location loc = user.getLocation();
			
			Entity snowball = loc.getWorld().spawnEntity(loc.add(loc.getDirection()), EntityType.SNOWBALL);
			snowball.setCustomName("yellowpb");
			snowball.setVelocity(loc.getDirection().multiply(2.5));
		}
		
		else if (act.equals(Action.RIGHT_CLICK_AIR) && (mat==Material.ORANGE_DYE)) {
			
			Location loc = user.getLocation();
			
			Entity snowball = loc.getWorld().spawnEntity(loc.add(loc.getDirection()), EntityType.SNOWBALL);
			snowball.setCustomName("orangepb");
			snowball.setVelocity(loc.getDirection().multiply(2.5));
		}
		
		else if (act.equals(Action.RIGHT_CLICK_AIR) && (mat==Material.BROWN_DYE)) {
			
			Location loc = user.getLocation();
			
			Entity snowball = loc.getWorld().spawnEntity(loc.add(loc.getDirection()), EntityType.SNOWBALL);
			snowball.setCustomName("brownpb");
			snowball.setVelocity(loc.getDirection().multiply(2.5));
		}
		
		else if (act.equals(Action.RIGHT_CLICK_AIR) && (mat==Material.WHITE_DYE)) {
			
			Location loc = user.getLocation();
			
			Entity snowball = loc.getWorld().spawnEntity(loc.add(loc.getDirection()), EntityType.SNOWBALL);
			snowball.setCustomName("whitepb");
			snowball.setVelocity(loc.getDirection().multiply(2.5));
		}
		
		else if (act.equals(Action.RIGHT_CLICK_AIR) && (mat==Material.BLACK_DYE)) {
			
			Location loc = user.getLocation();
			
			Entity snowball = loc.getWorld().spawnEntity(loc.add(loc.getDirection()), EntityType.SNOWBALL);
			snowball.setCustomName("blackpb");
			snowball.setVelocity(loc.getDirection().multiply(2.5));
		}
		
		
	}
	
	
	
	@EventHandler
	public void collisionEvent(ProjectileHitEvent event) {
		
		Projectile ball = event.getEntity();

		
		EntityType sb = ball.getType();
		
		if ((sb==EntityType.SNOWBALL) && ((ball.getCustomName().equals("redpb")))) {
			Block b = event.getHitBlock();
			Entity e = event.getHitEntity();
			
			if (b!=null) {
				b.setType(Material.RED_WOOL);
			}
			
			if (e!=null) {
				if (e.getType()==EntityType.SHEEP) {
					Sheep et = (Sheep) event.getHitEntity();
					et.setColor(DyeColor.RED);
				}
			}
			
		}
		else if ((sb==EntityType.SNOWBALL) && ((ball.getCustomName().equals("bluepb")))) {
			Block b = event.getHitBlock();
			Entity e = event.getHitEntity();
			
			if (b!=null) {
				b.setType(Material.BLUE_WOOL);
			}
			
			if (e!=null) {
				if (e.getType() == EntityType.SHEEP) {
					Sheep et = (Sheep) event.getHitEntity();
					et.setColor(DyeColor.BLUE);
				}

			}
			
		}
		
		else if ((sb==EntityType.SNOWBALL) && ((ball.getCustomName().equals("pinkpb")))) {
			Block b = event.getHitBlock();
			Entity e = event.getHitEntity();
			
			if (b!=null) {
				b.setType(Material.PINK_WOOL);
			}
			
			if (e!=null) {
				if (e.getType() == EntityType.SHEEP) {
					Sheep et = (Sheep) event.getHitEntity();
					et.setColor(DyeColor.PINK);
				}

			}
			
		}
		
		else if ((sb==EntityType.SNOWBALL) && ((ball.getCustomName().equals("limepb")))) {
			Block b = event.getHitBlock();
			Entity e = event.getHitEntity();
			
			if (b!=null) {
				b.setType(Material.LIME_WOOL);
			}
			
			if (e!=null) {
				if (e.getType() == EntityType.SHEEP) {
					Sheep et = (Sheep) event.getHitEntity();
					et.setColor(DyeColor.LIME);
				}

			}
			
		}
		
		else if ((sb==EntityType.SNOWBALL) && ((ball.getCustomName().equals("purplepb")))) {
			Block b = event.getHitBlock();
			Entity e = event.getHitEntity();
			
			if (b!=null) {
				b.setType(Material.PURPLE_WOOL);
			}
			
			if (e!=null) {
				if (e.getType() == EntityType.SHEEP) {
					Sheep et = (Sheep) event.getHitEntity();
					et.setColor(DyeColor.PURPLE);
				}

			}
			
		}
		
		else if ((sb==EntityType.SNOWBALL) && ((ball.getCustomName().equals("yellowpb")))) {
			Block b = event.getHitBlock();
			Entity e = event.getHitEntity();
			
			if (b!=null) {
				b.setType(Material.YELLOW_WOOL);
			}
			
			if (e!=null) {
				if (e.getType() == EntityType.SHEEP) {
					Sheep et = (Sheep) event.getHitEntity();
					et.setColor(DyeColor.YELLOW);
				}

			}
			
		}
		
		else if ((sb==EntityType.SNOWBALL) && ((ball.getCustomName().equals("orangepb")))) {
			Block b = event.getHitBlock();
			Entity e = event.getHitEntity();
			
			if (b!=null) {
				b.setType(Material.ORANGE_WOOL);
			}
			
			if (e!=null) {
				if (e.getType() == EntityType.SHEEP) {
					Sheep et = (Sheep) event.getHitEntity();
					et.setColor(DyeColor.ORANGE);
				}

			}
			
		}
		
		else if ((sb==EntityType.SNOWBALL) && ((ball.getCustomName().equals("brownpb")))) {
			Block b = event.getHitBlock();
			Entity e = event.getHitEntity();
			
			if (b!=null) {
				b.setType(Material.BROWN_WOOL);
			}
			
			if (e!=null) {
				if (e.getType() == EntityType.SHEEP) {
					Sheep et = (Sheep) event.getHitEntity();
					et.setColor(DyeColor.BROWN);
				}

			}
			
		}
		
		else if ((sb==EntityType.SNOWBALL) && ((ball.getCustomName().equals("whitepb")))) {
			Block b = event.getHitBlock();
			Entity e = event.getHitEntity();
			
			if (b!=null) {
				b.setType(Material.WHITE_WOOL);
			}
			
			if (e!=null) {
				if (e.getType() == EntityType.SHEEP) {
					Sheep et = (Sheep) event.getHitEntity();
					et.setColor(DyeColor.WHITE);
				}

			}
			
		}
		
		else if ((sb==EntityType.SNOWBALL) && ((ball.getCustomName().equals("blackpb")))) {
			Block b = event.getHitBlock();
			Entity e = event.getHitEntity();
			
			if (b!=null) {
				b.setType(Material.BLACK_WOOL);
			}
			
			if (e!=null) {
				if (e.getType() == EntityType.SHEEP) {
					Sheep et = (Sheep) event.getHitEntity();
					et.setColor(DyeColor.BLACK);
				}

			}
			
		}
		
		
	} 
}
