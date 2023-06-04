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
public class ServiceDetailId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private Long serviceId;
	@Column
	private Long roomTypeInfoId;
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
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
