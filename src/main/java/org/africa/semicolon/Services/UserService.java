package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.User;
import org.africa.semicolon.dtos.RegisterUserRequest;

public interface UserService {

    public User register(RegisterUserRequest registerUserRequest);

    public User findUserById(String UserId);

    public Object deleteUserByUserId(String UserId);

}
