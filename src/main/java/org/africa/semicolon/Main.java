package org.africa.semicolon;

import org.africa.semicolon.Controllers.CandidateController;
import org.africa.semicolon.Controllers.PoliticalPartyController;
import org.africa.semicolon.Controllers.UserController;
import org.africa.semicolon.Services.CandidateService;
import org.africa.semicolon.Services.PoliticalPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Main {

    @Autowired
    UserController userController;

    @Autowired
    PoliticalPartyController politicalPartyController;

    @Autowired
    CandidateController candidateController;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}