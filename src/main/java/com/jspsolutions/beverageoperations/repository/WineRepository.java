package com.jspsolutions.beverageoperations.repository;

import com.jspsolutions.beverageoperations.entities.wines.Wine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WineRepository extends JpaRepository<Wine, Long> {
}
