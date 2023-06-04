package WebApplication.AirBnb.domain;

import java.io.Serializable;
import java.util.List;

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
public class RoomTypeInfos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roomTypeInfoId;
	private int roomAmount;
	private Double area;
	private Double price;
	@OneToMany(mappedBy = "roomTypeInfo")
    private List<BedTypeDetails> lstBedTypeDetails;
	
	@OneToMany(mappedBy = "service")
    private List<ServiceDetails> lstServiceDetails;
	
	@ManyToOne
	@JoinColumn(name = "hotelId")
	private Hotels hotel;
	
	@ManyToOne
	@JoinColumn(name = "roomTypeId")
	private RoomTypes roomType;
		
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Posts post;

	public Long getRoomTypeInfoId() {
		return roomTypeInfoId;
	}

	public void setRoomTypeInfoId(Long roomTypeInfoId) {
		this.roomTypeInfoId = roomTypeInfoId;
	}

	public int getRoomAmount() {
		return roomAmount;
	}

	public void setRoomAmount(int roomAmount) {
		this.roomAmount = roomAmount;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<BedTypeDetails> getLstBedTypeDetails() {
		return lstBedTypeDetails;
	}

	public void setLstBedTypeDetails(List<BedTypeDetails> lstBedTypeDetails) {
		this.lstBedTypeDetails = lstBedTypeDetails;
	}

	public List<ServiceDetails> getLstServiceDetails() {
		return lstServiceDetails;
	}

	public void setLstServiceDetails(List<ServiceDetails> lstServiceDetails) {
		this.lstServiceDetails = lstServiceDetails;
	}

	public Hotels getHotel() {
		return hotel;
	}

	public void setHotel(Hotels hotel) {
		this.hotel = hotel;
	}

	public RoomTypes getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomTypes roomType) {
		this.roomType = roomType;
	}

	public Posts getPost() {
		return post;
	}

	public void setPost(Posts post) {
		this.post = post;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
