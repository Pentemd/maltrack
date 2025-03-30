package fr.pentalonwaterprouf.maltrack.listener;

import fr.pentalonwaterprouf.maltrack.Maltrack;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;

import java.util.Objects;

public class EventListener implements Listener {

    public static ItemStack villager = new ItemStack(Material.VILLAGER_SPAWN_EGG);

    public static ItemStack cancelItem = new ItemStack(Material.BARRIER);
    public static ItemStack logoSell = new ItemStack(Material.EMERALD, 1);
    // public static ItemStack shopItem = new ItemStack(Material.COMPASS, 1);

    public static ItemStack arrowAfter = new ItemStack(Material.ARROW);
    public static ItemStack arrowBefore = new ItemStack(Material.ARROW);


    public static ItemStack logoBuy = new ItemStack(Material.DIAMOND, 1);
    public static ItemStack money = new ItemStack(Material.EMERALD, 1);

    public static Inventory invMain = Bukkit.createInventory(null, 27, "§8Shop");
    public static Inventory invBuy = Bukkit.createInventory(null, 45, "§8Buy");
    public static Inventory invSell = Bukkit.createInventory(null, 45, "§8Sell");
    public static Inventory invEgg = Bukkit.createInventory(null, 45, "§8Oeuf d'apparition");
    public static Inventory invSpawner = Bukkit.createInventory(null, 45, "§8Spawner");
    public static Inventory invEggTwo = Bukkit.createInventory(null , 45, "§8Oeuf d'apparition page 2");
    public static Inventory invSpawnerTwo = Bukkit.createInventory(null, 45, "§8Spawner page 2");
    // public static Inventory craftInventory = Bukkit.createInventory(null, InventoryType.CRAFTING, "§8Table De Craft");


    public static ItemStack logoSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack logoEgg = new ItemStack(Material.CREEPER_SPAWN_EGG, 1);

    public static ItemStack diamond = new ItemStack(Material.DIAMOND);

    public static ItemStack zombie = new ItemStack(Material.ZOMBIE_SPAWN_EGG, 1);
    public static ItemStack creeper = new ItemStack(Material.CREEPER_SPAWN_EGG, 1);
    public static ItemStack blaze = new ItemStack(Material.BLAZE_SPAWN_EGG, 1);
    public static ItemStack chicken = new ItemStack(Material.CHICKEN_SPAWN_EGG, 1);
    public static ItemStack cow = new ItemStack(Material.COW_SPAWN_EGG, 1);
    public static ItemStack enderman = new ItemStack(Material.ENDERMAN_SPAWN_EGG, 1);
    public static ItemStack pig = new ItemStack(Material.PIG_SPAWN_EGG, 1);
    public static ItemStack rabbit = new ItemStack(Material.RABBIT_SPAWN_EGG, 1);
    public static ItemStack goat = new ItemStack(Material.GOAT_SPAWN_EGG, 1);
    public static ItemStack sheep = new ItemStack(Material.SHEEP_SPAWN_EGG, 1);
    public static ItemStack skeleton = new ItemStack(Material.SKELETON_SPAWN_EGG, 1);
    public static ItemStack slime = new ItemStack(Material.SLIME_SPAWN_EGG, 1);
    public static ItemStack witch = new ItemStack(Material.WITCH_SPAWN_EGG, 1);
    public static ItemStack witherSkeleton = new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG, 1);
    public static ItemStack axolotl = new ItemStack(Material.AXOLOTL_SPAWN_EGG,1);
    public static ItemStack caveSpider = new ItemStack(Material.CAVE_SPIDER_SPAWN_EGG, 1);
    public static ItemStack drowned = new ItemStack(Material.DROWNED_SPAWN_EGG,  1); // zombie noiyé
    public static ItemStack glowSquid = new ItemStack(Material.GLOW_SQUID_SPAWN_EGG, 1);

    public static ItemStack mushroom = new ItemStack(Material.MOOSHROOM_SPAWN_EGG, 1);
    public static ItemStack piglin = new ItemStack(Material.PIGLIN_SPAWN_EGG, 1);
    public static ItemStack magmaCube = new ItemStack(Material.MAGMA_CUBE_SPAWN_EGG, 1);
    public static ItemStack spider = new ItemStack(Material.SPIDER_SPAWN_EGG, 1);

    public static ItemStack zombieSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack creeperSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack blazeSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack chickenSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack cowSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack endermanSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack pigSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack rabbitSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack goatSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack sheepSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack skeletonSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack slimeSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack witchSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack witherSkeletonSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack axolotlSpawner = new ItemStack(Material.SPAWNER,1);
    public static ItemStack caveSpiderSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack drownedSpawner = new ItemStack(Material.SPAWNER,  1); // zombie noiyé
    public static ItemStack glowSquidSpawner = new ItemStack(Material.SPAWNER, 1);

    public static ItemStack mushroomSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack piglinSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack magmaCubeSpawner = new ItemStack(Material.SPAWNER, 1);
    public static ItemStack spiderSpawner = new ItemStack(Material.SPAWNER, 1);



    public static ItemStack shulkerBox = new ItemStack(Material.SHULKER_BOX, 1);
    public static ItemStack enderChest = new ItemStack(Material.ENDER_CHEST, 1);


    public static ItemStack zombieSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack creeperSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack blazeSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack chickenSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack cowSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack endermanSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack pigSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack rabbitSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack goatSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack sheepSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack skeletonSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack slimeSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack witchSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack witherSkeletonSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack axolotlSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE,1);
    public static ItemStack caveSpiderSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack drownedSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE,  1); // zombie noiyé
    public static ItemStack glowSquidSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);

    public static ItemStack mushroomSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack piglinSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack magmaCubeSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);
    public static ItemStack spiderSpawnerFake = new ItemStack(Material.YELLOW_CONCRETE, 1);


    /*public static ItemStack fff = new ItemStack(Material.SPAWN_EGG);
    public static ItemStack fff = new ItemStack(Material.SPAWN_EGG);
    public static ItemStack fff = new ItemStack(Material.SPAWN_EGG);
    public static ItemStack fff = new ItemStack(Material.SPAWN_EGG);
    public static ItemStack fff = new ItemStack(Material.SPAWN_EGG);
    public static ItemStack fff = new ItemStack(Material.SPAWN_EGG);*/


    //public static int priceSpawner = 700;
    public static int zombiePrice = 350;
    public static int creeperPrice = 400;
    public static int blazePrice = 550;
    public static int chickenPrice = 350;
    public static int cowPrice = 350;
    public static int EndermanPrice = 550;
    public static int pigPrice = 250;
    public static int rabbitPrice = 300;
    public static int GoatPrice = 350;
    public static int sheepPrice = 400;
    public static int skeletonPrice = 450;
    public static int slimePrice = 350;
    public static int witchPrice = 400;
    public static int witherSkeletonPrice = 550;
    public static int villagerPrice = 500;
    public static int axolotlPrice = 50;
    public static int spiderPrice = 300;
    public static int caveSpiderPrice = 350;
    public static int drownedPrice = 350;
    public static int glowSquidPrice = 250;
    public static int mushroomPrice = 250;
    public static int piglinPrice = 300;
    public static int ShulkerBoxPrice = 500;
    public static int magmaCubePrice = 350;

    public static int zombiePriceSpawner = 650;
    public static int creeperPriceSpawner = 700;
    public static int blazePriceSpawner = 850;
    public static int chickenPriceSpawner = 650;
    public static int cowPriceSpawner = 650;
    public static int EndermanPriceSpawner = 850;
    public static int pigPriceSpawner = 550;
    public static int rabbitPriceSpawner = 600;
    public static int GoatPriceSpawner = 650;
    public static int sheepPriceSpawner = 700;
    public static int skeletonPriceSpawner = 750;
    public static int slimePriceSpawner = 650;
    public static int witchPriceSpawner = 700;
    public static int witherSkeletonPriceSpawner = 850;
    public static int villagerPriceSpawner = 800;
    public static int axolotlPriceSpawner = 350;
    public static int spiderPriceSpawner = 600;
    public static int caveSpiderPriceSpawner = 650;
    public static int drownedPriceSpawner = 650;
    public static int glowSquidPriceSpawner = 550;
    public static int mushroomPriceSpawner = 550;
    public static int piglinPriceSpawner = 600;
    public static int magmaCubePriceSpawner = 650;

    /*public static int price = ;
    public static int price = ;*/

    private final int baseMoney = 10;

    @EventHandler
    public void onPlayerPlaceBlock(BlockPlaceEvent e) {

        Player p = e.getPlayer();

        Block b = e.getBlock();

        World w = b.getWorld();

        ItemStack itemInHand = e.getItemInHand();

        if (itemInHand.getType() == Material.SPAWNER) {

            if (p.getGameMode() != GameMode.CREATIVE) {

                System.out.println(" not gamemode c");

            } else {
                System.out.println("gamemode c");
            }
        }


    }

    @EventHandler
    public void onInteractEvent(PlayerInteractEvent e) {
        if (e.hasBlock() && e.hasItem()) {
            ItemStack i = e.getItem();
            Block b = e.getClickedBlock();
            Player p = e.getPlayer();

            assert i != null;
            if (i.getType() == Material.SPAWNER) {
                assert b != null;
                b.setType(Material.SPAWNER);

                i.setAmount(i.getAmount() - 1);
                e.setCancelled(true);


            }


        }
    }




    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e)
    {
        Player p = e.getPlayer();

        if (!Maltrack.getInstance().getConfig().contains("money." + p.getName()))
        {
            Maltrack.getInstance().getConfig().set("money." + p.getName(), baseMoney);
            Maltrack.getInstance().saveConfig();
            p.sendMessage("Bienvenue Dans notre server j'espère que vous y resterer longtemps");
        }

        e.getPlayer().sendMessage("Bienvenue " + e.getPlayer().getDisplayName());
        e.getPlayer().getInventory().addItem(money);


    }

    @EventHandler
    public void onClickInInv(InventoryClickEvent e)
    {

        Inventory inv = e.getInventory();
        // System.out.println(invMain + " DDD");
        Player p = (Player) e.getWhoClicked();
        ItemStack c = e.getCurrentItem();
        if (c == null || !c.hasItemMeta()) return;
        boolean weAreInTheMainInventory = false;

        boolean thereAreTheCancelLogo = false;
        boolean weAreInTheBuyInventory = false;
        boolean weAreInTheSellInventory  = false;
        boolean weAreInEggApp = false;
        boolean weAreInEggAppTwo = false;
        boolean weAreInTheSpawnerInv = false;

        if (!e.getCurrentItem().getItemMeta().getDisplayName().contains("§"))
        {
            System.out.println("201");
            return;
        }else {
            System.out.println("204");
            e.setCancelled(true);
        }

        for(ItemStack i : inv.getContents())
        {
            if (i != null && e.getInventory().getHolder() == null) {
                if (Objects.requireNonNull(i.getItemMeta()).getDisplayName().equals(Objects.requireNonNull(logoBuy.getItemMeta()).getDisplayName())) {
                    weAreInTheMainInventory = true;

                }else if (Objects.requireNonNull(i.getItemMeta()).getDisplayName().equals(Objects.requireNonNull(cancelItem.getItemMeta()).getDisplayName()))
                {
                    thereAreTheCancelLogo = true;
                    // On n'est pas dans l'inventaire principal

                }
                else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(logoSpawner.getItemMeta()).getDisplayName()))
                {
                    weAreInTheBuyInventory = true;
                    // Main -> Buy
                }
                else if (i.getItemMeta().getDisplayName().equals(diamond.getItemMeta().getDisplayName()))
                {
                    weAreInTheSellInventory = true;
                    // Main -> Sell
                }else if (i.getItemMeta().getDisplayName().equals(zombie.getItemMeta().getDisplayName()))
                {
                    weAreInEggApp = true;
                    // Main -> Buy ->  Oeufs d'apparition
                }else if (i.getItemMeta().getDisplayName().equals(magmaCube.getItemMeta().getDisplayName()))
                {
                    weAreInEggAppTwo = true;
                    System.out.println("236");
                }else if(i.getItemMeta().getDisplayName().equals(zombieSpawner.getItemMeta().getDisplayName()))
                {
                    weAreInTheSpawnerInv = true;
                }

            }
        }

        if (weAreInTheMainInventory)
        {

            if(Objects.requireNonNull(c.getItemMeta()).getDisplayName().equals(logoBuy.getItemMeta().getDisplayName()))
            {
                p.closeInventory();
                p.openInventory(invBuy);
                return;


            }else if (c.getItemMeta().getDisplayName().equals(logoSell.getItemMeta().getDisplayName()))
            {

                p.closeInventory();
                p.openInventory(invSell);
                return;
            }


            weAreInTheMainInventory = false;

        }else if (thereAreTheCancelLogo) {

            thereAreTheCancelLogo = false;

            if (weAreInTheBuyInventory || weAreInTheSellInventory)
            {
                weAreInTheBuyInventory = false;
                weAreInTheSellInventory = false;
                if (Objects.requireNonNull(c.getItemMeta()).getDisplayName().equals(cancelItem.getItemMeta().getDisplayName())) {
                    p.closeInventory();
                    p.openInventory(invMain);

                    return;

                }

            }else if(weAreInEggApp)
            {
                weAreInEggApp = false;
                // weAreInTheSellInventory = false;

                if (Objects.requireNonNull(c.getItemMeta()).getDisplayName().equals(cancelItem.getItemMeta().getDisplayName())) {
                    p.closeInventory();
                    p.openInventory(invBuy);
                    return;
                }
                else if (c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(arrowAfter.getItemMeta()).getDisplayName()))
                {
                    p.closeInventory();
                    p.openInventory(invEggTwo);
                    return;
                }
            }else if(weAreInEggAppTwo)
            {
                weAreInEggAppTwo = false;

                if (c.getItemMeta().getDisplayName().equals(cancelItem.getItemMeta().getDisplayName()))
                {
                    p.closeInventory();
                    p.openInventory(invBuy);
                    return;
                }else if (c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(arrowBefore.getItemMeta()).getDisplayName()))
                {
                    p.closeInventory();
                    p.openInventory(invEgg);
                    return;
                }
            }else if (weAreInTheSpawnerInv)
            {
                if (c.getItemMeta().getDisplayName().equals(arrowAfter.getItemMeta().getDisplayName()))
                {
                    p.closeInventory();
                    p.openInventory(invSpawnerTwo);
                    return;

                }else if (c.getItemMeta().getDisplayName().equals(cancelItem.getItemMeta().getDisplayName()))
                {
                    p.closeInventory();
                    p.openInventory(invBuy);
                    return;
                }
            }


            String pathPlayer = "money." + p.getName();
            int money = Maltrack.getInstance().getConfig().getInt(pathPlayer);
            if (c.getItemMeta().getDisplayName().equals(logoSpawner.getItemMeta().getDisplayName()))
            {
                p.closeInventory();
                p.openInventory(invSpawner);
                return;
                    /*
                    if (priceSpawner <= money)
                    {
                        Maltrack.getInstance().getConfig().set(pathPlayer, money - priceSpawner);
                        p.getInventory().addItem(new ItemStack(Material.SPAWNER));
                        Maltrack.getInstance().saveConfig();
                        p.sendMessage("Vous venez d'acheter un spawner");
                    }else
                    {
                        p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (priceSpawner - money) + " money" );
                    }*/


            }else if (c.getItemMeta().getDisplayName().equals(logoEgg.getItemMeta().getDisplayName())){
                p.closeInventory();
                p.openInventory(invEgg);
            }
            else if (c.getItemMeta().getDisplayName().equals(zombie.getItemMeta().getDisplayName()))
            {
                if (zombiePrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - zombiePrice);
                    p.getInventory().addItem(new ItemStack(Material.ZOMBIE_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de zombie à "+ zombiePrice +" money.");
                }else {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (zombiePrice - money) + " money." );
                }
            }else if (c.getItemMeta().getDisplayName().equals(creeper.getItemMeta().getDisplayName()))
            {
                if (creeperPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - creeperPrice);
                    p.getInventory().addItem(new ItemStack(Material.CREEPER_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de creeper à " + creeperPrice + " money.");
                }else {
                        p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (creeperPrice - money) + " money." );
                    }
                }else if (c.getItemMeta().getDisplayName().equals(blaze.getItemMeta().getDisplayName()))
                {
                    if (blazePrice <= money)
                    {
                        Maltrack.getInstance().getConfig().set(pathPlayer, money - blazePrice);
                        p.getInventory().addItem(new ItemStack(Material.BLAZE_SPAWN_EGG));
                        Maltrack.getInstance().saveConfig();
                        p.sendMessage("Vous venez d'acheter un oeuf de blaze à " + blazePrice + " money.");
                    }else
                    {
                        p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (blazePrice - money) + " money." );
                    }
                }else if (c.getItemMeta().getDisplayName().equals(chicken.getItemMeta().getDisplayName()))
                {
                    if (chickenPrice <= money)
                    {
                        Maltrack.getInstance().getConfig().set(pathPlayer, money - chickenPrice);
                        p.getInventory().addItem(new ItemStack(Material.CHICKEN_SPAWN_EGG));
                        Maltrack.getInstance().saveConfig();
                        p.sendMessage("Vous venez d'acheter un oeuf de poulet à " + chickenPrice + " money.");
                    }else
                    {
                        p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (chickenPrice - money) + " money." );
                    }
                }

                else if (c.getItemMeta().getDisplayName().equals(cow.getItemMeta().getDisplayName()))
                {
                    if (cowPrice <= money)
                    {
                        Maltrack.getInstance().getConfig().set(pathPlayer, money - cowPrice);
                        p.getInventory().addItem(new ItemStack(Material.COW_SPAWN_EGG));
                        Maltrack.getInstance().saveConfig();
                        p.sendMessage("Vous venez d'acheter un oeuf de vache à " + cowPrice + " money." );
                    }else
                    {
                        p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (cowPrice - money) + " money." );
                    }
                }else if (c.getItemMeta().getDisplayName().equals(enderman.getItemMeta().getDisplayName()))
                {
                    if (EndermanPrice <= money)
                    {
                        Maltrack.getInstance().getConfig().set(pathPlayer, money - EndermanPrice);
                        p.getInventory().addItem(new ItemStack(Material.ENDERMAN_SPAWN_EGG));
                        Maltrack.getInstance().saveConfig();
                        p.sendMessage("Vous venez d'acheter un oeuf de enderman à " + EndermanPrice + " money.");
                    }else
                    {
                        p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (EndermanPrice - money) + " money." );
                    }
                }else if (c.getItemMeta().getDisplayName().equals(pig.getItemMeta().getDisplayName()))
                {
                    if (pigPrice <= money)
                    {
                        Maltrack.getInstance().getConfig().set(pathPlayer, money - pigPrice);
                        p.getInventory().addItem(new ItemStack(Material.PIG_SPAWN_EGG));
                        Maltrack.getInstance().saveConfig();
                        p.sendMessage("Vous venez d'acheter un oeuf de cochon à " + pigPrice + " money.");
                    }else
                    {
                        p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (pigPrice - money) + " money." );
                    }
                }else if (c.getItemMeta().getDisplayName().equals(rabbit.getItemMeta().getDisplayName()))
                {
                    if (rabbitPrice <= money)
                    {
                        Maltrack.getInstance().getConfig().set(pathPlayer, money - rabbitPrice);
                        p.getInventory().addItem(new ItemStack(Material.RABBIT_SPAWN_EGG));
                        Maltrack.getInstance().saveConfig();
                        p.sendMessage("Vous venez d'acheter un oeuf de lapin à " + rabbitPrice + " money.");
                    }else
                    {
                        p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (rabbitPrice - money) + " money." );
                    }
                }
                else if (c.getItemMeta().getDisplayName().equals(goat.getItemMeta().getDisplayName()))
            {
                if (GoatPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - GoatPrice);
                    p.getInventory().addItem(new ItemStack(Material.GOAT_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de chevre à " + GoatPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (GoatPrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(sheep.getItemMeta().getDisplayName()))
            {
                if (sheepPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - sheepPrice);
                    p.getInventory().addItem(new ItemStack(Material.SHEEP_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de mouton à " + sheepPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (sheepPrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(skeleton.getItemMeta().getDisplayName()))
            {
                if (skeletonPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - skeletonPrice);
                    p.getInventory().addItem(new ItemStack(Material.SKELETON_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de skelette à " + skeletonPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (skeletonPrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(slime.getItemMeta().getDisplayName()))
            {
                if (slimePrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - slimePrice);
                    p.getInventory().addItem(new ItemStack(Material.SLIME_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de slime à " + slimePrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (slimePrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(witch.getItemMeta().getDisplayName()))
            {
                if (witchPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - witchPrice);
                    p.getInventory().addItem(new ItemStack(Material.WITCH_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de sorcière à " + witchPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (witchPrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(witherSkeleton.getItemMeta().getDisplayName()))
            {
                if (witherSkeletonPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - witherSkeletonPrice);
                    p.getInventory().addItem(new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de wither skelette à " + witherSkeletonPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (witherSkeletonPrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(villager.getItemMeta().getDisplayName()))
            {
                if (villagerPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - villagerPrice);
                    p.getInventory().addItem(new ItemStack(Material.VILLAGER_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de villageois à " + villagerPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (villagerPrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(axolotl.getItemMeta().getDisplayName()))
            {
                if (axolotlPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - axolotlPrice);
                    p.getInventory().addItem(new ItemStack(Material.AXOLOTL_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de axolotl à " + axolotlPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (axolotlPrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(spider.getItemMeta().getDisplayName()))
            {
                if (spiderPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - spiderPrice);
                    p.getInventory().addItem(new ItemStack(Material.SPIDER_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf d'araignée à " + spiderPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (spiderPrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(caveSpider.getItemMeta().getDisplayName()))
            {
                if (caveSpiderPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - caveSpiderPrice);
                    p.getInventory().addItem(new ItemStack(Material.CAVE_SPIDER_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf d'araignée venimeuse à " + caveSpiderPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (caveSpiderPrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(drowned.getItemMeta().getDisplayName()))
            {
                if (drownedPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - drownedPrice);
                    p.getInventory().addItem(new ItemStack(Material.DROWNED_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de noyé à " + drownedPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (drownedPrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(glowSquid.getItemMeta().getDisplayName()))
            {
                if (glowSquidPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - glowSquidPrice);
                    p.getInventory().addItem(new ItemStack(Material.GLOW_SQUID_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de poulpe lumineux à " + glowSquidPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (glowSquidPrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(piglin.getItemMeta().getDisplayName()))
            {
                if (piglinPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - piglinPrice);
                    p.getInventory().addItem(new ItemStack(Material.PIGLIN_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de piglin à " + piglinPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (piglinPrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(magmaCube.getItemMeta().getDisplayName()))
            {
                if (magmaCubePrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - magmaCubePrice);
                    p.getInventory().addItem(new ItemStack(Material.MAGMA_CUBE_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de magma cube à " + magmaCubePrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (magmaCubePrice - money) + " money." );
                }
            }
            else if (c.getItemMeta().getDisplayName().equals(mushroom.getItemMeta().getDisplayName()))
            {
                if (mushroomPrice <= money)
                {
                    Maltrack.getInstance().getConfig().set(pathPlayer, money - mushroomPrice);
                    p.getInventory().addItem(new ItemStack(Material.MOOSHROOM_SPAWN_EGG));
                    Maltrack.getInstance().saveConfig();
                    p.sendMessage("Vous venez d'acheter un oeuf de mushroom à " + mushroomPrice + " money.");
                }else
                {
                    p.sendMessage("Vous n'avez pas assez de money il vous manque : "+ (mushroomPrice - money) + " money." );
                }
            }



                /*
                *
    public static int SpiderCavePrice = 350;
    public static int drownedPrice = 350;
    public static int glowSquidPrice = 250;
                * */

                weAreInTheBuyInventory = false;
            }


        }



        public void changeSpawn(ItemStack spawner, EntityType e){

        BlockStateMeta spawnerMeta = (BlockStateMeta) spawner.getItemMeta();
        if (spawnerMeta != null && spawner != null){
            CreatureSpawner creatureSpawner = (CreatureSpawner) spawnerMeta.getBlockState();
            creatureSpawner.setSpawnedType(e);
            spawnerMeta.setBlockState(creatureSpawner);
            spawner.setItemMeta(spawnerMeta);
        }else{
            System.out.println("Spawner Meta == null || Spawner == null");
        }
    }

}






/*public static ItemStack zombieSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack creeperSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack blazeSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack chickenSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack cowSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack endermanSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack pigSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack rabbitSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack goatSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack sheepSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack skeletonSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack slimeSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack witchSpawner = new ItemStack(Material.SPAWNER);
    public static ItemStack witherSkeletonSpawner = new ItemStack(Material.SPAWNER);


    public static ItemStack zombieSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack creeperSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack blazeSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack chickenSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack cowSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack endermanSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack pigSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack rabbitSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack goatSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack sheepSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack skeletonSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack slimeSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack witchSpawnerFake = new ItemStack(Material.SPAWNER);
    public static ItemStack witherSkeletonSpawnerFake = new ItemStack(Material.SPAWNER);*/


 /*  private void verifChange(ItemStack i)
       {
           if(i.getItemMeta().getDisplayName().equals(zombieSpawnerFake.getItemMeta().getDisplayName()))
           {
               ChangeItemMeta.changeItemMeta(i, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, zombieSpawnerFake.getItemMeta().getDisplayName(), EntityType.ZOMBIE);
           }
           else if(i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(creeperSpawnerFake.getItemMeta()).getDisplayName()))
           {
               ChangeItemMeta.changeItemMeta(i, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, i.getItemMeta().getDisplayName(), EntityType.CREEPER);
           }
          else if(i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(blazeSpawnerFake.getItemMeta()).getDisplayName()))
           {
               ChangeItemMeta.changeItemMeta(i, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, .getItemMeta().getDisplayName(), EntityType.);
           }
           else if(i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(chickenSpawnerFake.getItemMeta()).getDisplayName()))
           {

           }
           else if(i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(cowSpawnerFake.getItemMeta()).getDisplayName()))
           {

           }
           else if(i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(endermanSpawnerFake.getItemMeta()).getDisplayName()))
           {

           }
           else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(pigSpawnerFake.getItemMeta()).getDisplayName()))
           {
               p.getInventory().addItem(pigSpawnerFake);
           }
           else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(rabbitSpawnerFake.getItemMeta()).getDisplayName()))
           {

           }
           else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(goatSpawnerFake.getItemMeta()).getDisplayName()))
           {

           }
           else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(sheepSpawner.getItemMeta()).getDisplayName()))
           {

           }
           else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(skeletonSpawner.getItemMeta()).getDisplayName()))
           {
               p.getInventory().addItem(skeletonSpawnerFake);
           }
           else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(slimeSpawner.getItemMeta()).getDisplayName()))
           {
               p.getInventory().addItem(slimeSpawnerFake);
           }
           else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(witchSpawner.getItemMeta()).getDisplayName()))
           {
               p.getInventory().addItem(witchSpawnerFake);
           }
           else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(witherSkeletonSpawner.getItemMeta()).getDisplayName()))
           {
               p.getInventory().addItem(witherSkeletonSpawnerFake);
           }
       }*/
   /* private int verifChange(ItemStack i) {
        if (i.getItemMeta().getDisplayName().equals(zombieSpawnerFake.getItemMeta().getDisplayName())) {
            return 1;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(creeperSpawnerFake.getItemMeta()).getDisplayName())) {
            return 2;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(blazeSpawnerFake.getItemMeta()).getDisplayName())) {
            return 3;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(chickenSpawnerFake.getItemMeta()).getDisplayName())) {
            return 4;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(cowSpawnerFake.getItemMeta()).getDisplayName())) {
            return 5;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(endermanSpawnerFake.getItemMeta()).getDisplayName())) {
            return 6;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(pigSpawnerFake.getItemMeta()).getDisplayName())) {
            return 7;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(rabbitSpawnerFake.getItemMeta()).getDisplayName())) {
            return 8;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(goatSpawnerFake.getItemMeta()).getDisplayName())) {
            return 9;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(sheepSpawnerFake.getItemMeta()).getDisplayName())) {
            return 10;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(skeletonSpawnerFake.getItemMeta()).getDisplayName())) {
            return 11;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(slimeSpawnerFake.getItemMeta()).getDisplayName())) {
            return 12;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(witchSpawnerFake.getItemMeta()).getDisplayName())) {
            return 13;
        } else if (i.getItemMeta().getDisplayName().equals(Objects.requireNonNull(witherSkeletonSpawnerFake.getItemMeta()).getDisplayName())) {
            return 14;
        }
        return 15;
    }*/


                /*if(c.getItemMeta().getDisplayName().equals(zombieSpawner.getItemMeta().getDisplayName()))
                {
                    p.getInventory().addItem(zombieSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(creeperSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(creeperSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(blazeSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(blazeSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(chickenSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(chickenSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(cowSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(cowSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(endermanSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(endermanSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(pigSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(pigSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(rabbitSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(rabbitSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(goatSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(goatSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(sheepSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(sheepSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(skeletonSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(skeletonSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(slimeSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(slimeSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(witchSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(witchSpawnerFake);
                }
                else if(c.getItemMeta().getDisplayName().equals(Objects.requireNonNull(witherSkeletonSpawner.getItemMeta()).getDisplayName()))
                {
                    p.getInventory().addItem(witherSkeletonSpawnerFake);
                }
                /*else if(c.getItemMeta().getDisplayName() == .getItemMeta().getDisplayName())
                {

                }*/