package com.drakes.itsfresh.model;

import java.sql.Blob;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table
public class OrderTemplate {
	@Id
	private Integer orderNumber;
	@ManyToOne
	@JoinColumn(name="supplier_id")
	private Supplier supplierId;
	private String title;
	private Blob notes;
	private Boolean active;
	private Date updated;
	private Date LastUsed;
	private String code;
}
