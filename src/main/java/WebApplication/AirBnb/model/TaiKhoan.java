package WebApplication.AirBnb.model;

import java.io.Serializable;
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
@AllArgsConstructor
@NoArgsConstructor
public class TaiKhoan implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDTaiKhoan;
	//@Email
	private String Mail;
	private String Password;

	@ManyToOne
	@JoinColumn(name = "idquyen")
	private Quyen Quyen;

	@OneToOne(mappedBy = "TaiKhoan")
	private NguoiDung NguoiDung;
	
	@OneToMany(mappedBy = "TaiKhoan")
	private List<Tin> lstTin;

	
}
