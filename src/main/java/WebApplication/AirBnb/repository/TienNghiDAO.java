package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.TienNghi;
@Repository
public interface TienNghiDAO extends JpaRepository<TienNghi, Long>{

}
