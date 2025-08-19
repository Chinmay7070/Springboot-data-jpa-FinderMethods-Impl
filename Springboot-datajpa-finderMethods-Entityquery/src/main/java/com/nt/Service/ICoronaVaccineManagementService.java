package com.nt.Service;

import java.util.List;

import com.nt.Entity.CoronaVaccine;
import com.nt.Type.View;

public interface ICoronaVaccineManagementService {
    
	public List<CoronaVaccine> fetchVaccineByCompany(String company);
	public List<CoronaVaccine> fetchVaccinesByPriceLessThan(double price);
	public List<CoronaVaccine> fetchVaccineBypriceRange(double startp,double endp);
	public List<CoronaVaccine> fetchVaccineByNameLike(String initChars);
	public List<CoronaVaccine> fetchVaccineByNameStartingwith(String startLetters);
	public List<CoronaVaccine> fetchVaccineByNameEndingWith(String endLetters);
	public List<CoronaVaccine>  fetchVaccneByNmaeHaving(String letters);
	public List<CoronaVaccine> fetchVaccineByCountries(String...countries);
	public List<CoronaVaccine> searchVaccinesNotInCountries(List<String> countriesl);
	public List<CoronaVaccine>  searchVaccinesByPricebyAsc(double startPrice);
	
	//================**DYNAMIC PROJECTION**=========================
	
	public <T extends View> List<T> searchVaccineByCompany(String comp,Class<T> clazz);
	
	//=========================**** @Query methods*****+++++++++++++
    public List<CoronaVaccine> fetchVaccineByComp(String comp);
	
	public List<CoronaVaccine> fetchVaccineBypriceRange1(double min,double max);
	
	public List<CoronaVaccine> fetchVaccineByCompanies(String com1,String com2,String com3);
	
	public List<String> fetchVaccineNamesByPriceRange(double min,double max);
}
