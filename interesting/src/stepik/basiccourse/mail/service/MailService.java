package stepik.basiccourse.mail.service;

import stepik.basiccourse.mail.sendable.Sendable;
import stepik.basiccourse.mail.exception.IllegalPackageException;
import stepik.basiccourse.mail.exception.StolenPackageException;

/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
public interface MailService {
    Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException;
}
