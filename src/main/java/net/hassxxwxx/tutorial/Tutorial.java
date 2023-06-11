package net.hassxxwxx.tutorial;

import org.bukkit.Bukkit;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Hello World!");
        this.getCommand("ping").setExecutor(new Ping());
        this.getCommand("push").setExecutor(new Push());
        this.getCommand("rocket").setExecutor(new Rocket());
        this.getCommand("empty").setExecutor(new Empty());
        getServer().getPluginManager().registerEvents(new Join(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}