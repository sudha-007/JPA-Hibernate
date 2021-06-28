package com.webApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Country.Country;
import com.cognizant.orm_learn.service.CountryService.CountryService;

import antlr.collections.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication

public class OrmLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
	
	public static void main(String[] args) {
		ApplicationContext context=
				SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		testGetAllCountries();
		LOGGER.info("Inside main");
	}
	
	private static void testGetAllCountries() {
		LOGGER.info("Start");
		java.util.List<Country> countries =countryService.getAllCountry();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
//		for(Country i:countries) {
//			System.out.println(i.getName());
//		}

		}
}
