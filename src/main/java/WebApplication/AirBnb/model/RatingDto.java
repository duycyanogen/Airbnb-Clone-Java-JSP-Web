package WebApplication.AirBnb.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingDto{
	
	private int SoSao;
	private String Comment;
}
