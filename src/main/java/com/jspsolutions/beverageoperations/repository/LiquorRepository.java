package com.jspsolutions.beverageoperations.repository;

import com.jspsolutions.beverageoperations.entities.liquors.Liquor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LiquorRepository extends JpaRepository<Liquor, Long> {
}
