package net.hassxxwxx.tutorial;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.List;

public class Rocket implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("This command can only be run by a player.");
            return true;
        }
        List<Entity> entities = ((Player) sender).getNearbyEntities(10, 10, 10);
        for (Entity entity : entities) {
            entity.setVelocity(entity.getVelocity().setY(5));
        }
        return true;
    }
}
