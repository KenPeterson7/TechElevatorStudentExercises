package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
		Project project = null;
		String sql = "select * from project where project_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		if(results.next()) {
			project = mapRowToProject(results);
			return project;
		}
		else return null;
	}


	@Override
	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<>();
		SqlRowSet results = jdbcTemplate.queryForRowSet("select * from project;");
		while(results.next()){
			projects.add(mapRowToProject(results));
		}
		return projects;
	}

	@Override
	public Project createProject(Project newProject) {
		String sql = "insert into project(name, from_date, to_date) values(?, ?, ?) returning project_id";
		Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, newProject.getName(), newProject.getFromDate(), newProject.getToDate());
		return getProject(newId);
	}

	@Override
	public void deleteProject(int projectId) {
		String sql = "delete from project_employee where project_id = ?";
		jdbcTemplate.update(sql, projectId);
		sql = "delete from project where project_id = ?";
		jdbcTemplate.update(sql, projectId);

	}

	private Project mapRowToProject(SqlRowSet rowSet) {
		Project project = new Project();
		project.setId(rowSet.getInt("project_id"));
		project.setName(rowSet.getString("name"));
		if (rowSet.getDate("from_date") != null) {
			project.setFromDate(rowSet.getDate("from_date").toLocalDate());
		}
		if (rowSet.getDate("to_date") != null) {
			project.setToDate(rowSet.getDate("to_date").toLocalDate());
		}
		return project;
	}
}