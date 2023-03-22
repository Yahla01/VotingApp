package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.PoliticalParty;
import org.africa.semicolon.Data.Models.User;
import org.africa.semicolon.Data.Repositories.PoliticalPartyRepository;
import org.africa.semicolon.Data.Repositories.UserRepository;
import org.africa.semicolon.dtos.RegisterPoliticalPartyRequest;
import org.africa.semicolon.dtos.RegisterUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


@Service
public class PoliticalPartyServiceImplementation implements PoliticalPartyService{
    @Autowired
    PoliticalPartyRepository politicalPartyRepository;
    @Override
    public PoliticalParty register(RegisterPoliticalPartyRequest registerPoliticalPartyRequest) {
        PoliticalParty politicalParty = new PoliticalParty();
        politicalParty.setPoliticalPartyId(registerPoliticalPartyRequest.getPoliticalPartyId());
        politicalParty.setPoliticalPartyName(registerPoliticalPartyRequest.getPoliticalPartyName());
        politicalParty.setPoliticalPartyCandidate(registerPoliticalPartyRequest.getPoliticalPartyCandidate());
        politicalPartyRepository.save(politicalParty);
        return politicalParty;
    }


    @Override
    public PoliticalParty findPoliticalPartyById(String politicalPartyId) {
       PoliticalParty politicalParty = politicalPartyRepository.findPoliticalPartyByPoliticalPartyName(politicalPartyId);
        return politicalParty;
    }

    @Override
    public String deletePoliticalPartyByPoliticalPartyId(String politicalPartyName) {
        PoliticalParty politicalParty = politicalPartyRepository.findPoliticalPartyByPoliticalPartyName(politicalPartyName);
        politicalPartyRepository.delete(politicalParty);
        return "Delete Successful";
    }


}


