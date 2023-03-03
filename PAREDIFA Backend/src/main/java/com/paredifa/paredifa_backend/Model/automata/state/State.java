package com.paredifa.paredifa_backend.Model.automata.state;

import com.paredifa.paredifa_backend.Model.automata.coordinate.Coordinate;

import java.util.UUID;

public record State(UUID id, String name, Coordinate coordinate, Boolean start, Boolean end) {
}
