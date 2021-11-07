package WebApplication.AirBnb.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccDto {
	@NotBlank(message = "Bạn chưa nhập tên người dùng")
//	@Pattern(regexp="^[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴ"
//			+ "ẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứ"
//			+ "ừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s\\W|_]",message="Tên chỉ bao gồm chữ, không được chứa kí tự lạ")
	private String name;
	private String address;
	private String sex;
	@DateTimeFormat(pattern="yyyy-MM-dd")	
	private String dateOfBirth;
	private String CCCD;
	private String avatar;
	//@NotBlank(message = "Bạn chưa nhập số điện thoại")
	@Pattern(regexp="^[0-9]{9,11}",message="Số điện thoại phải bao gồm 9-11 chữ số")  
	private String phoneNumber;
	@Email(message = "Email không hợp lệ")
	private String mail;
	@Length(min = 6, message = "Password phải từ 6 kí tự trở lên")
	private String password;
	
}
