package com.imretoth.robodog.controller;

import com.imretoth.robodog.data.Dog;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class DogController {
    DogStorage dogStorage;

    public DogController(DogStorage dogStorage) {
        this.dogStorage = dogStorage;
    }

    @GetMapping("/dogs")
    List<Dog> all() {
        return dogStorage.getDogList();
    }

    @GetMapping("/random")
    Dog randomDog() {
        return dogStorage.addRandomDog();
    }

    @PostMapping("/new")
    List<Dog> newDog(@RequestBody Dog newDog) {
        dogStorage.addDog( newDog );
        return dogStorage.getDogList();
    }

    @PutMapping("/update/{name}")
    List<Dog> updateDog(@RequestBody Dog newDog, @PathVariable String name) {
        return dogStorage.findDogAndUpdateAgeAndBreed( newDog, name );
    }
}
