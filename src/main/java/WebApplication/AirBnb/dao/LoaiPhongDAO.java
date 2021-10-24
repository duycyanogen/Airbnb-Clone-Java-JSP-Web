package WebApplication.AirBnb.dao;

import org.springframework.data.repository.CrudRepository;

import WebApplication.AirBnb.model.DiaDiem;
import WebApplication.AirBnb.model.LoaiGiuong;
import WebApplication.AirBnb.model.LoaiPhong;


public interface LoaiPhongDAO extends CrudRepository<LoaiPhong, Long>{

}
