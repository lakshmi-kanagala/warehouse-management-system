package com.drakes.itsfresh.model;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
public class OrderRun {
	@Id
	@GeneratedValue
	private Integer id;
	private Date invDate;
	private Integer orderStatus;
	private Timestamp picked;
	private String type;
	private Timestamp deliveryRequired;
	private Blob note;
	private Timestamp updated;
	private Blob premiumNote;
	private String premiumEtc;
}
