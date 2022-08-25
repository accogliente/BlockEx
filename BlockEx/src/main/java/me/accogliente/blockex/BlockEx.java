package me.accogliente.blockex;

import Events.Events;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlockEx extends JavaPlugin {

    //reg. config.yml
    FileConfiguration config = getConfig();

    @Override
    public void onEnable() {

        //enabled message
        getServer().getConsoleSender().sendMessage("[BlockEx] Enabled!");

        //Listener's reg.
        getServer().getPluginManager().registerEvents(new Events(), this);

        //config.yml
        config.addDefault("Enable-Break-Messages", true);
        config.addDefault("Enable-Place-Messages", true);
        config.options().copyDefaults(true);

    }

    @Override
    public void onDisable() {

        //disabled message
        getServer().getConsoleSender().sendMessage("[BlockEx] Disabled!");
    }
}
