package com.nt.Runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.Service.ICoronaVaccineManagementService;


@Component
public class CrudRepoTestRunner implements CommandLineRunner {
    
	@Autowired
	private ICoronaVaccineManagementService service;

	@Override
	public void run(String... args) throws Exception {
		 
//		service.fetchVaccineByCompany("pyzer").forEach(System.out::println);
//		service.fetchVaccinesByPriceLessThan(400.0).forEach(System.out::println);
//		service.fetchVaccineBypriceRange(500.0,700.0).forEach(System.out::println);
//		service.fetchVaccineByNameLike("p%").forEach(System.out::println) ;
//		service.fetchVaccineByNameStartingwith("s").forEach(System.out::println);
		//service.fetchVaccineByNameEndingWith("ra").forEach(System.out::println);
		//service.fetchVaccineByCountries("india","russia","usa").forEach(System.out::println);
	//	service.searchVaccinesNotInCountries(List.of("Chinma","pak")).forEach(System.out::println);
		service.searchVaccinesByPricebyAsc(400.0).forEach(System.out::println);
		}
} 
