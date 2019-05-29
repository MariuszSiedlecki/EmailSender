package pl.mariosendemail.sendemail.mail;

public interface EmailSender  {
    void sendEmail(String to, String subject, String content);
}
