package WebApplication.AirBnb.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_AccountDTO {
	private String Ten;
	private String DiaChi;
	private String GioiTinh;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String NgaySinh;
	private String CCCD;
	private String AnhDaiDien;
	private String SDT;
	private String Mail;
	private String Password;
	public User_AccountDTO(String ten, String diaChi, String gioiTinh, String ngaySinh, String cCCD, String anhDaiDien,
			String sDT, String mail) {
		super();
		Ten = ten;
		DiaChi = diaChi;
		GioiTinh = gioiTinh;
		NgaySinh = ngaySinh;
		CCCD = cCCD;
		AnhDaiDien = anhDaiDien;
		SDT = sDT;
		Mail = mail;
	}
	
	
	//private int idQuyen;
}
