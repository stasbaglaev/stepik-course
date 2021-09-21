package stepik.basiccourse.all.logging43.task2;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Spy implements MailService {
    public static final String AUSTIN_POWERS = "Austin Powers";

    private final Logger LOGGER;
    ConsoleHandler consoleHandler = new ConsoleHandler();

    public Spy(final Logger LOGGER) {
        this.LOGGER = LOGGER;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if (mail.getTo().equals(AUSTIN_POWERS) || (mail.getFrom().equals(AUSTIN_POWERS))) {
                LOGGER.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"", new Object[]{((MailMessage) mail).from, ((MailMessage) mail).to, ((MailMessage) mail).getMessage()});
            } else {
                LOGGER.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[]{((MailMessage) mail).from, ((MailMessage) mail).to});
            }
            consoleHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(consoleHandler);
        }
        return mail;
    }
}
