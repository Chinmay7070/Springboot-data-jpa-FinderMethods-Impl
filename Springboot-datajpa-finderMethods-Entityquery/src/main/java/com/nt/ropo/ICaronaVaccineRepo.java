package com.nt.ropo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.Entity.CoronaVaccine;
import com.nt.Type.View;

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
	     
	   //=====================**DYNAMIC PROJECTION**=======================================
	   
	   public <T extends View> List<T> findByCompanyOredByCompanyDesc(String cop,Class<T> clazz);
	   
	   // ==========================****@Query methods****=======================
	   @Query("FroM com.nt.entity,CoronaVaccine WHERE company=?1")
		public List<CoronaVaccine> searchVaccineByCompeny(String comp);
		
		
		@Query("FROM CoronaVaccine WHERE PRICE>=? AND price<=?2")
		public List<CoronaVaccine> searchVaccineBypricerange(double min,double max);
		
	    @Query("FROM CoronaVaccine WHERE company IN(:cop1,:cop2,:cop3) OrderBy company ")
		public List<CoronaVaccine> searchVaccinesByComp(String cop1,String cop2,String comp3);
	    
	    @Query("SELECT name,company,price FORM CoronaVaccine WHERE NAME IN(:NAME1,:NAME2)")
	    public List<Object[]> searchVaccineDetailsByName(String name1,String name2);
	    
	    @Query("SELECT name FROM CoronaVaccine Where prince BETWEEN :min AND :MAX")
	    public List<String> searchVaccineNamesByPriceRange(double min,double max);
	   
	   
}
