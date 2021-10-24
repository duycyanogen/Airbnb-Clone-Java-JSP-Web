package WebApplication.AirBnb.dao;

import org.springframework.data.repository.CrudRepository;

import WebApplication.AirBnb.model.NguoiDung;
import WebApplication.AirBnb.model.Tin;

public interface TinDAO extends CrudRepository<Tin, Long>{

}
