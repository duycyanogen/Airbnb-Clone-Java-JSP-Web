package WebApplication.AirBnb.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import WebApplication.AirBnb.domain.Images;
@Repository
public interface ImageRepository extends JpaRepository<Images, Long>{
	
	
}
