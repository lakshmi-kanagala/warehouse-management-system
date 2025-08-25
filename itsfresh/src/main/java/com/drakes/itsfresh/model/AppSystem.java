package com.drakes.itsfresh.model;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

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
public class AppSystem {	       
		  @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Integer id;
		  	private String busName;
		    private String appName;
		    private String acn;
		    private String address1;
		    private String address2;
		    private String phones;
		    private Boolean backup;
		    private String floppy;
		    private String abn;
		    private Double gstRate;
		    private String password;
		    private Integer invNo;
		    private Integer stateNo;
		    private Integer codeId;
		    private Integer priceListID;
		    private Integer produceId;
		    private Integer customerId;
		    private Integer supplierId;
		    private Integer stockTakeId;
		    private Integer reportId;
		    private Integer paymentId;
		    private Integer profitId;
		    private Date workingDate;
		    private Timestamp changed;
		    private Timestamp updateTime; 
		    private Integer lookBackPeriod;
		    private Integer keepPricesPeriod;
		    private String email;
		    private String ftpHost;
		    private String ftpUserName;
		    private String ftpPAssword;
		    private String ftpExeDir;
		    private String ftpDataDir;
		    private Timestamp backupDateTime; 
		    private Blob settings;
		    private Date lastPickList;
		    private Timestamp lastPriceChange;
}
