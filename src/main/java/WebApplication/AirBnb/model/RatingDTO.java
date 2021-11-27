package WebApplication.AirBnb.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingDto{
	
	private int starsNumber;
	private String comment;
	private String userName;
	private String userAvatar;
	private String ratingDate;
}