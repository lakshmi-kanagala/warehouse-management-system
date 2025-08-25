package com.drakes.itsfresh.model;

import java.sql.Timestamp;

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
public class UserHistory {	       
		  @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Integer id;
		  	private Timestamp loggedIn;
		  	private String installName;
		  	private String userId;
		  	private String userName;
		  	private Integer action;
		  	private Timestamp loggedOut;
}
