package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Park getPark(int parkId) {
        Park park = null;
        String sql = "select park_id, park_name, date_established, area, has_camping from park where park_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, parkId);
        if(results.next()){
            park = mapRowToPark(results);
        }
        return park;
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        Park park = null;
        List<Park> parks = new ArrayList<>();
        String sql = "select park.park_id, park_name, date_established, area, has_camping from park join park_state ps on park.park_id = ps.park_id where state_abbreviation = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, stateAbbreviation);
        while(results.next()){
            parks.add(mapRowToPark(results));
        }
        return parks;
    }

    @Override
    public Park createPark(Park park) {
        String sql = "insert into park (park_name, date_established, area, has_camping)" + "values (?, ?, ?, ?) returning park_id";
        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, park.getParkName(), park.getDateEstablished(), park.getArea(), park.getHasCamping());
        return getPark(newId);
    }

    @Override
    public void updatePark(Park park) {
        String sql = "update park set park_name = ?, date_established = ?, area = ?, has_camping = ? where park_id = ?;";
        jdbcTemplate.update(sql, park.getParkName(), park.getDateEstablished(), park.getArea(), park.getHasCamping(), park.getParkId());
    }

    @Override
    public void deletePark(int parkId) {
        String sql = "delete from park_state where park_id = ?;";
        jdbcTemplate.update(sql, parkId);
        sql = "delete from park where park_id = ?;";
        jdbcTemplate.update(sql, parkId);

    }

    @Override
    public void addParkToState(int parkId, String stateAbbreviation) {
        String sql = "insert into park_state (park_id, state_abbreviation) values(?, ?);";
        jdbcTemplate.update(sql, parkId, stateAbbreviation);

    }

    @Override
    public void removeParkFromState(int parkId, String stateAbbreviation) {
        String sql = "delete from park_state where park_id = ? && state_abbreviation = ?;";
        jdbcTemplate.update(sql, parkId, stateAbbreviation);

    }

    private Park mapRowToPark(SqlRowSet rowSet) {
        Park park = new Park();
        park.setParkId(rowSet.getInt("park_id"));
        park.setParkName(rowSet.getString("park_name"));
        park.setDateEstablished(rowSet.getDate("date_established").toLocalDate());
        park.setArea(rowSet.getDouble("area"));
        park.setHasCamping(rowSet.getBoolean("has_camping"));
        return park;
    }
}
