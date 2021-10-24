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
public class ChiTietTienNghi implements Serializable {
	@EmbeddedId
	private ChiTietTienNghiID ChiTietTienNghiID;
	
	private String ChuThich;
	
	@ManyToOne
	@MapsId("idtt")    
    private ThongTinLoaiPhong ThongTinLoaiPhong;
	
	@ManyToOne
	@MapsId("idtien_nghi")        
	private TienNghi TienNghi;	
}
