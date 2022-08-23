package com.techelevator.pokemon.controller;

import com.techelevator.pokemon.dao.PokemonDao;
import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetails;
import com.techelevator.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;
    @Autowired
    private PokemonDao pokemonDao;

    @GetMapping("/pokemon")
    public List<Pokemon> getAllPokemon(){
        return pokemonService.getAllPokemon();
    }

    @GetMapping("/pokemonDetail/{id}")
    public PokemonDetails getPokemonDetailsById(@PathVariable int id){
        return pokemonService.getDetailById(id);
    }

    @PostMapping("/pokemon")
    public Boolean addPokemon(){
        List<Pokemon> pokemonList = getAllPokemon();
        PokemonDetails pokemonDetails = getPokemonDetailsById(1);
        return pokemonDao.savePokemonDetails(pokemonList.get(1), pokemonDetails);

    }
}
