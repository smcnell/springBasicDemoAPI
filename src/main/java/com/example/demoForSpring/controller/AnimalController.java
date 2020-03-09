package com.example.demoForSpring.controller;

import com.example.demoForSpring.entity.Animal;
import com.example.demoForSpring.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/getAnimals")
    public List<Animal> getAnimals() {
        return animalService.getAllAnimals();
    }
}
