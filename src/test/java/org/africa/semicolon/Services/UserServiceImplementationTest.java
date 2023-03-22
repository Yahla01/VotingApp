package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplementationTest {
    @Test
    public  void saveAUserTest(){
        User user = new User();
        user.setFirstName("josh");
        System.out.println(user.getFirstName());
    }

}