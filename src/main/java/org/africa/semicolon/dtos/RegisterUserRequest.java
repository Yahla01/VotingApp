package org.africa.semicolon.dtos;

import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
public class RegisterUserRequest {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String Address;

}
