package com.drakes.itsfresh.model;

import java.util.Currency;

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
@Table
@Entity
public class OrderDetail {
	@Id
	private Integer id;
	@ManyToOne
	@JoinColumn(name="prod_no")
	private Produce prodNo;
	private Integer ordered;
	private Integer which;
	private Currency cost;
	private Boolean active;
	@ManyToOne
	@JoinColumn(name="sup_invoice_id", referencedColumnName = "id")
	private SupInvoice supInvoiceId;
	private Integer delivered;
	private Integer orderNumber;
	private Float GSTRate;
	private Integer originalOrdered;
}
