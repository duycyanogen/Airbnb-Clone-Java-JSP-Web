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
@NoArgsConstructor
@AllArgsConstructor
public class LoaiGiuong implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDLoaiGiuong;
	private String TenLoaiGiuong;
	
	@OneToMany(mappedBy = "LoaiGiuong")
	private List<ChiTietLoaiGiuong> lstChiTietLoaiGiuong;
}
