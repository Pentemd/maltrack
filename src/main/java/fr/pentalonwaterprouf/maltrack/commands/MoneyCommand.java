package fr.pentalonwaterprouf.maltrack.commands;

import fr.pentalonwaterprouf.maltrack.Maltrack;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.IOException;
import java.util.Collection;

public class MoneyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;

                if (args.length == 0) {
                    int money = Maltrack.getInstance().getConfig().getInt("money." + p.getName());
                    p.sendMessage("§6Vous avez §l" + money + "§r§6 money sur vous");
                    return true;
                } else if (args.length >= 1) {
                    boolean hasPlayer = false;
                    Collection<Player> players = (Collection<Player>) Bukkit.getServer().getOnlinePlayers();

                    for (Player player : players) {
                        if (player.getName().equalsIgnoreCase(args[0])) {
                            hasPlayer = true;
                        }
                    }
                    if (hasPlayer) {
                        if (args.length == 1) {
                            int money = Maltrack.getInstance().getConfig().getInt("money." + args[0]);
                            p.sendMessage("§6Le joueur " + args[0] + " a " + money + " money");
                            return true;
                        } else if (args.length == 2) {
                            if (args[1].equalsIgnoreCase("clear")) {

                                if (p.isOp()) {
                                    Player cible = Bukkit.getServer().getPlayer(args[0]);
                                    String pathCible = "money." + cible.getName();
                                    //String pathPlayer = "money." + p.getName();
                                    int exMoneyCible = Maltrack.getInstance().getConfig().getInt(pathCible);
                                    Maltrack.getInstance().getConfig().set(pathCible, 0);
                                    int moneyCible = Maltrack.getInstance().getConfig().getInt(pathCible);
                                    p.sendMessage("§4Vous venez de retirer la totalité de money du joueur : §3" + cible.getName() + "§4 son crédit est désormais de §l" + moneyCible + "§r§4 money (Il était de §l" + exMoneyCible + " §r§4money).");
                                    cible.sendMessage("§4Votre money vient d'être supprimé par l'admin : §3" + p.getName() + "§4, vous êtes désormais à §l" + moneyCible + "§r§4 money et vous étiez à §l" + exMoneyCible + " §r§4money.");
                                    Maltrack.getInstance().saveConfig();

                                    return true;
                                } else {
                                    p.sendMessage("§4Vous n'avez pas le droit d'executer cette commande");
                                    return false;
                                }
                            }
                        } else if (args.length == 3) {

                            boolean isInt = true;
                            try {
                                Integer.parseInt(args[2]);
                            } catch (Exception e) {
                                isInt = false;
                                e.printStackTrace();
                            }
                            if (isInt) {
                                int change = Integer.parseInt(args[2]);
                                Player cible = Bukkit.getServer().getPlayer(args[0]);
                                int exCibleMoney = Maltrack.getInstance().getConfig().getInt("money." + cible.getName());
                                String pathCible = "money." + cible.getName();
                                String pathPlayer = "money." + p.getName();
                                int exMoneyCible = Maltrack.getInstance().getConfig().getInt(pathCible);
                                int moneyPlayer = Maltrack.getInstance().getConfig().getInt(pathPlayer);
                                if (args[1].equalsIgnoreCase("add")) {
                                    if (!p.isOp()) {
                                        p.sendMessage("§4Vous n'avez pas les permission d'executer cette commande !");
                                        return true;
                                    }
                                    Maltrack.getInstance().getConfig().set(pathCible, exCibleMoney + change);
                                    int cibleMoney = Maltrack.getInstance().getConfig().getInt(pathCible);
                                    p.sendMessage("§aVous venez d'offrir §l" + change + "§r§a money de la part du serveur, §3" + cible.getName() + " §avient de passer de §l" + exCibleMoney + " §r§amoney à §l" + cibleMoney + " §r§amoney.");
                                    p.sendMessage("§3"+ p.getName() + " §avient de vous offrir §l" + change + " §r§amoney de la part du serveur, vous de passer de §l" + exCibleMoney + " §r§amoney à §l" + cibleMoney + " §r§amoney.");
                                    Maltrack.getInstance().saveConfig();
                                    return true;
                                } else if (args[1].equalsIgnoreCase("del")) {
                                    if (!p.isOp()) {
                                        p.sendMessage("§4Vous n'avez pas les permission d'executer cette commande !");
                                        return true;
                                    }

                                    if (exCibleMoney >= change) {
                                        Maltrack.getInstance().getConfig().set(pathCible, exCibleMoney - change);
                                        int cibleMoney = Maltrack.getInstance().getConfig().getInt(pathCible);
                                        p.sendMessage("§4Vous venez de retirer §l" + change + " §r§4money pour les offrir au serveur, §3" + cible.getName() + " §4vient de passer de §l" + exCibleMoney + " §r§4money à §l" + cibleMoney + " §r§4money.");
                                        p.sendMessage("§3" + p.getName() + " §4vient de vous retirer §l" + change + " §r§4money pour les offrir au serveur, vous passez de §l" + exCibleMoney + " §r§4money à §l" + cibleMoney + " §r§4money.");
                                        Maltrack.getInstance().saveConfig();
                                        return true;
                                    } else {
                                        Maltrack.getInstance().getConfig().set(pathCible, 0);
                                        int cibleMoney = Maltrack.getInstance().getConfig().getInt(pathCible);
                                        p.sendMessage("§4Vous venez de retirer §l" + change + " §r§4money pour les offrir au serveur, Mais le joueur en question n'a pas assez de money et ne peut passer dans les négatifs, §3" + cible.getName() + " §4n'a plus de money (il était à §l" + exCibleMoney + " §r§4money et maintenant il est à §l" + cibleMoney + " §r§4money.");
                                        p.sendMessage("§3" + p.getName() + " §4vient de vous retirer §l" + change + " §r§4(ne peut pas être négatif)  money pour les offrir au serveur, vous passez de §l" + exCibleMoney + " §r§4money à §l" + cibleMoney + " §r§4money.");
                                        Maltrack.getInstance().saveConfig();
                                        return true;
                                    }
                                } else if (args[1].equalsIgnoreCase("give")) {
                                    if (cible.getName().equalsIgnoreCase(p.getName())) {
                                        p.sendMessage("§4Vous ne pouvez vous donner de l'argent à vous même");
                                        return true;
                                    }
                                    if (change < moneyPlayer) {
                                        int playerSMoneyFuture = moneyPlayer - change;
                                        int cibleMoneyFuture = exCibleMoney + change;

                                        Maltrack.getInstance().getConfig().set(pathCible, cibleMoneyFuture);
                                        Maltrack.getInstance().getConfig().set(pathPlayer, playerSMoneyFuture);
                                        p.sendMessage("§aVous venez d'offrir " + change + " money à §3" + cible.getName() + "§a, il vous reste :  §l" + Maltrack.getInstance().getConfig().getInt(pathPlayer) + "§r§a money.");
                                        cible.sendMessage("§aVous venez de recevoir §l" + change + " §r§amoney de la part de §3" + p.getName() + " §avous avez désormais : §l" + Maltrack.getInstance().getConfig().getInt(pathCible) + "§r§a money.");
                                        Maltrack.getInstance().saveConfig();
                                        return true;
                                    } else if (change == moneyPlayer) {
                                        int playerSMoneyFuture = moneyPlayer - change;
                                        int cibleMoneyFuture = exCibleMoney + change;

                                        Maltrack.getInstance().getConfig().set(pathCible, cibleMoneyFuture);
                                        Maltrack.getInstance().getConfig().set(pathPlayer, playerSMoneyFuture);

                                        p.sendMessage("§3Vous venez de céder la totalité de votre fortune (" + change + " money) à " + cible.getName() + ", il vous reste :  " + Maltrack.getInstance().getConfig().getInt(pathPlayer) + " money.");
                                        cible.sendMessage("§aVous venez de recevoir " + change + " money de la part de §3" + p.getName() + " §avous avez désormais :§l " + Maltrack.getInstance().getConfig().getInt(pathCible) + " §r§amoney.");
                                        Maltrack.getInstance().saveConfig();
                                        return true;
                                    } else {
                                        p.sendMessage("§4Vous n'avez pas assez de money");
                                        return true;
                                    }
                                } else {
                                    p.sendMessage("§4Commande Non reconnue veuillez faire le §3/maltrack");
                                }
                            } else {
                                p.sendMessage("§4le troisième argument n'est pas un nombre ou n'est pas entier");
                            }

                        } else {
                            p.sendMessage("§4Le joueur §3" + args[0] + " §4n'existe pas");
                            return false;
                        }

                    }
                }

            } else {
                sender.sendMessage("Seul les joueurs ont le droit d'utiliser cette commande");
                return false;
            }


            return false;

    }
}




/*if (hasPlayer)
                    {
                        /*Player cible  = Bukkit.getServer().getPlayer(args[1]);
                        String pathCible = "money." + cible.getName();
                        String pathPlayer = "money." + p.getName();
                        int exMoneyCible = Maltrack.getInstance().getConfig().getInt(pathCible);*/

                        /*}else if(args[0].equalsIgnoreCase("give")){
                            int moneyPlayer = Maltrack.getInstance().getConfig().getInt(pathPlayer);
                            int moneyCible = Maltrack.getInstance().getConfig().getInt(pathCible);*/
                        /*
                        }else{
                            p.sendMessage("Commande non reconnue pour plus d'information, faites le /maltrack");
                        }*/