package com.paredifa.paredifa_backend.Model.regex;

import com.paredifa.paredifa_backend.Model.regex.restate.REState;
import com.paredifa.paredifa_backend.Model.regex.retransition.RETransition;

import java.util.List;

public record REAutomata(List<REState> nodes, List<RETransition> edges, List<String> alphabet) {}
