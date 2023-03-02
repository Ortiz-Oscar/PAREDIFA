package com.paredifa.paredifa_backend.Repository.automata;

import com.paredifa.paredifa_backend.Model.automata.Automata;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface AutomataRepository extends MongoRepository<Automata, UUID> {

}
