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
public class SupPayment {
	@Id
	private Integer id;
	private Integer supId;
	private Date date;
	private Currency amount;
	private Double discount;
	private Integer status;
}

