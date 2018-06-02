package pl.fidano.java.utils;

import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.user.UserStatus;
import org.javacord.api.event.user.UserChangeStatusEvent;
import org.javacord.api.listener.user.UserChangeStatusListener;


public class Welcome implements UserChangeStatusListener {

    private static final String CHANNEL_ID = System.getenv("WELCOME_CHANNEL_ID");
    private static final Sentences SENTENCES = new Sentences();

    @Override
    public void onUserChangeStatus(UserChangeStatusEvent event) {
        if (event.getNewStatus().equals(UserStatus.ONLINE)) {
            Sentence sentence = SENTENCES.getRandomSequence();

            new MessageBuilder()
                    .append("Dzień dobry, ")
                    .append(event.getUser())
                    .appendNewLine()
                    .append(String.format("%s ~ %s", sentence.getSentence(), sentence.getAuthor()))
                    .send(event.getApi().getTextChannelById(CHANNEL_ID).get());
        }
    }
}
