package com.drakes.itsfresh.model;

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
public class OrderStock {
	@Id
	private Integer runId;
	@ManyToOne
	@JoinColumn(name="prod_no")
	private Produce prodNo;
	private Double stock;
	private Double desiredStock;
}