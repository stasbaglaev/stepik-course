package stepik.basiccourse.interesting.mail.service;

import stepik.basiccourse.interesting.mail.sendable.Sendable;

public class UntrustworthyMailWorker implements MailService {

    private static final RealMailService realMailService = new RealMailService();
    private final MailService[] otherServices;

    public UntrustworthyMailWorker(final MailService[] otherServices) {
        this.otherServices = otherServices;
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService service : otherServices) {
            service.processMail(mail);
        }
        return realMailService.processMail(mail);
    }
}
