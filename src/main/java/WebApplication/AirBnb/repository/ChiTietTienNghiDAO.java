package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.ChiTietTienNghi;
import WebApplication.AirBnb.domain.ChiTietTienNghiID;


@Repository
public interface ChiTietTienNghiDAO extends JpaRepository<ChiTietTienNghi, ChiTietTienNghiID>{

}
