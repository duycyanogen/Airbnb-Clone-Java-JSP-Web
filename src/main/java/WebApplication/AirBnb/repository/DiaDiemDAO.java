package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.DiaDiem;

@Repository
public interface DiaDiemDAO extends JpaRepository<DiaDiem, Long>{

}
