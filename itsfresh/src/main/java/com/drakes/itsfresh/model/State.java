package com.drakes.itsfresh.model;

import java.sql.Blob;
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
public class State {
	@Id
	private Integer stateNo;
	private Integer custId;
	private Date date;
	private Currency invoiceAmount;
	private Currency discount;
	private Date payDate;
	private Blob report;
	private String chequeNo;
	private Currency amount;
	private Integer sendStatus;
}

