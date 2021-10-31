package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.LoaiPhong;

@Repository
public interface LoaiPhongDAO extends JpaRepository<LoaiPhong, Long>{

}
