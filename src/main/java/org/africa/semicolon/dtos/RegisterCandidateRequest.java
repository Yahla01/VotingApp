package org.africa.semicolon.dtos;

import lombok.Data;
import org.africa.semicolon.Data.Models.PoliticalParty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
public class RegisterCandidateRequest {

    @Id
        private String candidateId;
        private String candidateFirstName;
        private String candidateLastName;
        private String politicalPartyName;
        private String countryName;
        private int numberOfVote;

    }

