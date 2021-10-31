package WebApplication.AirBnb.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingDTO{
	
	private int SoSao;
	private String Comment;
}
