package WebApplication.AirBnb.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.Ratings;
@Repository
public interface RatingRepository extends JpaRepository<Ratings, Long>{

}
