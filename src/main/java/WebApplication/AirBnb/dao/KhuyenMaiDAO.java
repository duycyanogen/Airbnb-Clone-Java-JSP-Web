package WebApplication.AirBnb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.KhuyenMai;

@Repository
public interface KhuyenMaiDAO extends JpaRepository<KhuyenMai, Long>{

}
