package com.drakes.itsfresh.model;

import java.sql.Date;
import java.sql.Timestamp;
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
public class StockTakes {
	@Id
	private Integer id;
	private Date date;
	private String description;
	private Timestamp updated;
	private Currency Value;
	private Integer status;
	private Integer olTake1UserId;
	private Integer olTake2UserId;
	private Integer olTake1Entries;
	private Integer olTake2Entries;
}

