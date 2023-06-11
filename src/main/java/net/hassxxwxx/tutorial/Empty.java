package net.hassxxwxx.tutorial;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.Material;

public class Empty implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("This command can only be run by a player.");
            return true;
        }
        Location location = ((Player) sender).getLocation();
        for (int i = -2; i < 3; i++) {
            for (int j = -2; j < 3; j++) {
                for (int k = -2; k < 3; k++) {
                    location.clone().add(i, j, k).getBlock().setType(Material.AIR);
                }
            }
        }
        return true;
    }
}
