package WebApplication.AirBnb.dao;

import org.springframework.data.repository.CrudRepository;

import WebApplication.AirBnb.model.ChiTietTienNghi;
import WebApplication.AirBnb.model.ChiTietTienNghiID;



public interface ChiTietTienNghiDAO extends CrudRepository<ChiTietTienNghi, ChiTietTienNghiID>{

}
