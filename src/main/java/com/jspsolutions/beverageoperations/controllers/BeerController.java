package com.jspsolutions.beverageoperations.controllers;

import com.jspsolutions.beverageoperations.entities.beers.Beer;
import com.jspsolutions.beverageoperations.services.BeerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping
    public List<Beer> getAllBeers() {
        return beerService.getAllBeers();
    }

    @PostMapping
    public Beer addBeer(@RequestBody Beer beer) {
        return beerService.saveBeer(beer);
    }

    @DeleteMapping("/beer")
    public ResponseEntity<String> removeBeer(@PathVariable Long id) {
        try {
            beerService.removeBeer(id);
            return ResponseEntity.ok("Beer removed successfully");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }

    }
}
