package WebApplication.AirBnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.DiaDiem;

@Repository
public interface DiaDiemDAO extends JpaRepository<DiaDiem, Long>{

}
