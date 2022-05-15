package com.email.dsmovieticketemail;

import com.email.dsmovieticketemail.payload.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class EmailController {

    @Autowired
    private EmailAlert emailAlert;

    @RequestMapping("/api/v1/notification/send-mail")
//    public void sendMail() throws MessagingException {
//        emailAlert.sendEmail("hansaka345@gmail.com", "Payment Confirmation", "This is a payment confirmation message!!!");
//    }

    public ResponseEntity<String> sendMail(@RequestBody EmailRequest emailRequest) throws MessagingException {
        try {
            emailAlert.sendEmail(emailRequest.getEmail(), emailRequest.getSubject(), emailRequest.getBody());
            return new ResponseEntity<>("Send Email", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed Email", HttpStatus.FAILED_DEPENDENCY);
        }
    }

}