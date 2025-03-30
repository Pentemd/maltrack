package fr.pentalonwaterprouf.maltrack.functions;

import fr.pentalonwaterprouf.maltrack.listener.EventListener;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import java.awt.*;

import static fr.pentalonwaterprouf.maltrack.functions.ChangeItemMeta.changeItemMeta;

public class Functions {


    public static void onEnable(ItemStack money, ItemStack logoSell, ItemStack logoBuy, ItemStack cancelItem)
    {
        changeItemMeta(money, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§2§lThe Money");



        // changeItemMeta(, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§l");



        changeItemMeta(logoSell, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§2Sell");
        changeItemMeta(logoBuy, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§4Buy");
        changeItemMeta(cancelItem, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§4Retour");
        changeItemMeta(EventListener.logoSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§4Spawner");
        changeItemMeta(EventListener.logoEgg, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§4Oeuf de d'apparition");
        changeItemMeta(EventListener.diamond, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§aVendre Diamant");
        changeItemMeta(EventListener.arrowAfter, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§3Page Suivante");
        changeItemMeta(EventListener.arrowBefore, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§3Page précédente");

/*

        ItemMeta customLogoSell = logoSell.getItemMeta();
        assert customLogoSell != null;
        customLogoSell.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        customLogoSell.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        customLogoSell.setDisplayName("§2§lSell");
        logoSell.setItemMeta(customLogoSell);

        ItemMeta customLogoBuy = logoBuy.getItemMeta();
        assert customLogoBuy != null;
        customLogoBuy.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        customLogoBuy.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        customLogoBuy.setDisplayName("§4§lBuy");
        logoBuy.setItemMeta(customLogoBuy);

        ItemMeta customCancel = cancelItem.getItemMeta();
        assert customCancel != null;
        customCancel.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        customCancel.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        customCancel.setDisplayName("§4§lRetour");
        cancelItem.setItemMeta(customCancel);*/


    }


    public static void onEnableInv(Inventory invMain, ItemStack logoBuy, ItemStack sell, ItemStack cancelItem, Inventory invSell, Inventory invBuy, Inventory invSpawner, Inventory invEgg)
    {
        invMain.setItem(11, logoBuy);
        invMain.setItem(15, sell);

        invSell.setItem(40, cancelItem); // 28 cancel

        // Buy Inventory
        invBuy.setItem(40, cancelItem);
        invEgg.setItem(40, cancelItem);
        invSpawner.setItem(40, cancelItem);
        EventListener.invSpawnerTwo.setItem(40, cancelItem);
        EventListener.invEggTwo.setItem(40, cancelItem);
        EventListener.invEggTwo.setItem(39, EventListener.arrowBefore);

        invEgg.setItem(41, EventListener.arrowAfter);


        EventListener.invSpawnerTwo.setItem(39, EventListener.arrowBefore);

        invSpawner.setItem(41, EventListener.arrowAfter);


        invSell.setItem(10, EventListener.diamond);

        //invBuy.setItem(4, EventListener.spawner);

        invEgg.setItem(10, EventListener.zombie);
        invEgg.setItem(11,EventListener.creeper);
        invEgg.setItem(12,EventListener.enderman);
        invEgg.setItem(13,EventListener.skeleton);
        invEgg.setItem(14,EventListener.slime);
        invEgg.setItem(15,EventListener.witch);
        invEgg.setItem(16,EventListener.witherSkeleton);
        invEgg.setItem(19,EventListener.blaze);
        invEgg.setItem(21,EventListener.caveSpider);
        invEgg.setItem(20,EventListener.spider);
        invEgg.setItem(22,EventListener.drowned);
        invEgg.setItem(23, EventListener.piglin);
        invEgg.setItem(24,EventListener.glowSquid);
        invEgg.setItem(25,EventListener.axolotl);
        invEgg.setItem(28,EventListener.sheep);
        invEgg.setItem(29,EventListener.chicken);
        invEgg.setItem(30,EventListener.cow);
        invEgg.setItem(31,EventListener.goat);
        invEgg.setItem(32,EventListener.pig);
        invEgg.setItem(33,EventListener.rabbit);
        invEgg.setItem(34,EventListener.villager);



        EventListener.invEggTwo.setItem(10, EventListener.magmaCube);
        EventListener.invEggTwo.setItem(11, EventListener.mushroom);

        invSpawner.setItem(10, EventListener.zombieSpawner);
        invSpawner.setItem(11,EventListener.creeperSpawner);
        invSpawner.setItem(12,EventListener.endermanSpawner);
        invSpawner.setItem(13,EventListener.skeletonSpawner);
        invSpawner.setItem(14,EventListener.slimeSpawner);
        invSpawner.setItem(15,EventListener.witchSpawner);
        invSpawner.setItem(16,EventListener.witherSkeletonSpawner);
        invSpawner.setItem(19,EventListener.blazeSpawner);
        invSpawner.setItem(21,EventListener.caveSpiderSpawner);
        invSpawner.setItem(20,EventListener.spiderSpawner);
        invSpawner.setItem(22,EventListener.drownedSpawner);
        invSpawner.setItem(23, EventListener.piglinSpawner);
        invSpawner.setItem(24,EventListener.glowSquidSpawner);
        invSpawner.setItem(25,EventListener.axolotlSpawner);
        invSpawner.setItem(28,EventListener.sheepSpawner);
        invSpawner.setItem(29,EventListener.chickenSpawner);
        invSpawner.setItem(30,EventListener.cowSpawner);
        invSpawner.setItem(31,EventListener.goatSpawner);
        invSpawner.setItem(32,EventListener.pigSpawner);
        invSpawner.setItem(33,EventListener.rabbitSpawner);
        invSpawner.setItem(34, EventListener.mushroomSpawner);

        EventListener.invSpawnerTwo.setItem(10, EventListener.magmaCubeSpawner);



        invBuy.setItem(11, EventListener.logoSpawner);
        invBuy.setItem(15, EventListener.logoEgg);

        /*
        invBuy.setItem(10, EventListener.zombie);
        invBuy.setItem(11,EventListener.creeper);
        invBuy.setItem(12,EventListener.enderman);
        invBuy.setItem(13,EventListener.skeleton);
        invBuy.setItem(14,EventListener.slime);
        invBuy.setItem(15,EventListener.witch);
        invBuy.setItem(16,EventListener.witherSkeleton);
        invBuy.setItem(19,EventListener.blaze);
        invBuy.setItem(20,EventListener.sheep);
        invBuy.setItem(21,EventListener.chicken);
        invBuy.setItem(22,EventListener.cow);
        invBuy.setItem(23,EventListener.goat);
        invBuy.setItem(24,EventListener.pig);
        invBuy.setItem(25,EventListener.rabbit);
        invBuy.setItem(28,EventListener.villager);
         */
        /*invBuy.setItem(30,);
        invBuy.setItem(31,);
        invBuy.setItem(32,);
        invBuy.setItem(33,);
        invBuy.setItem(34,);
        invBuy.setItem(35,);*/




    }
    public static void onEnableSpawner()
    {
        changeItemMeta(EventListener.blaze, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Blaze");
        changeItemMeta(EventListener.chicken, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Poulet");
        changeItemMeta(EventListener.cow, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Vache");
        changeItemMeta(EventListener.creeper, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Creeper");
        changeItemMeta(EventListener.enderman, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Enderman");
        changeItemMeta(EventListener.zombie, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Zombie");
        changeItemMeta(EventListener.goat, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Chevre");
        changeItemMeta(EventListener.pig, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Cochon");
        changeItemMeta(EventListener.rabbit, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Lapin");
        changeItemMeta(EventListener.sheep, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Mouton");
        changeItemMeta(EventListener.skeleton, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Squelette");
        changeItemMeta(EventListener.witch, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Sorcières");
        changeItemMeta(EventListener.slime, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Slime");
        changeItemMeta(EventListener.witherSkeleton, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Wither Squelette");
        changeItemMeta(EventListener.axolotl, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de Axolotl");
        changeItemMeta(EventListener.caveSpider, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf d'araignée venimeuse ");
        changeItemMeta(EventListener.spider, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf d'araignée");
        changeItemMeta(EventListener.drowned, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de zombie noyé");
        changeItemMeta(EventListener.glowSquid, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de poulpe lumineux");
        changeItemMeta(EventListener.villager, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de villageois");
        changeItemMeta(EventListener.magmaCube, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de cube de magma");
        changeItemMeta(EventListener.piglin, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de piglin");
        changeItemMeta(EventListener.mushroom, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§loeuf de mushroom");


        changeItemMeta(EventListener.blazeSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Blaze", EntityType.BLAZE);
        changeItemMeta(EventListener.chickenSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Poulet", EntityType.CHICKEN);
        changeItemMeta(EventListener.cowSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Vache", EntityType.COW);
        changeItemMeta(EventListener.creeperSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Creeper", EntityType.CREEPER);
        changeItemMeta(EventListener.endermanSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Enderman", EntityType.ENDERMAN);
        changeItemMeta(EventListener.zombieSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Zombie", EntityType.ZOMBIE);
        changeItemMeta(EventListener.goatSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Chevre", EntityType.GOAT);
        changeItemMeta(EventListener.pigSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Cochon", EntityType.PIG);
        changeItemMeta(EventListener.rabbitSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Lapin", EntityType.RABBIT);
        changeItemMeta(EventListener.sheepSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Mouton", EntityType.SHEEP);
        changeItemMeta(EventListener.skeletonSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Squelette", EntityType.SKELETON);
        changeItemMeta(EventListener.witchSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Sorcières", EntityType.WITCH);
        changeItemMeta(EventListener.slimeSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Slime", EntityType.SLIME);
        changeItemMeta(EventListener.witherSkeletonSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à Wither Squelette", EntityType.WITHER_SKELETON);
        changeItemMeta(EventListener.caveSpiderSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à araignée venimeuse", EntityType.CAVE_SPIDER);
        changeItemMeta(EventListener.drownedSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à noyé", EntityType.DROWNED);
        changeItemMeta(EventListener.glowSquidSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à poulpe lumineux ", EntityType.GLOW_SQUID);
        changeItemMeta(EventListener.mushroomSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à mushroom", EntityType.MUSHROOM_COW);
        changeItemMeta(EventListener.piglinSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à piglin", EntityType.PIGLIN);
        changeItemMeta(EventListener.magmaCubeSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à magma cube", EntityType.MAGMA_CUBE);
        changeItemMeta(EventListener.spiderSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à araignées", EntityType.SPIDER);
        changeItemMeta(EventListener.axolotlSpawner, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à axolotl", EntityType.AXOLOTL);



        changeItemMeta(EventListener.blazeSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Blaze");
        changeItemMeta(EventListener.chickenSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Poulet");
        changeItemMeta(EventListener.cowSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Vache");
        changeItemMeta(EventListener.creeperSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Creeper");
        changeItemMeta(EventListener.endermanSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Enderman");
        changeItemMeta(EventListener.zombieSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Zombie");
        changeItemMeta(EventListener.goatSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Chevre");
        changeItemMeta(EventListener.pigSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Cochon");
        changeItemMeta(EventListener.rabbitSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Lapin");
        changeItemMeta(EventListener.sheepSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Mouton");
        changeItemMeta(EventListener.skeletonSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Squelette");
        changeItemMeta(EventListener.witchSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Sorcières");
        changeItemMeta(EventListener.slimeSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Slime");
        changeItemMeta(EventListener.witherSkeletonSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à Wither Squelette");
        changeItemMeta(EventListener.caveSpiderSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à araignée venimeuse");
        changeItemMeta(EventListener.drownedSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à noyé");
        changeItemMeta(EventListener.glowSquidSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à poulpe lumineux ");
        changeItemMeta(EventListener.mushroomSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à mushroom");
        changeItemMeta(EventListener.piglinSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à piglin");
        changeItemMeta(EventListener.magmaCubeSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à magma cube");
        changeItemMeta(EventListener.spiderSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "Spawner à araignées");
        changeItemMeta(EventListener.axolotlSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§9§lSpawner à axolotl");


        /*changeItemMeta(EventListener.blazeSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Blaze", EntityType.BLAZE);
        changeItemMeta(EventListener.chickenSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Poulet", EntityType.CHICKEN);
        changeItemMeta(EventListener.cowSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Vache", EntityType.COW);
        changeItemMeta(EventListener.creeperSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Creeper", EntityType.CREEPER);
        changeItemMeta(EventListener.endermanSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Enderman", EntityType.ENDERMAN);
        changeItemMeta(EventListener.zombieSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Zombie", EntityType.ZOMBIE);
        changeItemMeta(EventListener.goatSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Chevre", EntityType.GOAT);
        changeItemMeta(EventListener.pigSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Cochon", EntityType.PIG);
        changeItemMeta(EventListener.rabbitSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Lapin", EntityType.RABBIT);
        changeItemMeta(EventListener.sheepSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Mouton", EntityType.SHEEP);
        changeItemMeta(EventListener.skeletonSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Squelette", EntityType.SKELETON);
        changeItemMeta(EventListener.witchSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Sorcières", EntityType.WITCH);
        changeItemMeta(EventListener.slimeSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Slime", EntityType.SLIME);
        changeItemMeta(EventListener.witherSkeletonSpawnerFake, Enchantment.DURABILITY, ItemFlag.HIDE_ENCHANTS, "§lSpawner à Wither Squelette", EntityType.WITHER_SKELETON);
*/
    }

}
