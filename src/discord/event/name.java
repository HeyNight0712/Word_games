package discord.event;

import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.events.message.GenericMessageEvent;

public class name extends ListenerAdapter {

    public void GenericMessageEvent(GenericMessageEvent event) {
        String msg = event.getMessageId();
        if (msg.equalsIgnoreCase("hi")) {
            event.getChannel().sendMessage("HI").queue();
        }
    }
}
