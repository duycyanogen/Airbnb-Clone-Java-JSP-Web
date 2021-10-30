package WebApplication.AirBnb.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.model.Rating;
@Repository
public interface RatingDAO extends JpaRepository<Rating, Long>{

}
