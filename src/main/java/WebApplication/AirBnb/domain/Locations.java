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
public class Locations implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5536191792506699277L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long locationId;
	@Column(nullable = false, columnDefinition = "nvarchar", length = 200)	
	private String locationName;
	@OneToMany(mappedBy = "location")
	private List<Hotels> lstHotels;
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public List<Hotels> getLstHotels() {
		return lstHotels;
	}
	public void setLstHotels(List<Hotels> lstHotels) {
		this.lstHotels = lstHotels;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
