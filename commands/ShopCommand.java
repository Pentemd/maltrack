package fr.pentalonwaterprouf.maltrack.commands;

import fr.pentalonwaterprouf.maltrack.listener.EventListener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShopCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender s, Command cmd, String msg, String[] args) {
        if (s instanceof Player){
            Player p = (Player) s;
            p.openInventory(EventListener.invMain);
            return true;
        }
        return false;
    }
}
