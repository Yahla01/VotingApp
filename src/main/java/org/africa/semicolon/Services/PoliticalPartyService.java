package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.PoliticalParty;
import org.africa.semicolon.Data.Models.User;
import org.africa.semicolon.Data.Repositories.PoliticalPartyRepository;
import org.africa.semicolon.dtos.RegisterPoliticalPartyRequest;
import org.africa.semicolon.dtos.RegisterUserRequest;

public interface PoliticalPartyService {
    public PoliticalParty register(RegisterPoliticalPartyRequest registerPoliticalPartyRequest);

    public PoliticalParty findPoliticalPartyById(String PoliticalPartyId);

    public String deletePoliticalPartyByPoliticalPartyId(String PoliticalPartyId);

}

