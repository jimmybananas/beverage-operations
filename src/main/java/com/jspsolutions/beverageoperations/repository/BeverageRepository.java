package com.jspsolutions.beverageoperations.repository;

import com.jspsolutions.beverageoperations.entities.Beverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeverageRepository extends JpaRepository<Beverage, Long> {
}
