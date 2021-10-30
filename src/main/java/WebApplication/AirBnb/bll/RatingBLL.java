package WebApplication.AirBnb.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebApplication.AirBnb.dao.RatingDAO;
import WebApplication.AirBnb.model.Rating;


@Service
public class RatingBLL {

	@Autowired
	private RatingDAO repository;

	public Rating save(Rating rating) {
		return repository.saveAndFlush(rating);
	}

	public Rating findRating(long id) {
		Rating rating = repository.getById(id);
		return rating;
	}

	public List<Rating> findAll() {
		return repository.findAll();
	}

	public Rating update(Rating rating) {
		return repository.saveAndFlush(rating);
	}

	public void delete(Rating rating) {
		repository.delete(rating);
	}

}
