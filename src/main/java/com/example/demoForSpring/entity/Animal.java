package com.example.demoForSpring.entity;

import javax.persistence.*;

@Entity
@Table
public class Animal {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String species;

    @Column
    private String name;

    @Column
    private int weightInPounds;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
}
