package WebApplication.AirBnb.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.Rating;
@Repository
public interface RatingDAO extends JpaRepository<Rating, Long>{

}
