package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.NguoiDung;
@Repository
public interface NguoiDungDAO extends JpaRepository<NguoiDung, Long>{

}
