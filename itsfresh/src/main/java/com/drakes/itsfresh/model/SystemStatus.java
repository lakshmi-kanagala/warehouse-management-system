package com.drakes.itsfresh.model;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class SystemStatus {	       
		  @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Integer id;
		  	private Date date;
		  	private Integer mainStatus;
		  	private Integer secondPickStatus;
		  	private Integer topUpsStatus;
		  	private Integer stocktakeStatus;
		  	private Timestamp stockTakeDone;
		  	private Date orderDate;
		  	private String orderDue;
		    private LocalTime startTime;
		    private LocalTime cutOffNormal;
		    private LocalTime cutOffTopUp;
		    private Integer secondOrderOption;
		    private String note;
		    private Integer invoicesExported;
		    private Boolean incDirectOrders;
		    private Integer directLinesStatus;
		    private Integer directLinesExported;
		    private Blob settings;
}
