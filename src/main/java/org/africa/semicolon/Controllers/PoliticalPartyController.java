package org.africa.semicolon.Controllers;

import org.africa.semicolon.Services.PoliticalPartyService;
import org.africa.semicolon.dtos.RegisterPoliticalPartyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PoliticalPartyController {
    @Autowired
    PoliticalPartyService politicalPartyService;

    @PostMapping("/register/party")
    public Object register(@RequestBody RegisterPoliticalPartyRequest registerPoliticalPartyRequest){
        return politicalPartyService.register(registerPoliticalPartyRequest);

    }
    @GetMapping("/politicalParty/{politicalPartyId}")
    public Object findPoliticalPartyById(@PathVariable String politicalPartyId) {
        return politicalPartyService.findPoliticalPartyById(politicalPartyId);
    }




}


