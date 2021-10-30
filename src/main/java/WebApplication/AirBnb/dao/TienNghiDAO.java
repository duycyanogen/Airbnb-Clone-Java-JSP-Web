package WebApplication.AirBnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.TienNghi;
@Repository
public interface TienNghiDAO extends JpaRepository<TienNghi, Long>{

}
