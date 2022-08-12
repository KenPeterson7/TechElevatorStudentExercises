package com.techelevator.dao;

import com.techelevator.model.Puppy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcPuppyDao implements PuppyDao{

    JdbcTemplate jdbcTemplate;

    public JdbcPuppyDao(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Puppy> getAllPuppies() {
        List<Puppy> puppyList = new ArrayList<>();
        String sql = "SELECT id, puppy_name, weight, gender, breed, paper_trained" +
                " FROM puppy";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            Puppy puppy = mapRowToPuppy(results);
            puppyList.add(puppy);
        }
        return puppyList;
    }

    @Override
    public Puppy getPuppyById(int puppyId) {
        Puppy puppy = null;
        String sql = "SELECT id, puppy_name, weight, gender, breed, paper_trained FROM puppy WHERE id = ?;";

        SqlRowSet result  = jdbcTemplate.queryForRowSet(sql, puppyId);
        if(result.next())
            puppy = mapRowToPuppy(result);

        return puppy;
    }

    @Override
    public Puppy savePuppy(Puppy puppy) {
        String sql = "INSERT INTO puppy (puppy_name, weight, gender, breed, paper_trained) VALUES (?,?,?,?,?) RETURNING id;";
        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, puppy.getPuppyName(), puppy.getWeight(), puppy.getGender(), puppy.getBreed(), puppy.isPaperTrained());
        puppy.setPuppyId(newId);
        return puppy;
    }

    @Override
    public Puppy updatePuppy(Puppy puppy) {
        String sql = "UPDATE puppy SET puppy_name = ?, weight = ? , gender = ?, breed = ?, paper_trained= ? WHERE id = ?;";
        jdbcTemplate.update(sql, puppy.getPuppyName(), puppy.getWeight(), puppy.getGender(), puppy.getBreed(), puppy.isPaperTrained(), puppy.getPuppyId());
        return puppy;
    }

    @Override
    public void removePuppy(int puppyId) {
        String sql = "DELETE FROM puppy WHERE id = ?;";
        jdbcTemplate.update(sql, puppyId);
    }

    private Puppy mapRowToPuppy(SqlRowSet sqlRowSet){
        Puppy puppy = new Puppy();
        puppy.setPuppyId(sqlRowSet.getInt("id"));
        puppy.setPuppyName(sqlRowSet.getString("puppy_name"));
        puppy.setWeight(sqlRowSet.getInt("weight"));
        puppy.setGender(sqlRowSet.getString("gender"));
        puppy.setBreed(sqlRowSet.getString("breed"));
        puppy.setPaperTrained(sqlRowSet.getBoolean("paper_trained"));

        return puppy;
    }
}
