package WebApplication.AirBnb.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
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
public class BedTypes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bedTypeId;
	@Column(length = 200,unique = true, nullable = false, columnDefinition = "nvarchar")	
	private String bedTypeName;
	
	@OneToMany(mappedBy = "bedType")
	private List<BedTypeDetails> lstRoomTypeDetails;

	public Long getBedTypeId() {
		return bedTypeId;
	}

	public void setBedTypeId(Long bedTypeId) {
		this.bedTypeId = bedTypeId;
	}

	public String getBedTypeName() {
		return bedTypeName;
	}

	public void setBedTypeName(String bedTypeName) {
		this.bedTypeName = bedTypeName;
	}

	public List<BedTypeDetails> getLstRoomTypeDetails() {
		return lstRoomTypeDetails;
	}

	public void setLstRoomTypeDetails(List<BedTypeDetails> lstRoomTypeDetails) {
		this.lstRoomTypeDetails = lstRoomTypeDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
