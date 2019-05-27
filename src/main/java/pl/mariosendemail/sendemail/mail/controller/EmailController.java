package pl.mariosendemail.sendemail.mail.controller;

import org.springframework.stereotype.Controller;
import org.thymeleaf.TemplateEngine;
import pl.mariosendemail.sendemail.mail.services.EmailSendService;

@Controller
public class EmailController {
    private final EmailSendService emailSendService;
    private final TemplateEngine templateEngine;

    public EmailController(EmailSendService emailSendService, TemplateEngine templateEngine) {
        this.emailSendService = emailSendService;
        this.templateEngine = templateEngine;
    }

}
