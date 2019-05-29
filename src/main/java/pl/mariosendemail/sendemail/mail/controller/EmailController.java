package pl.mariosendemail.sendemail.mail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import pl.mariosendemail.sendemail.mail.model.MyEmail;
import pl.mariosendemail.sendemail.mail.services.EmailSendService;

@Controller
public class EmailController {

    private final EmailSendService emailSendService;
    private final TemplateEngine templateEngine;

    public EmailController(EmailSendService emailSendService, TemplateEngine templateEngine) {
        this.emailSendService = emailSendService;
        this.templateEngine = templateEngine;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/send")
    public String sendMail(@ModelAttribute MyEmail myEmail) {
        Context context = new Context();
        context.setVariable("body", myEmail.getBody());
        String templateEmail = templateEngine.process("template-email", context);
        emailSendService.sendEmail(myEmail.getAddress(), myEmail.getSubject(), templateEmail);
        return "index";
    }

    @GetMapping("/sender")
    public String sender() {
        return "sender";
    }
}
