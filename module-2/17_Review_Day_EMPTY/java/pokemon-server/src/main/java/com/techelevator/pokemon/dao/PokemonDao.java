package com.techelevator.pokemon.dao;

import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetails;
import org.springframework.stereotype.Service;


public interface PokemonDao {
    public boolean savePokemonDetails(Pokemon pokemon, PokemonDetails pokemonDetails);
}
