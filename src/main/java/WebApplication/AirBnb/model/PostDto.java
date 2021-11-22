package WebApplication.AirBnb.model;

import java.sql.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
	
	private String postDate;
	@NotEmpty
	private String title;
	private String content;
	private int hotelName;
	private int status;
	@NotEmpty
	private Double price;
	private int locationId;
	private String address;
	private int area;
	private int roomAmount;
	private int roomTypeId;
	private int bedTypeId;
	private List lstServices;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	
	
	
}
