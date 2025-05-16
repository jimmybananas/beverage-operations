package com.jspsolutions.beverageoperations.services;

import com.jspsolutions.beverageoperations.entities.wines.Wine;
import com.jspsolutions.beverageoperations.repository.WineRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter@Setter
@AllArgsConstructor
public class WineService {

    private final WineRepository wineRepository;

    public List<Wine> getAllWines(){
        return wineRepository.findAll();
    }

    public Wine saveWine(Wine wine) {
        return wineRepository.save(wine);
    }

    public void removeWine(Long wineId) {
        if(wineRepository.existsById(wineId)) {
            wineRepository.deleteById(wineId);
        }
        else{
            throw new RuntimeException("Wine not found");
        }
    }
}
