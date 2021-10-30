package WebApplication.AirBnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.LoaiGiuong;

@Repository
public interface LoaiGiuongDAO extends JpaRepository<LoaiGiuong, Long>{

}
