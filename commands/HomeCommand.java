package fr.pentalonwaterprouf.maltrack.commands;

import fr.pentalonwaterprouf.maltrack.Maltrack;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class HomeCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (label.equalsIgnoreCase("sethome")) {

                if (args.length == 0) {
                    p.sendMessage("§4§largument manquant : §3§l/sethome <nom>");
                    return false;

                } else if (args.length == 1) {
                    // Unique Id = non crack
                    //Maltrack.getInstance().getConfig().set("home." + p.getUniqueId().toString() + "." + args[0]+ ".world",  p.getLocation().getWorld().getName());
                    // Maltrack.getInstance().getConfig().set();
                    // get Name -> Crack
                    Maltrack.getInstance().getConfig().set("home." + p.getName() + "." + args[0] + ".world", p.getLocation().getWorld().getName());
                    Maltrack.getInstance().getConfig().set("home." + p.getName() + "." + args[0] + ".x", p.getLocation().getX());
                    Maltrack.getInstance().getConfig().set("home." + p.getName() + "." + args[0] + ".y", p.getLocation().getY());
                    Maltrack.getInstance().getConfig().set("home." + p.getName() + "." + args[0] + ".z", p.getLocation().getZ());
                    Maltrack.getInstance().getConfig().set("home." + p.getName() + "." + args[0] + ".pitch", p.getEyeLocation().getPitch());
                    Maltrack.getInstance().getConfig().set("home." + p.getName() + "." + args[0] + ".yaw", p.getEyeLocation().getYaw());
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("§2Votre Home " + args[0] + " vient d'être sauvegardé !");

                    return false;


                } else if (args.length > 1) {
                    p.sendMessage("§4§lTrop d'argument (le nom du home ne doit pas contenir d'espaces) : §3§l/sethome <nom>");
                    return false;
                } else {
                    p.sendMessage("§4§lErreur : §3§l/sethome <nom>");

                    return false;
                }

            } else if (label.equalsIgnoreCase("home")) {
                if (args.length == 0) {
                    p.sendMessage("§4§largument manquant : §3§l/home <nom>");
                    return false;

                } else if (args.length == 1) {
                    if (Maltrack.getInstance().getConfig().contains("home." + p.getName() + "." + args[0])) {
                        System.out.println("Dedant");
                        World w = Bukkit.getServer().getWorld(Objects.requireNonNull(Maltrack.getInstance().getConfig().getString("home." + p.getName() + "." + args[0] + ".world")));


                        double x = Maltrack.getInstance().getConfig().getDouble("home." + p.getName() + "." + args[0] + ".x");
                        double y = Maltrack.getInstance().getConfig().getDouble("home." + p.getName() + "." + args[0] + ".y");
                        double z = Maltrack.getInstance().getConfig().getDouble("home." + p.getName() + "." + args[0] + ".z");
                        double pitch = Maltrack.getInstance().getConfig().getDouble("home." + p.getName() + "." + args[0] + ".pitch");
                        double yaw = Maltrack.getInstance().getConfig().getDouble("home." + p.getName() + "." + args[0] + ".yaw");
                        System.out.println("Bien plus");
                        p.teleport(new Location(w, x, y, z, (float) yaw, (float) pitch));
                        p.sendMessage("Vous avez été téléporté à votre home " + args[0]);
                        System.out.println(x + " " + y + " " + z + " " + pitch + " " + yaw);

                    } else {
                        p.sendMessage("§4§lVotre home" + args[0]  + " n'existe pas");
                        return false;
                    }
                } else if (args.length > 1) {
                    p.sendMessage("§4§lTrop d'argument (le nom du home ne doit pas contenir d'espaces) : §3§l/home <nom>");
                    return false;
                } else {
                    p.sendMessage("§4§lErreur : §3§l/home <nom>");

                    return false;
                }


            } else if (label.equalsIgnoreCase("delhome")) {
                if (args.length == 0) {
                    p.sendMessage("§4§largument manquant : §3§l/delhome <nom>");
                    return false;

                } else if (args.length == 1) {
                    if (Maltrack.getInstance().getConfig().contains("home." + p.getName() + "." + args[0])) {

                        Maltrack.getInstance().getConfig().set("home." + p.getName() + "." + args[0], null);
                        p.sendMessage("§3Votre home §3" + args[0] + "§4 à bien été supprimé");
                        Maltrack.getInstance().saveConfig();
                        return false;

                    } else {
                        p.sendMessage("§4Votre home §3" + args[0] + " §4n'existe pas");
                        return false;
                    }
                } else if (args.length > 1) {

                    p.sendMessage("§4§lTrop d'argument (le nom du home ne doit pas contenir d'espaces) : §3§l/delhome <nom>");
                    return false;

                } else {
                    p.sendMessage("§4§lErreur : §3§l/delhome <nom>");
                    return false;
                }
            }
        } else {
            System.out.println("Il est impossible de creer / supprimer des homes depuis la console");
            return false;
        }
        return false;

    }
}
