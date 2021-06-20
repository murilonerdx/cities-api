package com.github.murilonerdx.citiesapi.domain.staties.repository;

import com.github.murilonerdx.citiesapi.domain.staties.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
