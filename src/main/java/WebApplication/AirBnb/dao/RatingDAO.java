package WebApplication.AirBnb.dao;

import org.springframework.data.repository.CrudRepository;

import WebApplication.AirBnb.model.NguoiDung;
import WebApplication.AirBnb.model.Rating;
import WebApplication.AirBnb.model.RatingID;
import WebApplication.AirBnb.model.Tin;

public interface RatingDAO extends CrudRepository<Rating, RatingID>{

}
