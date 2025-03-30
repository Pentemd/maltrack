package fr.pentalonwaterprouf.maltrack.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MaltrackCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage("<Player> => il faut mettre le nom d'un joueur");
        sender.sendMessage("<nom> => Il faut choisir/mettre un nom");
        sender.sendMessage("/sethome <nom> => chosir un nom de home");
        sender.sendMessage("/home <nom> => se téléporter a l'endroit ou le /sethome <nom> à été effectué");
        sender.sendMessage("/delhome <nom> => supprimer un home");
        sender.sendMessage("/money => vous donne votre nombre de money");
        sender.sendMessage("/money <Player> => vous dit le nombre de money du joueur que vous avez marqué ");
        sender.sendMessage("/shop => vous ouvre l'interface de shop");
        sender.sendMessage("/money give <Player> => donner de sa money à un autre joueur");


        if (sender.isOp()) {

            sender.sendMessage("/money <Player> clear => Commande admin permetant de reset la money du joueur que vous avez écrit");
            sender.sendMessage("/money add <Player> add <int> => ajouter de la money a un joueur");
            sender.sendMessage("/money <Player> del <int> => retirer de la money a un joueur");
        }



        return true;
    }
}
