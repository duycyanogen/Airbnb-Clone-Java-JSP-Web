package WebApplication.AirBnb.domain;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;		
	private String name;
	private String address;
	private String sex;	
	private String dateOfBirth;
	private String CCCD;
	private String avatar;
	private String phoneNumber;
	
	@OneToOne
	@JoinColumn(name = "account_id")
	private Accounts account;
	
}
