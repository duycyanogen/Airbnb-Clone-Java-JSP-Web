package WebApplication.AirBnb.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

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
public class Tin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDTin;
	private String NgayDang;
	private String TieuDe;
	private String NoiDung;
	private int TrangThai;
	private Double Gia;
	
	@ManyToOne
	@JoinColumn(name = "idtai_khoan")
	private TaiKhoan TaiKhoan;
	
	@OneToMany(mappedBy = "Tin")
	private List<Rating> lstRating;
	
	@OneToMany(mappedBy = "Tin")
	private List<Anh> lstAnh;
	
	@OneToMany(mappedBy = "Tin")
	private List<ThongTinLoaiPhong> lstThongTinLoaiPhong;
}
