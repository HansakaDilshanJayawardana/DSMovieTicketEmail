package com.email.dsmovieticketemail.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailRequest {

    private String email;
    private String subject;
    private String body;

}