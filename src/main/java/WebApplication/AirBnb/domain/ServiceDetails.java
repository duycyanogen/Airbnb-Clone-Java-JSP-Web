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
public class ServiceDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ServiceDetailId serviceDetailId;
	@Column(columnDefinition = "nvarchar", length = 500)	
	private String description;
	
	@ManyToOne
	@MapsId("roomTypeInfoId")
    private RoomTypeInfos roomTypeInfo;
	
	@ManyToOne
	@MapsId("serviceId") 
	private Services service;

	public ServiceDetailId getServiceDetailId() {
		return serviceDetailId;
	}

	public void setServiceDetailId(ServiceDetailId serviceDetailId) {
		this.serviceDetailId = serviceDetailId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public RoomTypeInfos getRoomTypeInfo() {
		return roomTypeInfo;
	}

	public void setRoomTypeInfo(RoomTypeInfos roomTypeInfo) {
		this.roomTypeInfo = roomTypeInfo;
	}

	public Services getService() {
		return service;
	}

	public void setService(Services service) {
		this.service = service;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
