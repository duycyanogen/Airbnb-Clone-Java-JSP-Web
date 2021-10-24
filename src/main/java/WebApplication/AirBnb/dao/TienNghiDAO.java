package WebApplication.AirBnb.dao;

import org.springframework.data.repository.CrudRepository;

import WebApplication.AirBnb.model.NguoiDung;
import WebApplication.AirBnb.model.TienNghi;
import WebApplication.AirBnb.model.Tin;

public interface TienNghiDAO extends CrudRepository<TienNghi, Long>{

}
