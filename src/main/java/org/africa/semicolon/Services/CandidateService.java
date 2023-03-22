package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.Candidate;
import org.africa.semicolon.dtos.RegisterCandidateRequest;

public interface CandidateService {
    public Candidate register(RegisterCandidateRequest registerCandidateRequest);

    public Candidate findCandidateById(String CandidateId);

    public String deleteCandidateByCandidateId(String candidateId);


}

