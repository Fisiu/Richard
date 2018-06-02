package pl.fidano.java;

import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.util.logging.ExceptionLogger;
import pl.fidano.java.command.PingPong;
import pl.fidano.java.utils.Welcome;

public class Richard {

    final static String DISCORD_TOKEN = System.getenv("DISCORD_TOKEN");

    public static void main(String[] args) {

        if (DISCORD_TOKEN == null || DISCORD_TOKEN.isEmpty()) {
            System.err.println("Please set DISCORD_TOKEN environment variable first !");
            return;
        }

        new DiscordApiBuilder().setToken(DISCORD_TOKEN).login().thenAccept(api -> {

            // Print the invite url of your bot
            System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());

            api.addMessageCreateListener(new PingPong());

            api.addUserChangeStatusListener(new Welcome());

        }).exceptionally(ExceptionLogger.get());
    }
}
