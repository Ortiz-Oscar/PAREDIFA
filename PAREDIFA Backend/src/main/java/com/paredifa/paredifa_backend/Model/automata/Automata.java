package com.paredifa.paredifa_backend.Model.automata;

import com.paredifa.paredifa_backend.Model.automata.state.State;
import com.paredifa.paredifa_backend.Model.automata.transition.Transition;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document
public record Automata(@Id UUID id, String regex, List<String> alphabet, List<State> stateList, List<Transition> transitionList) {}
