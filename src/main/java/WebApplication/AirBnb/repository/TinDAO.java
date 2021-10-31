package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.Tin;
@Repository
public interface TinDAO extends JpaRepository<Tin, Long>{

}
