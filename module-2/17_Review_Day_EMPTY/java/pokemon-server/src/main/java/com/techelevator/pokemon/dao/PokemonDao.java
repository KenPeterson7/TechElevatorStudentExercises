package com.techelevator.pokemon.dao;

import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetails;

public interface PokemonDao {
    public boolean savePokemonDetails(Pokemon pokemon, PokemonDetails pokemonDetails);
}
