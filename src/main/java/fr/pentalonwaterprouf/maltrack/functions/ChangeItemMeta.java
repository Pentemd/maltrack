package fr.pentalonwaterprouf.maltrack.functions;

import org.bukkit.block.CreatureSpawner;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;

import javax.swing.text.html.parser.Entity;

public class ChangeItemMeta {

    public static void changeItemMeta(ItemStack itemToChangeMeta, ItemMeta itemMeta)
    {
        itemToChangeMeta.setItemMeta(itemMeta);
    }

    public static void changeItemMeta(ItemStack itemToChangeMeta, Enchantment enchantment, ItemFlag itemFlag, String name)
    {
        ItemMeta itemMeta = itemToChangeMeta.getItemMeta();
        assert itemMeta != null;
        itemMeta.setDisplayName(name);
        itemMeta.addEnchant(enchantment, 1, true);
        itemMeta.addItemFlags(itemFlag);
        itemToChangeMeta.setItemMeta(itemMeta);
    }
    public static void changeItemMeta(ItemStack itemToChangeMeta, Enchantment enchantment, ItemFlag itemFlag, String name, int lvlEnchant)
    {
        ItemMeta itemMeta = itemToChangeMeta.getItemMeta();
        assert itemMeta != null;
        itemMeta.setDisplayName(name);
        itemMeta.addEnchant(enchantment, lvlEnchant, true);
        itemMeta.addItemFlags(itemFlag);
        itemToChangeMeta.setItemMeta(itemMeta);
    }
    public static void changeItemMeta(ItemStack itemToChangeMeta, Enchantment enchantment, ItemFlag itemFlag, String name, int lvlEnchant, boolean ignoreLevelRestriction)
    {
        ItemMeta itemMeta = itemToChangeMeta.getItemMeta();
        assert itemMeta != null;
        itemMeta.setDisplayName(name);
        itemMeta.addEnchant(enchantment, lvlEnchant, ignoreLevelRestriction);
        itemMeta.addItemFlags(itemFlag);
        itemToChangeMeta.setItemMeta(itemMeta);
    }

    public static void changeItemMeta(ItemStack itemToChangeMeta,Enchantment enchantment, ItemFlag itemFlag, String name, EntityType e)
    {

        BlockStateMeta spawnerMeta = (BlockStateMeta) itemToChangeMeta.getItemMeta();
        if (spawnerMeta != null && itemToChangeMeta != null){
            CreatureSpawner creatureSpawner = (CreatureSpawner) spawnerMeta.getBlockState();
            creatureSpawner.setSpawnedType(e);
            spawnerMeta.setBlockState(creatureSpawner);
            spawnerMeta.setDisplayName(name);
            spawnerMeta.addEnchant(enchantment, 1, true);
            spawnerMeta.addItemFlags(itemFlag);
            itemToChangeMeta.setItemMeta(spawnerMeta);
        }else{
            System.out.println("Spawner Meta == null || Spawner == null");
        }

    }


}
