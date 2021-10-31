package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.ChiTietLoaiGiuong;
import WebApplication.AirBnb.domain.ChiTietLoaiGiuongID;


@Repository
public interface ChiTietLoaiGiuongDAO extends JpaRepository<ChiTietLoaiGiuong, ChiTietLoaiGiuongID>{

}
