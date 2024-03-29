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
public class RoomTypes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roomTypeId;
	@Column(nullable = false, columnDefinition = "nvarchar", length = 200)	
	private String roomTypeName;
	@OneToMany(mappedBy = "roomType")
    private List<RoomTypeInfos> lstRoomTypeInfos;
	public Long getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(Long roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public String getRoomTypeName() {
		return roomTypeName;
	}
	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
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
