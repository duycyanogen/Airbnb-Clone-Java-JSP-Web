package WebApplication.AirBnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.ThongTinLoaiPhong;
@Repository
public interface ThongTinLoaiPhongDAO extends JpaRepository<ThongTinLoaiPhong, Long>{

}
