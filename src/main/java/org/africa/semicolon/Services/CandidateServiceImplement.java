package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.Candidate;
import org.africa.semicolon.Data.Repositories.CandidateRepository;
import org.africa.semicolon.dtos.RegisterCandidateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImplement implements CandidateService {
    @Autowired
    CandidateRepository candidateRepository;

    @Override
    public Candidate register(RegisterCandidateRequest registerCandidateRequest) {
        Candidate candidate = new Candidate();
        candidate.setCandidateId(registerCandidateRequest.getCandidateId());
        candidate.setCandidateFirstName(registerCandidateRequest.getCandidateFirstName());
        candidate.setCandidateLastName(registerCandidateRequest.getCandidateLastName());
        candidate.setPoliticalPartyName(registerCandidateRequest.getPoliticalPartyName());
        candidate.setCountryName(registerCandidateRequest.getCountryName());
        candidate.setNumberOfVote(registerCandidateRequest.getNumberOfVote());
        candidateRepository.save(candidate);
        return candidate;
    }

    @Override
    public Candidate findCandidateById(String candidateId) {
        Candidate candidate = new Candidate();
        candidateRepository.findCandidateByCandidateId(candidateId);
        return candidate;
    }

    @Override
    public String deleteCandidateByCandidateId(String candidateId) {
        candidateRepository.deleteById(candidateId);
        return "deleted";
    }
}
