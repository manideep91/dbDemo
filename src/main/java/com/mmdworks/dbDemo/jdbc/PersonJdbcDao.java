package com.mmdworks.dbDemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mmdworks.dbDemo.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Person> fetchAll() {
		String query = "select * from person";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper(Person.class));
	}
}
