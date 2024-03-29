package WebApplication.AirBnb.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BedTypeDetailId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private Long bedTypeId;
	@Column
	private Long roomTypeInfoId;
	public Long getBedTypeId() {
		return bedTypeId;
	}
	public void setBedTypeId(Long bedTypeId) {
		this.bedTypeId = bedTypeId;
	}
	public Long getRoomTypeInfoId() {
		return roomTypeInfoId;
	}
	public void setRoomTypeInfoId(Long roomTypeInfoId) {
		this.roomTypeInfoId = roomTypeInfoId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
