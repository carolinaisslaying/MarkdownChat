package icu.carolinainthe.markdownchat;

import de.themoep.minedown.adventure.MineDown;
import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public final class ChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncChatEvent event) {
        if (event.getPlayer().hasPermission("markdownchat.use")) {
            TextComponent textComponent = (TextComponent) event.message();

            event.message(MineDown.parse(textComponent.content()));
        }
    }
}
