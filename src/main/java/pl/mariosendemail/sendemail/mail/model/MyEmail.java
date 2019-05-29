package pl.mariosendemail.sendemail.mail.model;

public class MyEmail {
    private String address;
    private String subject;
    private String body;

    public MyEmail(String address, String subject, String body) {
        this.address = address;
        this.subject = subject;
        this.body = body;
    }

    public MyEmail() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}