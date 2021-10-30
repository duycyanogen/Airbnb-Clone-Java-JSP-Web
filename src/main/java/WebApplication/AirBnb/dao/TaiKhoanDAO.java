package WebApplication.AirBnb.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.TaiKhoan;
@Repository
public interface TaiKhoanDAO extends JpaRepository<TaiKhoan, Long>{

}
