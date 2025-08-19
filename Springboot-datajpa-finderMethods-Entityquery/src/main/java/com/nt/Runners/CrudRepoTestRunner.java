package com.nt.Runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Service.ICoronaVaccineManagementService;
import com.nt.Type.ResultView1;
import com.nt.Type.ResultView2;
import com.nt.Type.ResultView3;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {

	@Autowired
	private ICoronaVaccineManagementService service;

	@Override
	public void run(String... args) throws Exception {

		/*		service.fetchVaccineByCompany("pyzer").forEach(System.out::println);
	         	service.fetchVaccinesByPriceLessThan(400.0).forEach(System.out::println);
		     	service.fetchVaccineBypriceRange(500.0,700.0).forEach(System.out::println);
				service.fetchVaccineByNameLike("p%").forEach(System.out::println) ;
				service.fetchVaccineByNameStartingwith("s").forEach(System.out::println);
				//service.fetchVaccineByNameEndingWith("ra").forEach(System.out::println);
				//service.fetchVaccineByCountries("india","russia","usa").forEach(System.out::println);
				service.searchVaccinesNotInCountries(List.of("Chinma","pak")).forEach(System.out::println);
				service.searchVaccinesByPricebyAsc(400.0).forEach(System.out::println);*/

		/*System.out.println("------------**DYNAMIC PROJECTION**---------------");
		
		List<ResultView1> list1 = service.searchVaccineByCompany("pyzer", ResultView1.class);
		list1.forEach(view1 -> System.out.println(view1.getName() + " " + view1.getCountry()));
		service.searchVaccineByCompany("Russie", ResultView2.class)
				.forEach(view2 -> System.out.println(view2.getRegNo() + " " + view2.getPrice()));
		       service.searchVaccineByCompany("Russie", ResultView3.class)
				.forEach(view3 -> System.out.println(view3.getPrice()));
		*/
		// HERE WE AREABLE TO CHANGE TYPE INTERFACE DYNAMICALLY WHILE CALLING THE
		
		
		// METHOD..SO IT IS CALLED DYNAMIC PROJECTION

		// =================*** @Query Method **===================

		// service.fetchVaccineByComp("pyzer").forEach(System.out::println);

		// service.fetchVaccineBypriceRange(400.0, 600.0).forEach(System.out::println);

		// service.fetchVaccineByCompanies("pyzer","Russie","bharat");

		service.fetchVaccineNamesByPriceRange(400.0, 600.0).forEach(System.out::println);

	}
}
