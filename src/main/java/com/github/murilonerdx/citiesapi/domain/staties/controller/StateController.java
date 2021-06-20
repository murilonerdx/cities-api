package com.github.murilonerdx.citiesapi.domain.staties.controller;


import java.util.List;

import com.github.murilonerdx.citiesapi.domain.staties.entity.State;
import com.github.murilonerdx.citiesapi.domain.staties.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateController {

    private final StateRepository repository;

    @Autowired
    public StateController(StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }
}