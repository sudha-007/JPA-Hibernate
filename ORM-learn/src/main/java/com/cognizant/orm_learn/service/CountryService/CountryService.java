package com.cognizant.orm_learn.service.CountryService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.orm_learn.model.*;
import com.cognizant.orm_learn.model.Country.Country;
import com.cognizant.orm_learn.CountryRepository.CountryRepositry;

import antlr.collections.List;

@Service
public class CountryService {
	@Autowired
	CountryRepositry repo;
	@Transactional
	public java.util.List<Country> getAllCountry(){
		//System.out.println(repo.findAll());
		return repo.findAll();
	}
	
}
