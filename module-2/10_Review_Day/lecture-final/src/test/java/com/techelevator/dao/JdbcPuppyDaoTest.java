package com.techelevator.dao;

import com.techelevator.model.Puppy;
import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;


import javax.sql.DataSource;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class JdbcPuppyDaoTest {
    private static SingleConnectionDataSource dataSource;
    private JdbcPuppyDao jdbcPuppyDao;

    @BeforeClass
    public static void setup(){
        dataSource = new SingleConnectionDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/puppy_palace");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");
        dataSource.setAutoCommit(false);
    }

    @Before
    public void setupData(){
        String sql = "INSERT INTO puppy (puppy_name, weight, gender, breed, paper_trained) VALUES('Rex',15,'M','Doberman',true)";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql);
        jdbcPuppyDao = new JdbcPuppyDao(dataSource);
    }

    @After
    public void rollback() throws SQLException {
        dataSource.getConnection().rollback();
    }

    @AfterClass
    public static void closeDataSource(){
        dataSource.destroy();
    }

    @Test
    public void getAllPuppiesReturnsAllThePuppers(){
        List<Puppy> puppyList = jdbcPuppyDao.getAllPuppies();
        Assert.assertEquals(5, puppyList.size());
    }

}