package WebApplication.AirBnb.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
public class Rating implements Serializable {
	@EmbeddedId
	private RatingID RatingID;
	private int SoSao;
	private String Comment;
	
//	@ManyToOne
//	@JoinColumn(name = "idtai_khoan")
//    private TaiKhoan TaiKhoan;
//	
//	@ManyToOne
//	@JoinColumn(name = "idtin")
//    private Tin Tin;
	
	
}
