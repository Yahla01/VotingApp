package org.africa.semicolon.Data.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Candidate {

    @Id
    private String candidateId;
    private String candidateFirstName;
    private String candidateLastName;
    private String politicalPartyName;
    private String countryName;
    private int numberOfVote;

}