package WebApplication.AirBnb.model;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasswordDto {
	
	//private Long IDTaiKhoan;	
	@NotBlank(message = "Không được để trống")
	private String currentPassword;
	@NotBlank(message = "Không được để trống")
	private String  newPassword;
	@NotBlank(message = "Không được để trống")
	private String  confirmPassword;
	//private int idQuyen;
//	@ManyToOne
//	@JoinColumn(name = "idquyen")
//	private Quyen Quyen;
//
//	@OneToOne(mappedBy = "TaiKhoan")
//	private NguoiDung NguoiDung;
//	
//	@OneToMany(mappedBy = "TaiKhoan")
//	private List<Tin> lstTin;
	public String getCurrentPassword() {
		return currentPassword;
	}
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	
}
