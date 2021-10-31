package WebApplication.AirBnb.model;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TinDTO {
	
	private Date NgayDang;
	@NotEmpty
	private String TieuDe;
	private String NoiDung;
	@NotEmpty
	private int TrangThai;
	@NotEmpty
	private Double Gia;
	
	
}
