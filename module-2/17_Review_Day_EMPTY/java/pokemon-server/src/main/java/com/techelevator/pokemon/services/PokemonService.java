package com.techelevator.pokemon.services;

import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetails;

import java.util.List;

public interface PokemonService {
    List<Pokemon> getAllPokemon();

    PokemonDetails getDetailById(int id);
}
