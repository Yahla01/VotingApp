package org.africa.semicolon.Data.Repositories;

import org.africa.semicolon.Data.Models.PoliticalParty;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PoliticalPartyRepository extends MongoRepository<PoliticalParty, String> {

    PoliticalParty findPoliticalPartyByPoliticalPartyName(String name);
}
