package Events;

import me.accogliente.blockex.BlockEx;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Events implements Listener {

    //Main class import
    BlockEx plugin;

    //Break Block
    @EventHandler
    public void blockbreak(BlockBreakEvent event){
        Player player = event.getPlayer();
        Block block = event.getBlock();
        Location loc = block.getLocation();

        player.sendMessage(ChatColor.YELLOW + "Вы " +
                ChatColor.RED + "Сломали " +
                ChatColor.YELLOW + "на координатах " +
                ChatColor.GOLD + "X: " + loc.getX() +
                "Y: " +  loc.getY() +
                "Z: " +  loc.getZ());
    }


}
