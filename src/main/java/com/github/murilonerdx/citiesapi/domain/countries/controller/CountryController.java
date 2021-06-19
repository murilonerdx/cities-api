package com.github.murilonerdx.citiesapi.domain.countries.controller;

import com.github.murilonerdx.citiesapi.domain.countries.entity.Country;
import com.github.murilonerdx.citiesapi.domain.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    private final CountryRepository repository;

    @Autowired
    public CountryController(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    public List<Country> cities() {
        return repository.findAll();
    }
}