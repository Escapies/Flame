package me.escapies.flame.selector;

import me.escapies.flame.Flame;
import me.escapies.flame.utils.YamlDoc;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SelectorMenu {

    public void openInventory(Player player)
    {
        YamlDoc config = Flame.getInstance().getConfigYML();
        Inventory inv = Bukkit.createInventory(null, config.gc().getInt("SELECTOR-SIZE"), config.gc().getString("SELECTOR-TITLE"));

        

        
    }
}
