package WebApplication.AirBnb.model;


import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import WebApplication.AirBnb.domain.Ratings;
import WebApplication.AirBnb.domain.Services;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
	private long postId;
	private long accountId;
	private long romTypeInfoId;
	private String userName;
	private String postDate;
	public long getPostId() {
		return postId;
	}
	public void setPostId(long postId) {
		this.postId = postId;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getRomTypeInfoId() {
		return romTypeInfoId;
	}
	public void setRomTypeInfoId(long romTypeInfoId) {
		this.romTypeInfoId = romTypeInfoId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public long getLocationId() {
		return locationId;
	}
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getRoomAmount() {
		return roomAmount;
	}
	public void setRoomAmount(int roomAmount) {
		this.roomAmount = roomAmount;
	}
	public long getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(long roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public String getRoomTypeName() {
		return roomTypeName;
	}
	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}
	public long getBedTypeId() {
		return bedTypeId;
	}
	public void setBedTypeId(long bedTypeId) {
		this.bedTypeId = bedTypeId;
	}
	public String getBedTypeName() {
		return bedTypeName;
	}
	public void setBedTypeName(String bedTypeName) {
		this.bedTypeName = bedTypeName;
	}
	public List<Long> getLstServiceIds() {
		return lstServiceIds;
	}
	public void setLstServiceIds(List<Long> lstServiceIds) {
		this.lstServiceIds = lstServiceIds;
	}
	public List<String> getLstServiceNames() {
		return lstServiceNames;
	}
	public void setLstServiceNames(List<String> lstServiceNames) {
		this.lstServiceNames = lstServiceNames;
	}
	public List<Services> getLstServices() {
		return lstServices;
	}
	public void setLstServices(List<Services> lstServices) {
		this.lstServices = lstServices;
	}
	public List<Ratings> getLstRatings() {
		return lstRatings;
	}
	public void setLstRatings(List<Ratings> lstRatings) {
		this.lstRatings = lstRatings;
	}
	public List<RatingDto> getLstRatingDtos() {
		return lstRatingDtos;
	}
	public void setLstRatingDtos(List<RatingDto> lstRatingDtos) {
		this.lstRatingDtos = lstRatingDtos;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getImage4() {
		return image4;
	}
	public void setImage4(String image4) {
		this.image4 = image4;
	}
	public String getImage5() {
		return image5;
	}
	public void setImage5(String image5) {
		this.image5 = image5;
	}
	public String getAuthorImage() {
		return authorImage;
	}
	public void setAuthorImage(String authorImage) {
		this.authorImage = authorImage;
	}
	public String getAuthorPhoneNumber() {
		return authorPhoneNumber;
	}
	public void setAuthorPhoneNumber(String authorPhoneNumber) {
		this.authorPhoneNumber = authorPhoneNumber;
	}
	public int getRatingAmount() {
		return ratingAmount;
	}
	public void setRatingAmount(int ratingAmount) {
		this.ratingAmount = ratingAmount;
	}
	public double getAvarageStarNumber() {
		return avarageStarNumber;
	}
	public void setAvarageStarNumber(double avarageStarNumber) {
		this.avarageStarNumber = avarageStarNumber;
	}
	public String getRegisDate() {
		return regisDate;
	}
	public void setRegisDate(String regisDate) {
		this.regisDate = regisDate;
	}
	public int getHostRatingAmount() {
		return hostRatingAmount;
	}
	public void setHostRatingAmount(int hostRatingAmount) {
		this.hostRatingAmount = hostRatingAmount;
	}
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
	private String locationName;
	@NotEmpty(message = "Bạn chưa nhập địa chỉ!")
	private String address;
	private double area;
	@NotNull(message = "Bạn chưa nhập số phòng!")
	private int roomAmount;
	private long roomTypeId;
	
	private String roomTypeName;
	private long bedTypeId;
	private String bedTypeName;
	private List<Long> lstServiceIds;	
	private List<String> lstServiceNames;
	private List<Services> lstServices;
	private List<Ratings> lstRatings;
	private List<RatingDto> lstRatingDtos;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	private String authorImage;
	private String authorPhoneNumber;
	private int ratingAmount;
	private double avarageStarNumber;
	private String regisDate;
	private int hostRatingAmount;
	public PostDto(long accountId, long postId, long romTypeInfoId, String userName, String regisDate, String postDate,
			@NotBlank(message = "Bạn chưa nhập tiêu đề") String title,
			@NotBlank(message = "Bạn chưa nhập nội dung tin") String content,
			@NotBlank(message = "Bạn chưa nhập tên khách sạn!") String hotelName, int status,
			@NotNull(message = "Bạn chưa nhập giá!") Double price, String locationName,
			@NotEmpty(message = "Bạn chưa nhập địa chỉ!") String address, double area,
			@NotNull(message = "Bạn chưa nhập số phòng!") int roomAmount, String roomTypeName, String bedTypeName, String authorImage, String authorPhoneNumber) {
		super();
		this.accountId = accountId;
		this.postId = postId;
		this.romTypeInfoId = romTypeInfoId;
		this.userName = userName;
		this.regisDate = regisDate;
		this.postDate = postDate;
		this.title = title;
		this.content = content;
		this.hotelName = hotelName;
		this.status = status;
		this.price = price;
		this.locationName = locationName;
		this.address = address;
		this.area = area;
		this.roomAmount = roomAmount;
		this.roomTypeName = roomTypeName;
		this.bedTypeName = bedTypeName;
		this.authorImage = authorImage;
		this.authorPhoneNumber = authorPhoneNumber;
	}
	public PostDto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
