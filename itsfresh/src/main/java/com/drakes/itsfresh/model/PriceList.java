package com.drakes.itsfresh.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Currency;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString	
@Table
public class PriceList {
	private Integer groupStore;
	private Integer gsid;
	private Integer normalSpecial;
	private Integer lineId;
	private Currency cost;
	private Currency rrp;
	private Date endDate;
	private Timestamp changed;
	private Date applyDate;
	private Integer id;
	private Currency buyInCost;
}