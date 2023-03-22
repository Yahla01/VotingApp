package org.africa.semicolon.Data.Repositories;

import org.africa.semicolon.Data.Models.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidateRepository extends MongoRepository<Candidate, String> {
    Candidate findCandidateByCandidateId(String candidateId);
}
