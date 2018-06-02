package pl.fidano.java.command;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.exception.MissingPermissionsException;
import org.javacord.api.listener.message.MessageCreateListener;
import org.javacord.api.util.logging.ExceptionLogger;

public class PingPong implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessage().getContent().equalsIgnoreCase("!ping")) {
            event.getChannel().sendMessage("pong!").exceptionally(ExceptionLogger.get(MissingPermissionsException.class));
        }
    }
}
