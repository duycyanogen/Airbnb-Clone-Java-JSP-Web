package WebApplication.AirBnb.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TienNghi implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDTienNghi;
	private String TenTienNghi;
	@OneToMany(mappedBy = "ThongTinLoaiPhong")
    private List<ThongTinLoaiPhong> lstThongTinLoaiPhong;
}
