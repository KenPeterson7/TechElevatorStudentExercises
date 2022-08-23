package com.techelevator.pokemon.dao;

import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetails;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcPokemonDao implements PokemonDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcPokemonDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean savePokemonDetails(Pokemon pokemon, PokemonDetails pokemonDetails){

        String sql = "insert into pokemon (name, url, base_experience, height, weight) values (?,?,?,?,?) returning pokemon_id";
        String typeSql = "insert into type (type_name) values(?)";
        String pokemonTypeSql = "insert into pokemon_type (pokemon_id, type_id) values(?,?)";

        Integer newPokemonId, typeId;
        try{
            newPokemonId = jdbcTemplate.queryForObject(sql, Integer.class, pokemonDetails.getName(), pokemon.getUrl(), pokemonDetails.getBaseExperience(), pokemonDetails.getHeight(), pokemonDetails.getWeight());
            for(int i = 0; i < pokemonDetails.getTypes().size(); i++){
                typeId = jdbcTemplate.queryForObject(typeSql, Integer.class, pokemonDetails.getTypes().get(i).getType().getTypeName());
                jdbcTemplate.update(pokemonTypeSql, newPokemonId, typeId);
            }

        }catch(DataAccessException e){
            return false;
        }
        return true;
    }

}
