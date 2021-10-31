package WebApplication.AirBnb.domain;

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
public class DiaDiem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5536191792506699277L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDDiaDiem;
	private String TenDiaDiem;
	@OneToMany(mappedBy = "DiaDiem")	
	private List<CoSoKhachSan> lstCoSoKhachSan;
	
}
