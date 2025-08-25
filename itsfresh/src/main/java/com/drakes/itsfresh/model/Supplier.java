package com.drakes.itsfresh.model;

import java.util.Currency;

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
public class Supplier {	       
		  @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Integer id;
		  private String supCode;
		    private String coName;
		    private String address1;
		    private String address2;
		    private String town;
		    private String state;
		    private Integer postcode;
		    private Integer phone;
		    private String fax;
		    private String contact; 
		    private Currency balance;
		    private Boolean active;
		    private Boolean payByAgent;
		    private Double discount;
		    private String email;
		    private String abn;
		    private Boolean orderByEmail;
		    private Boolean orderByPrint;
		    private Integer payGroup;
		    private Integer dispOrder;
		    private String ccMail;
		    private String accountMail;
		    private String landmarkCode;
		    private Integer doType;
		    private Integer doStoreFileType;
		    private Integer doSummaryFileType;
		    private Boolean prePackageOrder;
		    private Integer M3Code;
}
