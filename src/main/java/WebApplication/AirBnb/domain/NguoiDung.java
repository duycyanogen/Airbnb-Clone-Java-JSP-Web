package WebApplication.AirBnb.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class NguoiDung implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDNguoiDung;		
	private String Ten;
	private String DiaChi;
	private String GioiTinh;
	private Date NgaySinh;
	private String CCCD;
	private String AnhDaiDien;
	private String SDT;
	
	@OneToOne
	@JoinColumn(name = "idtai_khoan")
	private TaiKhoan TaiKhoan;
	
}
