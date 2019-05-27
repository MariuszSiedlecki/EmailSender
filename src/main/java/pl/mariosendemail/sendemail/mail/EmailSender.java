package pl.mariosendemail.sendemail.mail;

public interface EmailSender {
    void senderEmail(String to, String subject, String body);
}
