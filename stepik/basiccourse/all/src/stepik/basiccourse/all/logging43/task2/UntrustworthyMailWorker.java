package stepik.basiccourse.all.logging43.task2;

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
