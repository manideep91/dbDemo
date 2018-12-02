package com.mmdworks.dbDemo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mmdworks.dbDemo.entity.Person;
import com.mmdworks.dbDemo.jdbc.PersonJdbcDao;
import com.mmdworks.dbDemo.service.PersonService;

@SpringBootApplication
public class DbDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(DbDemoApplication.class);
	
	@Autowired
	PersonJdbcDao dao;
	
	@Autowired
	PersonService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> personList = service.fetchAll();
		logger.info("\n"+personList);
		
	}
}
