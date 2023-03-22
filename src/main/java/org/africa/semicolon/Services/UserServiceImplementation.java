package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.User;
import org.africa.semicolon.Data.Repositories.UserRepository;
import org.africa.semicolon.dtos.RegisterUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
UserRepository userRepository;
    @Override
    public User register(RegisterUserRequest registerUserRequest) {
        User user = new User();
        user.setFirstName(registerUserRequest.getFirstName());
        user.setUserId(registerUserRequest.getUserId());
        user.setLastName(registerUserRequest.getLastName());
        user.setPassword(registerUserRequest.getPassword());
        user.setEmail(registerUserRequest.getEmail());
        userRepository.save(user);
        return user;
    }

    @Override
    public User findUserById(String userId) {
        User user = new User();
        user = userRepository.findByUserId(userId);
        return user;
    }

    @Override
    public Object deleteUserByUserId(String userId) {
        userRepository.deleteById(userId);
        return "deleted";
    }
}
