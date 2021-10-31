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
public class CoSoKhachSan implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDKhachSan;
	private String TenKhachSan;
	private String MoTa;
	
	@ManyToOne
	@JoinColumn(name = "iddia_diem")
	private DiaDiem DiaDiem;
	
	@OneToMany(mappedBy = "CoSoKhachSan")
    private List<ThongTinLoaiPhong> lstThongTinLoaiPhong;
	
}
