package WebApplication.AirBnb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingID implements Serializable {
	@Column
	private String IDTaiKhoan;
	@Column
	private String IDTin;
}
