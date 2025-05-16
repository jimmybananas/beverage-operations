package com.jspsolutions.beverageoperations.controllers;

import com.jspsolutions.beverageoperations.entities.wines.Wine;
import com.jspsolutions.beverageoperations.services.WineService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @DeleteMapping("/wine")
    public ResponseEntity<String> removeWine(@PathVariable Long id) {
        try {
            wineService.removeWine(id);
            return ResponseEntity.ok("Wine removed successfully");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
