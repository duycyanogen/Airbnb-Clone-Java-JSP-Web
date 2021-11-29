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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	@JsonBackReference
	private Accounts account;
	
	@OneToMany(mappedBy = "post")
	@JsonManagedReference
	private List<Ratings> lstRatings;
	
	@OneToMany(mappedBy = "post")
	@JsonManagedReference
	private List<Images> lstImages;
	
	@OneToMany(mappedBy = "post")
	@JsonManagedReference
	private List<RoomTypeInfos> lstRoomTypeInfos;
}
