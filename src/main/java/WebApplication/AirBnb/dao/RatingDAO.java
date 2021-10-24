package WebApplication.AirBnb.dao;

import org.springframework.data.repository.CrudRepository;

import WebApplication.AirBnb.model.Rating;

public interface RatingDAO extends CrudRepository<Rating, Long>{

}
