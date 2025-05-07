package com.jspsolutions.beverageoperations.services;

import com.jspsolutions.beverageoperations.entities.liquors.Liquor;
import com.jspsolutions.beverageoperations.repository.LiquorRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter@Setter
@AllArgsConstructor
public class LiquorService {

    private final LiquorRepository liquorRepository;

    public List<Liquor> getAllLiquors() {
        return liquorRepository.findAll();
    }

    public Liquor saveLiquor(Liquor liquor) {
        return liquorRepository.save(liquor);
    }

    public void removeLiquor(Long liquorId) {
        if(liquorRepository.existsById(liquorId)) {
            liquorRepository.deleteById(liquorId);
        }
        else {
            throw new RuntimeException("Beer not found.");
        }
    }
}
