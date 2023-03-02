package com.paredifa.paredifa_backend;

import com.paredifa.paredifa_backend.Model.automata.Automata;
import com.paredifa.paredifa_backend.Model.automata.coordinate.Coordinate;
import com.paredifa.paredifa_backend.Model.automata.state.State;
import com.paredifa.paredifa_backend.Model.automata.transition.Transition;
import com.paredifa.paredifa_backend.Model.automata.transition.stateRef.StateRef;
import com.paredifa.paredifa_backend.Repository.automata.AutomataRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class ParedifaBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParedifaBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(AutomataRepository repository) {
        State state1 = new State(
                UUID.randomUUID(),
                "S0",
                new Coordinate(0.0f,  0.0f),
                true,
                false
        );
        State state2 = new State(
                UUID.randomUUID(),
                "S1",
                new Coordinate(1.0f,  1.0f),
                true,
                false
        );
        Transition transition1 = new Transition(
                UUID.randomUUID(),
                new StateRef(state1.id(), 0.0f, 0.0f),
                new StateRef(state2.id(), 1.0f, 1.0f),
                List.of("a"),
                new Coordinate(1.5f, 0.6f)
        );
        Transition transition2 = new Transition(
                UUID.randomUUID(),
                new StateRef(state1.id(), 0.0f, 0.0f),
                new StateRef(state2.id(), 1.0f, 1.0f),
                List.of("a"),
                new Coordinate(1.5f, 0.6f)
        );
        return args -> {
            Automata automata = new Automata(
                    UUID.randomUUID(),
                    "a*",
                    List.of("a"),
                    List.of( state1, state2),
                    List.of( transition1, transition2)
            );
            repository.insert(automata);
        };

    }

}
