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
        String sql = "SELECT puppy_id, name, weight, gender, breed, paper_trained" +
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
        return null;
    }

    @Override
    public Puppy savePuppy(Puppy puppy) {
        return null;
    }

    @Override
    public Puppy updatePuppy(Puppy puppy) {
        return null;
    }

    @Override
    public void removePuppy(int puppyId) {

    }

    private Puppy mapRowToPuppy(SqlRowSet sqlRowSet){
        Puppy puppy = new Puppy();
        puppy.setPuppyId(sqlRowSet.getInt("puppy_id"));
        puppy.setPuppyName(sqlRowSet.getString("name"));
        puppy.setWeight(sqlRowSet.getInt("weight"));
        puppy.setGender(sqlRowSet.getString("gender"));
        puppy.setBreed(sqlRowSet.getString("breed"));
        puppy.setPaperTrained(sqlRowSet.getBoolean("paper_trained"));

        return puppy;
    }
}
