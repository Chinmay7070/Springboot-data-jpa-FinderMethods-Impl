package com.nt.Service;

import java.util.List;

import com.nt.Entity.CoronaVaccine;

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
	
	
}
