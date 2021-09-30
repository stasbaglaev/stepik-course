package stepik.basiccourse.interesting.mail.service;

import stepik.basiccourse.interesting.mail.sendable.Sendable;
import stepik.basiccourse.interesting.mail.exception.IllegalPackageException;
import stepik.basiccourse.interesting.mail.exception.StolenPackageException;

/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
public interface MailService {
    Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException;
}
