package mohaimen.dice.mdice2

import org.bukkit.plugin.java.JavaPlugin

class Mdice2 : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        getCommand("mdice")?.setExecutor(mohadice)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}