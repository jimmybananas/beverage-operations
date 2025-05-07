package com.jspsolutions.beverageoperations.controllers;

import com.jspsolutions.beverageoperations.entities.liquors.Liquor;
import com.jspsolutions.beverageoperations.services.LiquorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/liquor")
public class LiquorController {

    private final LiquorService liquorService;

    public LiquorController(LiquorService liquorService) {
        this.liquorService = liquorService;
    }

    @GetMapping
    public List<Liquor> getAllLiquors(){
        return liquorService.getAllLiquors();
    }

    @PostMapping
    public Liquor addLiquor(@RequestBody Liquor liquor){
        return liquorService.saveLiquor(liquor);
    }




}
