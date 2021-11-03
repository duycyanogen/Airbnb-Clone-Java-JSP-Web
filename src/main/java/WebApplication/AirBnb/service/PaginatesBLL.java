package WebApplication.AirBnb.service;

import org.springframework.stereotype.Service;

import WebApplication.AirBnb.model.PaginatesDTO;


public interface PaginatesBLL {

	public PaginatesDTO GetInfoPaginates(int totalData, int limit, int currentPage);
}
