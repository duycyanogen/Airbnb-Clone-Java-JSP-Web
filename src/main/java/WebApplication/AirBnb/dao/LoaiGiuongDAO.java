package WebApplication.AirBnb.dao;

import org.springframework.data.repository.CrudRepository;

import WebApplication.AirBnb.model.DiaDiem;
import WebApplication.AirBnb.model.LoaiGiuong;


public interface LoaiGiuongDAO extends CrudRepository<LoaiGiuong, Long>{

}
