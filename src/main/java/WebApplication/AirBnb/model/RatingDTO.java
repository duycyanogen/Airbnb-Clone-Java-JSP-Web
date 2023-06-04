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
	public int getStarsNumber() {
		return starsNumber;
	}

	public void setStarsNumber(int starsNumber) {
		this.starsNumber = starsNumber;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	public String getRatingDate() {
		return ratingDate;
	}

	public void setRatingDate(String ratingDate) {
		this.ratingDate = ratingDate;
	}

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

	private long postId;
	private long accountId;
	
	public RatingDto(int starsNumber, String comment, String userName, String userAvatar, String ratingDate) {
		super();
		this.starsNumber = starsNumber;
		this.comment = comment;
		this.userName = userName;
		this.userAvatar = userAvatar;
		this.ratingDate = ratingDate;
	}

	public RatingDto() {
		// TODO Auto-generated constructor stub
	}
}
