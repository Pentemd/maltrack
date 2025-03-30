package fr.pentalonwaterprouf.maltrack;

import fr.pentalonwaterprouf.maltrack.commands.*;
import fr.pentalonwaterprouf.maltrack.functions.Functions;
import fr.pentalonwaterprouf.maltrack.listener.EventListener;
import org.bukkit.plugin.java.JavaPlugin;


public final class Maltrack extends JavaPlugin {

    public static Maltrack instance;
    public static Maltrack getInstance(){
        return instance;
    }


    @Override
    public void onEnable() {

        instance = this;
        System.out.println("Hello");
        Functions.onEnableSpawner();
        Functions.onEnable(EventListener.money, EventListener.logoSell, EventListener.logoBuy, EventListener.cancelItem);
        Functions.onEnableInv(EventListener.invMain, EventListener.logoBuy, EventListener.logoSell, EventListener.cancelItem, EventListener.invSell, EventListener.invBuy, EventListener.invSpawner, EventListener.invEgg);


        getServer().getPluginManager().registerEvents(new EventListener(), this);

        getCommand("shop").setExecutor(new ShopCommand());
        getCommand("sethome").setExecutor(new HomeCommand());
        getCommand("home").setExecutor(new HomeCommand());
        getCommand("delhome").setExecutor(new HomeCommand());
        getCommand("money").setExecutor(new MoneyCommand());
        getCommand("maltrack").setExecutor(new MaltrackCommand());
        // getCommand("craft").setExecutor(new CraftCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        }



}


