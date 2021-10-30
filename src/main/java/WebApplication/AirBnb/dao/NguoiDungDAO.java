package WebApplication.AirBnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.NguoiDung;
@Repository
public interface NguoiDungDAO extends JpaRepository<NguoiDung, Long>{

}
