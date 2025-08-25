package com.drakes.itsfresh.model;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

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
public class StoreOrderHead {
	@Id
	private Integer id;
	private Integer storeId;
	private Date date;
	private String type;
	private Integer status;
	private Integer invoiceNo;
	private Blob notes;
	private Integer orderNo;
	private String contact;
	private String contactNo;
	private Timestamp changed;
	private Integer noLines;
	private Integer salesRepId;
	private Integer deptId;
	private Integer deviceId;
	private Date workingDate;
}

