package com.drakes.itsfresh.model;

import java.sql.Date;
import java.util.Currency;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Table
@Entity
public class SupInvoice {
	@Id
    private Integer id;
	@ManyToOne
	@JoinColumn(name="sup_id", referencedColumnName = "id")
    private Supplier supId;
    private Date dateInvoice;
    private String invoice;
    private Currency amount;
    private Currency gstInc;
    private Double gstRate;
    private String notes;
    private Boolean payIt;
    private Date datePaid;
    private String cheque;
    private Integer status;
    private Integer type;
    private Integer paymentId;
    private Integer linked;
    private Currency levy;
    private Integer creditBookNo;
    private String priorInvoice;
    private Integer orderNumber;
    
}