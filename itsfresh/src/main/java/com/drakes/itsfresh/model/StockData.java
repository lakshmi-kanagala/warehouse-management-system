package com.drakes.itsfresh.model;

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
public class StockData {
	@Id
	private Integer id;
	private Integer prodNo;
	private Integer quantity;
	private Currency buyIncost;
	private Integer adjust;
}
