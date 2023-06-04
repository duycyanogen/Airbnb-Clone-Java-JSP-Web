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
	
	public UserAccDto(@NotBlank(message = "Bạn chưa nhập tên người dùng") String name, String address, String sex,
			String dateOfBirth, String CCCD, String avatar,
			@Pattern(regexp = "^[0-9]{9,11}", message = "Số điện thoại phải bao gồm 9-11 chữ số") String phoneNumber,
			long accountId, @Email(message = "Email không hợp lệ") String mail,
			@Length(min = 6, message = "Password phải từ 6 kí tự trở lên") String password, String regisDate) {
		super();
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
		this.CCCD = CCCD;
		this.avatar = avatar;
		this.phoneNumber = phoneNumber;
		this.accountId = accountId;
		this.mail = mail;
		this.password = password;
		RegisDate = regisDate;
	}
	public UserAccDto() {
		// TODO Auto-generated constructor stub
	}
	private long roleId = 2;// Mặc định là người dùng
	@NotBlank(message = "Bạn chưa nhập tên người dùng")
	private String name;
	private String address;
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCCCD() {
		return CCCD;
	}
	public void setCCCD(String cCCD) {
		CCCD = cCCD;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegisDate() {
		return RegisDate;
	}
	public void setRegisDate(String regisDate) {
		RegisDate = regisDate;
	}
	private String sex;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String dateOfBirth;
	private String CCCD;
	private String avatar;
	// @NotBlank(message = "Bạn chưa nhập số điện thoại")
	@Pattern(regexp = "^[0-9]{9,11}", message = "Số điện thoại phải bao gồm 9-11 chữ số")
	private String phoneNumber;
	private long accountId;
	@Email(message = "Email không hợp lệ")
	private String mail;
	@Length(min = 6, message = "Password phải từ 6 kí tự trở lên")
	private String password;
	private String RegisDate;
}
