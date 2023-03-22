package org.africa.semicolon.Data.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String Address;

}


