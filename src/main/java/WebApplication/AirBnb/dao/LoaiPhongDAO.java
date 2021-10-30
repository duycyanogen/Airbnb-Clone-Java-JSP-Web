package WebApplication.AirBnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.LoaiPhong;

@Repository
public interface LoaiPhongDAO extends JpaRepository<LoaiPhong, Long>{

}
