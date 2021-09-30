package stepik.basiccourse.interesting.mail.service;

import stepik.basiccourse.interesting.mail.sendable.MailPackage;
import stepik.basiccourse.interesting.mail.sendable.Sendable;
import stepik.basiccourse.interesting.mail.exception.IllegalPackageException;
import stepik.basiccourse.interesting.mail.exception.StolenPackageException;

public class Inspector implements MailService {
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";


    @Override
    public Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException {
        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getContent().contains(WEAPONS) || (mailPackage.getContent().getContent().contains(BANNED_SUBSTANCE))) {
                throw new IllegalPackageException();
            } else if (mailPackage.getContent().getContent().contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
