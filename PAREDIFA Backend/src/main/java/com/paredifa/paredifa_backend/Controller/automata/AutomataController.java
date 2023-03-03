package com.paredifa.paredifa_backend.Controller.automata;

import com.paredifa.paredifa_backend.Model.automata.Automata;
import com.paredifa.paredifa_backend.Repository.automata.AutomataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
public class AutomataController {
    @Autowired
    private AutomataRepository automataRepository;
    @QueryMapping
    public Automata singleAutomata(@Argument UUID id){
        return null;
    }
    @QueryMapping
    public List<Automata> allAutomatas(){
        return automataRepository.findAll();
    }
}