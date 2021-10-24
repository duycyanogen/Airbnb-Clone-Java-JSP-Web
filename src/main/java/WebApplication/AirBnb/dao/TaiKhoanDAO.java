package WebApplication.AirBnb.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


import WebApplication.AirBnb.model.TaiKhoan;
@Component
public interface TaiKhoanDAO extends CrudRepository<TaiKhoan, Long>{

}
