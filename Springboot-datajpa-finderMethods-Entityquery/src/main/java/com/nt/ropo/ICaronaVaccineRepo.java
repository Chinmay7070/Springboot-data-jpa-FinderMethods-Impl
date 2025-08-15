package com.nt.ropo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entity.CoronaVaccine;

public interface ICaronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {

	
	   // SELECT REGNO,NAME,COMPANY,PRICE,COUNTRY,REQUIREDDOSECOUT FORM CORONA_VACCINE WHERE COMPANY=?;  
	
	   public List<CoronaVaccine> findByCompany(String company);
	   
	   public List<CoronaVaccine> FindByPriceLessThan(Double price);
	   
	  
	   public List<CoronaVaccine> FindByPriceBetween(double start,double end);
	   
	   public List<CoronaVaccine> FindByNameLike(String initChars);
	   public List<CoronaVaccine> findByNameStartwith(String initstartletter);
	   public List<CoronaVaccine> findByNameEndingwith(String endLetter);
	   public List<CoronaVaccine> findByNameContaining(String letters);
	   public List<CoronaVaccine> findByCountryIn(List<String> country);
	   public List<CoronaVaccine> findByCountryNotIn(List<String> countries);
	   public List<CoronaVaccine> findByPriceGreaterthanOrderByPriceAsc(double setPrice);
	   
	   
}
