package WebApplication.AirBnb.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
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
@AllArgsConstructor
@NoArgsConstructor
public class TaiKhoan implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDTaiKhoan;
	@Column(length = 60,unique = true, nullable = false)
	private String Mail;
	@Column(length = 200, nullable = false)
	private String Password;

	@ManyToOne
	@JoinColumn(name = "idquyen")
	private Quyen Quyen;

	@OneToOne(mappedBy = "TaiKhoan")
	private NguoiDung NguoiDung;
	
	@OneToMany(mappedBy = "TaiKhoan")
	private List<Tin> lstTin;

	
}
