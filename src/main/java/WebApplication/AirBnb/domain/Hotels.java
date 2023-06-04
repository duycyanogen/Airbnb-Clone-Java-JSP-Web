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


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotels implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hotelId;
	@Column(nullable = false, columnDefinition = "nvarchar")	
	private String hotelName;
	@Column(columnDefinition = "nvarchar", length = 200)	
	private String description;
	private String address;
	@ManyToOne
	@JoinColumn(name = "location_id")
	private Locations location;
	
	@OneToMany(mappedBy = "hotel")
    private List<RoomTypeInfos> lstRoomTypeInfos;

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Locations getLocation() {
		return location;
	}

	public void setLocation(Locations location) {
		this.location = location;
	}

	public List<RoomTypeInfos> getLstRoomTypeInfos() {
		return lstRoomTypeInfos;
	}

	public void setLstRoomTypeInfos(List<RoomTypeInfos> lstRoomTypeInfos) {
		this.lstRoomTypeInfos = lstRoomTypeInfos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
