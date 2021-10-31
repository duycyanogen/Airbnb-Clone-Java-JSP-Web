package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.CoSoKhachSan;


@Repository
public interface CoSoKhachSanDAO extends JpaRepository<CoSoKhachSan, Long>{

}
