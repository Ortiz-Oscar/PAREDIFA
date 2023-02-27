package com.paredifa.paredifa_backend.Model;

import com.paredifa.paredifa_backend.Model.automata.Automata;
import com.paredifa.paredifa_backend.Model.regex.REAutomata;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @QueryMapping
    public Automata bookById(@Argument String id) { return null; }

    @SchemaMapping
    public REAutomata author(Automata book) {
        return null;
    }
}
