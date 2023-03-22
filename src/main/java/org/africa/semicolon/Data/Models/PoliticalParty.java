package org.africa.semicolon.Data.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PoliticalParty {
    @Id
    private String politicalPartyId;
    private String politicalPartyName;
    private String politicalPartyCandidate;

}