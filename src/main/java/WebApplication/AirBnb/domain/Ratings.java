package WebApplication.AirBnb.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Embeddable
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ratings implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private Long ratingId;
	private int starsNumber;
	private String comment;
	
		
	@ManyToOne
	@MapsId("postsId")
	//@JoinColumn(name = "idtin")
    private Posts post;
	
	
}
