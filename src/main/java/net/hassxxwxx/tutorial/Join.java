package net.hassxxwxx.tutorial;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Join implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        PotionEffect effect = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100, 100, false, false);
        event.getPlayer().addPotionEffect(effect);
    }
}
