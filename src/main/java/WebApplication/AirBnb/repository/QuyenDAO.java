package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.Quyen;
@Repository
public interface QuyenDAO extends JpaRepository<Quyen, Long>{

}
