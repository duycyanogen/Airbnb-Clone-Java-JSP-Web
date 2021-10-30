package WebApplication.AirBnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.Tin;
@Repository
public interface TinDAO extends JpaRepository<Tin, Long>{

}
