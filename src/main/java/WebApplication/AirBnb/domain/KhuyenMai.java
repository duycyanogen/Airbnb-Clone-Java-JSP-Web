package WebApplication.AirBnb.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class KhuyenMai implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDKhuyenMai;
	private Double MucGiam;
	private int LoaiKhuyenMai;
	private Date ThoiHan;
	private String MoTa;
	@OneToMany(mappedBy = "KhuyenMai")
    private List<ThongTinLoaiPhong> lstThongTinLoaiPhong;
	
}
