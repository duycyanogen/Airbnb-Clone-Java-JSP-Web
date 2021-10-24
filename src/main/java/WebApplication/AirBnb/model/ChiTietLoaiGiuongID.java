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
public class ChiTietLoaiGiuongID implements Serializable {
	@Column
	private Long IDLoaiGiuong;
	@Column
	private Long IDTT;
	
}
