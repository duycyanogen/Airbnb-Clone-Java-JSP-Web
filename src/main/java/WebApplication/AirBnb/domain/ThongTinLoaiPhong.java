package WebApplication.AirBnb.domain;

import java.io.Serializable;
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
public class ThongTinLoaiPhong implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDTT;
	private int SoPhong;
	private Double DienTich;
	
	@OneToMany(mappedBy = "ThongTinLoaiPhong")
    private List<ChiTietLoaiGiuong> lstChiTietLoaiGiuong;
	
	@OneToMany(mappedBy = "TienNghi")
    private List<ChiTietTienNghi> lstChiTietTienNghi;
	
	@ManyToOne
	@JoinColumn(name = "idkhach_san")
	private CoSoKhachSan CoSoKhachSan;
	
	@ManyToOne
	@JoinColumn(name = "idloai_phong")
	private LoaiPhong LoaiPhong;
	
	@ManyToOne
	@JoinColumn(name = "idkhuyen_mai")
	private KhuyenMai KhuyenMai;
	
	@ManyToOne
	@JoinColumn(name = "idtin")
	private Tin Tin;
	
}
