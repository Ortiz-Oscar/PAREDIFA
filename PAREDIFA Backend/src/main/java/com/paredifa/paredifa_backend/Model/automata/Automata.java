package com.paredifa.paredifa_backend.Model.automata;

import com.paredifa.paredifa_backend.Model.automata.state.State;
import com.paredifa.paredifa_backend.Model.automata.transition.Transition;

import java.util.List;
import java.util.UUID;

public record Automata(UUID id, String regex, List<String> alphabet, List<State> stateList, List<Transition> transitionList) {}
