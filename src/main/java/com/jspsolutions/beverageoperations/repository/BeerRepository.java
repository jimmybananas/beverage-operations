package com.jspsolutions.beverageoperations.repository;

import com.jspsolutions.beverageoperations.entities.beers.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {
}
