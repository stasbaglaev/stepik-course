package stepik.basiccourse.mail.service;

import stepik.basiccourse.mail.sendable.MailPackage;
import stepik.basiccourse.mail.sendable.Package;
import stepik.basiccourse.mail.sendable.Sendable;

public class Thief implements MailService {
    private final int minValueToSteal;
    private int stolenValue = 0;

    public Thief(int minValueToSteal) {
        this.minValueToSteal = minValueToSteal;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            Package content = ((MailPackage) mail).getContent();
            if (content.getPrice() >= minValueToSteal) {
                stolenValue += content.getPrice();
                return new MailPackage(mail.getFrom(), mail.getTo(), new Package(String.format("stones instead of %s", content.getContent()), 0));
            } else {
                return mail;
            }
        }
        return mail;
    }
}
