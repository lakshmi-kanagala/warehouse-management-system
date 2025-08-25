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
public class StoreOrderLine {
	@Id
	private Integer id;
	private Integer prodNo;
	private Integer qty;
	private Integer status;
	private Integer newQty;
	private Integer newProdNo;
	private Integer dispOrder;
	private Currency specPrice;
	private Currency newSpecPrice;
	private Integer stock;
}
