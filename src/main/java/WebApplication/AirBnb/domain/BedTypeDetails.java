package WebApplication.AirBnb.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Embeddable
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BedTypeDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@EmbeddedId
	private BedTypeDetailId bedTypeDetailId;
	
	
	@ManyToOne
	@MapsId("roomTypeInfoId")
    private RoomTypeInfos roomTypeInfo;
	
	@ManyToOne
	@MapsId("bedTypeId")
    private BedTypes bedType;	
	@Column(columnDefinition = "nvarchar", length = 255)
	private String description;
	public BedTypeDetailId getBedTypeDetailId() {
		return bedTypeDetailId;
	}
	public void setBedTypeDetailId(BedTypeDetailId bedTypeDetailId) {
		this.bedTypeDetailId = bedTypeDetailId;
	}
	public RoomTypeInfos getRoomTypeInfo() {
		return roomTypeInfo;
	}
	public void setRoomTypeInfo(RoomTypeInfos roomTypeInfo) {
		this.roomTypeInfo = roomTypeInfo;
	}
	public BedTypes getBedType() {
		return bedType;
	}
	public void setBedType(BedTypes bedType) {
		this.bedType = bedType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
