package com.demoProject.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication implements CommandLineRunner {

 private Logger logger = LoggerFactory.getLogger(this.getClass());

	//Comment here for fun
	@PersistenceContext
	EntityManager em;

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    	logger.info("\n \n  <==> WORKING <==> \n \n");
		logger.info("\n \n <--> The Item where the ID is equal to 40002: ==>" + em.createNamedQuery("findItemById").setParameter("id",40002L).getResultList());
	}
}
