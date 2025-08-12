package com.nt.Service;

import com.nt.Entity.CoronaVaccine;

public interface ICoronaVaccineManagementService {
	    public  Iterable<CoronaVaccine>  fetchDetails(boolean asc,String... properties);
	    public  Iterable<CoronaVaccine>  fetchDetailsByPageNo(int pageNo,int pageSize,boolean asc,String... props);
	    public  void  fetchDetailsbyPagination(int pageSize);
}
