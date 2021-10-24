package WebApplication.AirBnb.dao;

import org.springframework.data.repository.CrudRepository;

import WebApplication.AirBnb.model.DiaDiem;
import WebApplication.AirBnb.model.KhuyenMai;


public interface KhuyenMaiDAO extends CrudRepository<KhuyenMai, Long>{

}
