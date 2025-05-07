package com.jspsolutions.beverageoperations.controllers;

import com.jspsolutions.beverageoperations.entities.wines.Wine;
import com.jspsolutions.beverageoperations.services.WineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wine")
public class WineController {

    private final WineService wineService;

    public WineController(WineService wineService){
        this.wineService = wineService;
    }

    @GetMapping
    public List<Wine> getAllWines() {
        return wineService.getAllWines();
    }

    @PostMapping
    public Wine addWine(@RequestBody Wine wine) {
        return wineService.saveWine(wine);
    }
}
