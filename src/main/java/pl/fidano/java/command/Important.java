package pl.fidano.java.command;

import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.MessageDecoration;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.exception.MissingPermissionsException;
import org.javacord.api.listener.message.MessageCreateListener;
import org.javacord.api.util.logging.ExceptionLogger;

public class Important implements MessageCreateListener {

    private static final String CHANNEL_ID = System.getenv("IMPORTANT_CHANNEL_ID");
    private String message;
    private String answer;

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        message = event.getMessage().getContent();

        if (message.toLowerCase().startsWith("!imp")) {
            answer = "Not implemented yet";

            if (message.equalsIgnoreCase("!imp") || message.equalsIgnoreCase("!imp ")) {
                answer = "Zapomniałeś wpisać wiadomości?";

                event.getChannel()
                    .sendMessage(answer)
                    .exceptionally(ExceptionLogger.get(MissingPermissionsException.class));
                return;
            }

            new MessageBuilder()
                .append(String.format("%s: ", event.getMessage().getAuthor().getName()), MessageDecoration.BOLD)
                .append(message.substring(5))
                .send(event.getApi().getTextChannelById(CHANNEL_ID).get())
                .exceptionally(ExceptionLogger.get(MissingPermissionsException.class));
        }
    }
}
