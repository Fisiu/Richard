package pl.fidano.java.command;

import org.javacord.api.entity.message.MessageAuthor;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.exception.MissingPermissionsException;
import org.javacord.api.listener.message.MessageCreateListener;
import org.javacord.api.util.logging.ExceptionLogger;

public class Help implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessage().getContent().equalsIgnoreCase("!help")) {
            MessageAuthor author = event.getMessage().getAuthor();

            EmbedBuilder embed = new EmbedBuilder()
                    .setTitle("Richard wykonuje poniższe polecenia:")
                    .addField("!help", "Wyświetla pomoc", false)
                    .addField("!ping", "Odpowiada na ping", false)
                    .addField("!imp", "Ustawia wiadomość jako ogłoszenie", true)
                    .addField("przykład", "!imp Jutro pracuję z domu", true);

            event.getChannel().sendMessage(embed)
                    .exceptionally(ExceptionLogger.get(MissingPermissionsException.class));
        }
    }
}
