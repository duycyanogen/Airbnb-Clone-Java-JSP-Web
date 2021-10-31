package WebApplication.AirBnb.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.TaiKhoan;
@Repository
public interface TaiKhoanDAO extends JpaRepository<TaiKhoan, Long>{

}
