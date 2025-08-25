package com.drakes.itsfresh.model;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
@Table
public class User {	       
		  @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Integer id;
		  	private String userName;
		  	private String password;
		  	private Boolean active;
		  	private String rights;
		  	private Blob settings;
		  	private String description;
		  	private Integer status;
		  	private Timestamp lastLogin;
		  	private Timestamp lastLogout;
}

