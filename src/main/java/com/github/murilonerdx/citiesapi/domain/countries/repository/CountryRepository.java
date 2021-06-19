package com.github.murilonerdx.citiesapi.domain.countries.repository;


import com.github.murilonerdx.citiesapi.domain.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
