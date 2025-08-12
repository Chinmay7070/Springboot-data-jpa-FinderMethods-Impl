package com.nt.ropo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.Entity.CoronaVaccine;

public interface ICaronaVaccineRepo extends PagingAndSortingRepository<CoronaVaccine, Long> {

}
