package me.escapies.flame.listener;

import me.escapies.flame.Flame;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        for (String msg : Flame.getInstance().getConfig().getStringList("JOIN-MESSAGE")) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
        }

        player.setGameMode(GameMode.SURVIVAL);
        player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 3), true);
        player.teleport(player.getWorld().getSpawnLocation());

    }


}
