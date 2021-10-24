package WebApplication.AirBnb.dao;

import org.springframework.data.repository.CrudRepository;

import WebApplication.AirBnb.model.ChiTietLoaiGiuong;
import WebApplication.AirBnb.model.CoSoKhachSan;



public interface CoSoKhachSanDAO extends CrudRepository<CoSoKhachSan, Long>{

}
