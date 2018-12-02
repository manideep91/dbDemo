package com.mmdworks.dbDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmdworks.dbDemo.entity.Person;
import com.mmdworks.dbDemo.jdbc.PersonJdbcDao;

@Service
public class PersonService {
	
	@Autowired
	PersonJdbcDao personJdbcDao;
	
	public List<Person> fetchAll(){
		return personJdbcDao.fetchAll();
	}

}
