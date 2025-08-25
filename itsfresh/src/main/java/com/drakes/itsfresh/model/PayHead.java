package com.drakes.itsfresh.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table
public class PayHead {
	@Id
	private Integer Id;
	private Date date;
	private Integer payGroup;
	private Date payUpTo;
	private String descrip;
	private Integer status;
}

