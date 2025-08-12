package com.nt.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.Entity.CoronaVaccine;
import com.nt.Service.ICoronaVaccineManagementService;


@Component
public class CrudRepoTestRunner implements CommandLineRunner {
    
	@Autowired
	private ICoronaVaccineManagementService service;

	@Override
	public void run(String... args) throws Exception {
		
//		try {
//		Iterable<CoronaVaccine> listEn = service.fetchDetailsBy(true,"price");
//		listEn.forEach(System.out:: println);
//		}
//		catch(DataAccessException dae){
//			dae.printStackTrace();
//		}
		
//		try {
//			service.fetchDetailsByPageNo(2, 4,true,"price").forEach(System.out::println);
//		}catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		try {
			service.fetchDetailsbyPagination(5);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		} 
		
	}

	
	

}
