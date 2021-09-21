package stepik.basiccourse.all.logging43.task2;

/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
public interface MailService {
    Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException;
}
