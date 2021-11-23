package WebApplication.AirBnb.model;

import java.sql.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
	private long accountId;
	private String postDate;
	@NotBlank(message = "Bạn chưa nhập tiêu đề")
	private String title;
	@NotBlank(message = "Bạn chưa nhập nội dung tin")
	private String content;
	@NotBlank(message = "Bạn chưa nhập tên khách sạn!")
	private String hotelName;
	private int status;
	@NotNull(message = "Bạn chưa nhập giá!")
	private Double price;	
	private long locationId;
	@NotEmpty(message = "Bạn chưa nhập địa chỉ!")
	private String address;
	private double area;
	@NotNull(message = "Bạn chưa nhập số phòng!")
	private int roomAmount;
	private long roomTypeId;
	private long bedTypeId;
	private List<Long> lstServices;	
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	
	
	
}
