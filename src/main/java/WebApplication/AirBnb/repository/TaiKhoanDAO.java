package WebApplication.AirBnb.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.TaiKhoan;
import WebApplication.AirBnb.model.User_AccountDTO;
@Repository
public interface TaiKhoanDAO extends JpaRepository<TaiKhoan, Long>{
	@Query("SELECT u FROM TaiKhoan u WHERE u.Mail = :Mail")
	TaiKhoan getTaiKhoanByMail(@Param("Mail") String Mail);
	
	@Query("SELECT new WebApplication.AirBnb.model.User_AccountDTO(n.Ten , n.DiaChi , n.GioiTinh , n.NgaySinh , "
			+ "n.CCCD , n.AnhDaiDien , n.SDT , t.Mail) from TaiKhoan t join NguoiDung n WHERE t.Mail =:Mail")
	User_AccountDTO getUserAccountByMail(@Param("Mail") String Mail);
}
