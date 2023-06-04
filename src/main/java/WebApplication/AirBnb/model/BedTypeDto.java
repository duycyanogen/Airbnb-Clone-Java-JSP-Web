package WebApplication.AirBnb.model;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BedTypeDto {
	private long bedTypeId;
	@NotBlank
	private String bedTypeName;
	public long getBedTypeId() {
		return bedTypeId;
	}
	public void setBedTypeId(long bedTypeId) {
		this.bedTypeId = bedTypeId;
	}
	public String getBedTypeName() {
		return bedTypeName;
	}
	public void setBedTypeName(String bedTypeName) {
		this.bedTypeName = bedTypeName;
	}
	
	
}
