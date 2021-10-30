package WebApplication.AirBnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.ChiTietTienNghi;
import WebApplication.AirBnb.model.ChiTietTienNghiID;


@Repository
public interface ChiTietTienNghiDAO extends JpaRepository<ChiTietTienNghi, ChiTietTienNghiID>{

}
