package WebApplication.AirBnb.model;

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
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tin implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDTin;
	private Date NgayDang;
	private String TieuDe;
	private String NoiDung;
	private int TrangThai;
	private Double Gia;
	
	@ManyToOne
	@JoinColumn(name = "idtai_khoan")
	private TaiKhoan TaiKhoan;
	
	@OneToMany(mappedBy = "tin")
	private List<Rating> lstRating;
	
	@OneToMany(mappedBy = "thong_tin_loai_phong")
	private List<ThongTinLoaiPhong> lstThongTinLoaiPhong;
}
