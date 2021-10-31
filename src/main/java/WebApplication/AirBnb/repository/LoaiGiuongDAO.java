package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.LoaiGiuong;

@Repository
public interface LoaiGiuongDAO extends JpaRepository<LoaiGiuong, Long>{

}
