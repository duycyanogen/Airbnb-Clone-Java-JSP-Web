package WebApplication.AirBnb.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Posts implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long postId;
	private String postDate;
	@Column(nullable = false, columnDefinition = "nvarchar", length = 200)	
	private String title;
	@Column(nullable = false, columnDefinition = "nvarchar", length = 500)	
	private String content;
	private int status;
		
	@ManyToOne
	@JoinColumn(name = "account_id")
	private Accounts account;
	
	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Accounts getAccount() {
		return account;
	}

	public void setAccount(Accounts account) {
		this.account = account;
	}

	public List<Ratings> getLstRatings() {
		return lstRatings;
	}

	public void setLstRatings(List<Ratings> lstRatings) {
		this.lstRatings = lstRatings;
	}

	public List<Images> getLstImages() {
		return lstImages;
	}

	public void setLstImages(List<Images> lstImages) {
		this.lstImages = lstImages;
	}

	public List<RoomTypeInfos> getLstRoomTypeInfos() {
		return lstRoomTypeInfos;
	}

	public void setLstRoomTypeInfos(List<RoomTypeInfos> lstRoomTypeInfos) {
		this.lstRoomTypeInfos = lstRoomTypeInfos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@OneToMany(mappedBy = "post")
	private List<Ratings> lstRatings;
	
	@OneToMany(mappedBy = "post")
	private List<Images> lstImages;
	
	@OneToMany(mappedBy = "post")
	private List<RoomTypeInfos> lstRoomTypeInfos;
}
