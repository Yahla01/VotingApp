package org.africa.semicolon.Controllers;

import org.africa.semicolon.Data.Models.Candidate;
import org.africa.semicolon.Services.CandidateService;
import org.africa.semicolon.dtos.RegisterCandidateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CandidateController{

    @Autowired
    CandidateService candidateService;

    @PostMapping("/register/candidate")
    public Candidate register(@RequestBody RegisterCandidateRequest registerCandidateRequest){
        return candidateService.register(registerCandidateRequest);

    }
    @GetMapping("/candidate/{candidateId}")
    public Object findCandidateById(@PathVariable String candidateId) {
        return candidateService.findCandidateById(candidateId);
    }


}


