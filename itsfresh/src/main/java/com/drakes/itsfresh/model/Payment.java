package com.drakes.itsfresh.model;

import java.sql.Date;
import java.util.Currency;

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
public class  Payment{
	@Id
	private Integer Id;
	private Integer supId;
	private Date date;
	private Currency nettDue;
	private String cheque;
	private Double discount;
	private Integer payHeadId;
	private Integer status;
	private Currency invoiceTotal;
	private Currency GstIncTotal;
	private Currency levy;
}

