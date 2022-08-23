package com.techelevator.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PokemonDetails {

    private int id;
    private String name;
    private int height;
    private int weight;
    private List<TypeObject> types;
    @JsonProperty("base_experience")
    private int baseExperience;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<TypeObject> getTypes() {
        return types;
    }

    public void setTypes(List<TypeObject> types) {
        this.types = types;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
