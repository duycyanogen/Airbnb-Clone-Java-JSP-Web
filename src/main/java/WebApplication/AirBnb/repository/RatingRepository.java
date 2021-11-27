package WebApplication.AirBnb.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.Ratings;
import WebApplication.AirBnb.model.RatingDto;
@Repository
public interface RatingRepository extends JpaRepository<Ratings, Long>{

	@Query(value="select * from ratings as r where r.post_id = ?1", nativeQuery = true)
	List<Ratings> getAllRatingByPostId(long postId);
	
//	@Query(value="select r.rating_date as ratingDate, r.comment as comment, r.stars_number as starsNumber,"
//			+ " u.name as userName, u.avatar as userAvatar "
//			+ "from ratings as r, accounts as a, users as u where r.account_id = "
//			+ "a.account_id and a.account_id = u.account_id and r.post_id = ?1", nativeQuery = true)
//	List<RatingDto> getAllRatingDtoByPostId(long postId);
	
//	@Query("Select new WebApplication.AirBnb.model.RatingDto(rating.starsNumber,rating.comment, user.name, user.avatar,"
//			+ "rating.ratingDate) from Ratings rating join rating.post post join post.account account join account.user user where post.postId =?1")
//	List<RatingDto> getAllRatingDtoByPostId(long postId);
}
