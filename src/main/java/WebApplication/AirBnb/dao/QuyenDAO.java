package WebApplication.AirBnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.Quyen;
@Repository
public interface QuyenDAO extends JpaRepository<Quyen, Long>{

}
