package WebApplication.AirBnb.dao;

import org.springframework.data.repository.CrudRepository;

import WebApplication.AirBnb.model.NguoiDung;
import WebApplication.AirBnb.model.Quyen;

public interface QuyenDAO extends CrudRepository<Quyen, Long>{

}
