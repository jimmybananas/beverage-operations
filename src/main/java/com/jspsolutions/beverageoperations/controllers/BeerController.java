package com.jspsolutions.beverageoperations.controllers;

import com.jspsolutions.beverageoperations.entities.beers.Beer;
import com.jspsolutions.beverageoperations.services.BeerService;
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
}
