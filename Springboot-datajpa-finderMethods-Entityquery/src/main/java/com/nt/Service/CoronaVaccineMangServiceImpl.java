package com.nt.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.Entity.CoronaVaccine;
import com.nt.ropo.ICaronaVaccineRepo;

public class CoronaVaccineMangServiceImpl implements ICoronaVaccineManagementService {

	@Autowired
	private ICaronaVaccineRepo coronarepo;

	@Override
	public List<CoronaVaccine> fetchVaccineByCompany(String company) {
		
		return coronarepo.findByCompany(company);
	}

	@Override
	public List<CoronaVaccine> fetchVaccinesByPriceLessThan(double price) {
		
		return coronarepo.FindByPriceLessThan(price);
	}

	@Override
	public List<CoronaVaccine> fetchVaccineBypriceRange(double startp, double endp) {
		return coronarepo.FindByPriceBetween(startp, endp);
	}

	@Override
	public List<CoronaVaccine> fetchVaccineByNameLike(String initChars) {
		return coronarepo.FindByNameLike(initChars);
	}

	@Override
	public List<CoronaVaccine> fetchVaccineByNameStartingwith(String startLetters) {
		return coronarepo.findByNameStartwith(startLetters);
	}

	@Override
	public List<CoronaVaccine> fetchVaccineByNameEndingWith(String endLetters) {
		return coronarepo.findByNameEndingwith(endLetters);
	}

	@Override
	public List<CoronaVaccine> fetchVaccneByNmaeHaving(String letters) {
		return coronarepo.findByNameContaining(letters);
	}

	@Override
	public List<CoronaVaccine> fetchVaccineByCountries(String... countries) {
		List<String> countlist = Arrays.asList(countries);
		return coronarepo.findByCountryIn(countlist);
	}

	@Override
	public List<CoronaVaccine> searchVaccinesNotInCountries(List<String> countriesl) {
		return coronarepo.findByCountryNotIn(countriesl);
	}

	@Override
	public List<CoronaVaccine> searchVaccinesByPricebyAsc(double startPrice) {
	
	  return coronarepo.findByPriceGreaterthanOrderByPriceAsc(startPrice);
	}

	

	
	
	
	
	
}
