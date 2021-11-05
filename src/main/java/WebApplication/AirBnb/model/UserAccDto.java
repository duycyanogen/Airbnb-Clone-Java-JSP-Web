package WebApplication.AirBnb.model;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccDto {
	private String name;
	private String address;
	private String sex;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String dateOfBirth;
	private String CCCD;
	private String avatar;
	private String phoneNumber;
	private String mail;
	private String password;
	
}
