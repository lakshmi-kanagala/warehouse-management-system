package com.drakes.itsfresh.model;

import java.util.Currency;

import jakarta.persistence.Entity;
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
public class SupplierCosts {
	@Id
	private Integer supId;
	private Integer prodNo;
	private Currency cost;
}
