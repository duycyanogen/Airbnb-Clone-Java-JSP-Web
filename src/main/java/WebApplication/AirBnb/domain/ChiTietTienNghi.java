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
public class ChiTietTienNghi implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChiTietTienNghiID ChiTietTienNghiID;
	
	private String ChuThich;
	
	@ManyToOne
	@MapsId("IDTT")
	//@JoinColumn(name = "idtt")
    private ThongTinLoaiPhong ThongTinLoaiPhong;
	
	@ManyToOne
	@MapsId("IDTienNghi") 
	//@JoinColumn(name = "idtien_nghi")
	private TienNghi TienNghi;	
}
