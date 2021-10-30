package WebApplication.AirBnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.ChiTietLoaiGiuong;
import WebApplication.AirBnb.model.ChiTietLoaiGiuongID;


@Repository
public interface ChiTietLoaiGiuongDAO extends JpaRepository<ChiTietLoaiGiuong, ChiTietLoaiGiuongID>{

}
