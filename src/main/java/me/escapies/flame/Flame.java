package me.escapies.flame;

import lombok.Getter;
import me.escapies.flame.utils.YamlDoc;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Flame extends JavaPlugin {

    @Getter private static Flame instance;
    @Getter private YamlDoc ConfigYML;

    @Override
    public void onEnable()
    {
        instance = this;
        registerListeners();
    }

    private void registerListeners()
    {
        PluginManager pm = getServer().getPluginManager();

    }
}
