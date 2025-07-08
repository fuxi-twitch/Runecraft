package org.fuxi.runecraft;

import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;
import org.fuxi.runecraft.Commands.ClassCommand;

public final class Runecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("class").setExecutor(new ClassCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}