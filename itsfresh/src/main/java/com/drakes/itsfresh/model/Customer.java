package com.drakes.itsfresh.model;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "cust_code"))
public class Customer {

	//		@EmbeddedId
	//		private CustomerKey custKey;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="cust_code", nullable = false)
	private String custCode;
	@Column(nullable = false)
	private String coName;
	private String address1;
	private String address2;
	private String town;
	private String postcode;
	private String phone;
	private String fax;
	private String mobile;
	private String contact; 
	private Double discount;
	private Boolean warnPage;
	@Column(length = 11, nullable =false)
	private String ABN;
	private Date lastInvDt;
	private Date lastGpSpec;
	private Date lastInSpec;
	private Timestamp changed;
	private Boolean active;
	@ManyToOne
	@JoinColumn(name = "bus_id", nullable = false)
	private Code BusId;
	@ManyToOne
	@JoinColumn(name = "group_id", nullable = false)
	private Code groupId;
	private String email;
	private String externalRef;
	private Integer salesRepId;
	@Column(nullable = false)
	private Integer zoneId;
	private Blob extraData;
	private String M3Code;
	@Column(nullable = false)
	private String state;
}
