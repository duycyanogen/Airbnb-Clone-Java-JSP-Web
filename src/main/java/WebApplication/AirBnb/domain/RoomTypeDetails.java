package WebApplication.AirBnb.domain;

import java.io.Serializable;

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
public class RoomTypeDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@EmbeddedId
	private BedTypeId bedTypeId;
	
	
	@ManyToOne
	@MapsId("roomTypeInfoId")
	//@JoinColumn(name = "idtt")
    private RoomTypeInfos roomTypeInfo;
	
	@ManyToOne
	@MapsId("roomTypeId")
	//@JoinColumn(name = "idloai_giuong")
    private BedTypes bedType;	
	private String description;
	
}
