package com.email.dsmovieticketemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class EmailController {

    @Autowired
    private EmailAlert emailAlert;

    @RequestMapping("/api/v1/notification/send-mail")
    public void sendMail() throws MessagingException {
        emailAlert.sendEmail("hansaka345@gmail.com", "Payment Confirmation", "This is a payment confirmation message!!!");
    }

}