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
@AllArgsConstructor
@NoArgsConstructor
public class Services implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serviceId;
	@Column(nullable = false, columnDefinition = "nvarchar", length = 200)	
	private String serviceName;
	private String icon;
	@OneToMany(mappedBy = "service")
    private List<ServiceDetails> lstServiceDetails;
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public List<ServiceDetails> getLstServiceDetails() {
		return lstServiceDetails;
	}
	public void setLstServiceDetails(List<ServiceDetails> lstServiceDetails) {
		this.lstServiceDetails = lstServiceDetails;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
