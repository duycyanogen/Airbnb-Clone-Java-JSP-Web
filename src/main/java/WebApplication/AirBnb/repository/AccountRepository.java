package WebApplication.AirBnb.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import WebApplication.AirBnb.domain.Accounts;
import WebApplication.AirBnb.model.UserAccDto;
@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long>{
	@Query("SELECT u FROM Accounts u WHERE u.mail = :mail")
	Accounts getAccountByMail(@Param("mail") String mail);
	
	@Query("SELECT new WebApplication.AirBnb.model.UserAccDto(n.name , n.address , n.sex , n.dateOfBirth , "
			+ "n.CCCD , n.avatar , n.phoneNumber , t.accountId, t.mail, t.password) from Accounts t join t.user n WHERE t.mail = :mail")
	UserAccDto getUserAccountByMail(@Param("mail") String mail);
	
}
