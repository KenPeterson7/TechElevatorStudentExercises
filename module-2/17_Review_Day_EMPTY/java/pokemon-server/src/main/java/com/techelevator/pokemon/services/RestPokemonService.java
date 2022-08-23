package com.techelevator.pokemon.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestPokemonService implements PokemonService{

    private RestTemplate restTemplate = new RestTemplate();
    private final String API_URL = "https://pokeapi.co/api/v2/pokemon";

    @Override
    public List<Pokemon> getAllPokemon(){
        String result = restTemplate.getForObject(API_URL, String.class);
        ObjectMapper mapper = new ObjectMapper();

        List<Pokemon> pokemons = new ArrayList<>();

        try{
            JsonNode jsonNode = mapper.readTree(result);
            JsonNode root = jsonNode.path("results");

            for(int i = 0; i < root.size(); i++){
                Pokemon temp = new Pokemon();
                String url = root.path(i).path("url").asText();
                temp.setUrl(url);
                temp.setName(root.path(i).path("name").asText());
                temp.setId(i+1);
                pokemons.add(temp);
            }
        }catch(JsonProcessingException e){
            e.printStackTrace();
        }


        return pokemons;
    }

    @Override
    public PokemonDetails getDetailById(int id){
        PokemonDetails pokemonDetails = restTemplate.getForObject(API_URL + "/" + id, PokemonDetails.class);
        return pokemonDetails;
    }



}
