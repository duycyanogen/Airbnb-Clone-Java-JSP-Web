package WebApplication.AirBnb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDto{
	
	private long serviceId;
	private String serviceName;
	private String icon;
	
}
