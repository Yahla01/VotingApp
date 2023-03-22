package org.africa.semicolon.dtos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
public class RegisterPoliticalPartyRequest {

    @Id
        private String politicalPartyId;
        private String politicalPartyName;
        private String politicalPartyCandidate;
        private String Address;

    }

