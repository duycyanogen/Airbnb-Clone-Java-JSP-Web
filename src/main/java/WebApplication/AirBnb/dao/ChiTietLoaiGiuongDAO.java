package WebApplication.AirBnb.dao;

import org.springframework.data.repository.CrudRepository;

import WebApplication.AirBnb.model.ChiTietLoaiGiuong;
import WebApplication.AirBnb.model.ChiTietLoaiGiuongID;



public interface ChiTietLoaiGiuongDAO extends CrudRepository<ChiTietLoaiGiuong, ChiTietLoaiGiuongID>{

}
