package me.escapies.flame;

import lombok.Getter;
import lombok.SneakyThrows;
import me.escapies.flame.listener.PlayerListener;
import me.escapies.flame.utils.YamlDoc;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Flame extends JavaPlugin {

    @Getter private static Flame instance;
    @Getter private YamlDoc configYML;

    @Override
    public void onEnable()
    {
        instance = this;
        registerConfig();
        registerListeners();
    }

    private void registerListeners()
    {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerListener(), this);
    }

    @SneakyThrows
    private void registerConfig()
    {
        saveDefaultConfig();
        configYML = new YamlDoc(getDataFolder(), "config.yml"); // "use default bukkit wah wah"
        configYML.init();
    }
}
