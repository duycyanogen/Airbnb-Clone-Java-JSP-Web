package WebApplication.AirBnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.CoSoKhachSan;


@Repository
public interface CoSoKhachSanDAO extends JpaRepository<CoSoKhachSan, Long>{

}
