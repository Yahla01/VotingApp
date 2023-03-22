package org.africa.semicolon.Data.Repositories;

import org.africa.semicolon.Data.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {


    User findByUserId(String id);
}
