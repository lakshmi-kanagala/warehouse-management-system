package com.drakes.itsfresh.model;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

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
public class Report {
	@Id
	private Integer id;
	private String name;
	private String description;
	private Blob report;
	private Timestamp changed;
	private String version;
	private Date LastUsed;
	private Integer used;
}
