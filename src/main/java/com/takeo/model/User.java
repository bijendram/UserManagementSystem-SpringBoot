package com.takeo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USER_DETAILS")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="UID")
	private int uid;
	
	@Column(name="FNAME")
	private String firstName;
	
	@Column(name="LNAME")
	private String lastName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="MOBILENUMBER")
	private String mobileNumber;
	
	@Column(name="UNAME")
	private String userName;
	
	@Column(name="PASS")
	private String passWord;

}
