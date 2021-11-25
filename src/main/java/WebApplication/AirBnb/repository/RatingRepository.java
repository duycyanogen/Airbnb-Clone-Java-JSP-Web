package WebApplication.AirBnb.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.Ratings;
@Repository
public interface RatingRepository extends JpaRepository<Ratings, Long>{

	@Query(value="select * from ratings as r where r.post_id = ?1", nativeQuery = true)
	List<Ratings> getAllRatingByPostId(long postId);
}
