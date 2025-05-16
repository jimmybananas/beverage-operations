package com.jspsolutions.beverageoperations.services;

import com.jspsolutions.beverageoperations.entities.beers.Beer;
import com.jspsolutions.beverageoperations.repository.BeerRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter@Setter
@AllArgsConstructor
public class BeerService {

    private final BeerRepository beerRepository;

    public List<Beer> getAllBeers() {
        return beerRepository.findAll();
    }

    public Beer saveBeer(Beer beer){
        return beerRepository.save(beer);
    }

    public void removeBeer(Long beerId) {
        if(beerRepository.existsById(beerId)) {
            beerRepository.deleteById(beerId);
        }
        else {
            throw new RuntimeException("Beer not found.");
        }
    }
}
