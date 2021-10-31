package WebApplication.AirBnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.KhuyenMai;

@Repository
public interface KhuyenMaiDAO extends JpaRepository<KhuyenMai, Long>{

}
