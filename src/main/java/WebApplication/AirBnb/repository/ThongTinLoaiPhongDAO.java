package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.ThongTinLoaiPhong;
@Repository
public interface ThongTinLoaiPhongDAO extends JpaRepository<ThongTinLoaiPhong, Long>{

}
