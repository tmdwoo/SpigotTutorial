package net.hassxxwxx.tutorial;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ping implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command,String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("Pong!");
            return true;
        }
        if (args.length > 1) {
            sender.sendMessage("Too many arguments!");
            return true;
        }
        Player target = sender.getServer().getPlayer(args[0]);
        if (target == null) {
            sender.sendMessage("Player not found!");
            return true;
        }
        sender.sendMessage("Pong!");
        return true;
    }
}