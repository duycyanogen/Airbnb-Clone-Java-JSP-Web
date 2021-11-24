package WebApplication.AirBnb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository; 

import WebApplication.AirBnb.domain.Posts;
import WebApplication.AirBnb.model.PostDto;

@Repository
public interface PostRepository extends JpaRepository<Posts, Long>{

	@Query("SELECT new WebApplication.AirBnb.model.PostDto(post.postId, roomTypeInfos.roomTypeInfoId, "
			+ "user.name , post.postDate , post.title , "
			+ "post.content , hotel.hotelName , post.status , roomTypeInfos.price, location.locationName , "
			+ "hotel.address , roomTypeInfos.area , roomTypeInfos.roomAmount , roomType.roomTypeName , "
			+ "bedType.bedTypeName)"
			+ "from Posts post join post.account acc join acc.user user "
			+ "join post.lstRoomTypeInfos roomTypeInfos "
			+ "join roomTypeInfos.lstBedTypeDetails bedTypeDetails "
			+ "join roomTypeInfos.hotel hotel "
			+ "join roomTypeInfos.roomType roomType "
			+ "join bedTypeDetails.bedType bedType join hotel.location location")
	List<PostDto> getAllPost();
}
