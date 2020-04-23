package yotuba.MineApex;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.potion.Effect;

public class Main extends PluginBase implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onCommand(Command command, CommandSender sender, String label, String[] args) {
        String senderName = sender.getName();
        Player player = sender.getServer().getPlayer(senderName);

        if(label == "apex") switch (args[0]) {
            case "octane":
                sender.sendMessage("Fasterfasterfaster....!!!!");
                player.addEffect(Effect.getEffect(1).setDuration(6 * 20).setAmplifier(3).setVisible(false));
        }
    }
}