package com.paredifa.paredifa_backend.Model.automata.transition;

import com.paredifa.paredifa_backend.Model.automata.coordinate.Coordinate;
import com.paredifa.paredifa_backend.Model.automata.transition.stateRef.StateRef;

import java.util.List;
import java.util.UUID;

public record Transition(UUID id, StateRef sourceStateRef, StateRef targetStateRef, List<String> symbolList, Coordinate coordinate) {}
