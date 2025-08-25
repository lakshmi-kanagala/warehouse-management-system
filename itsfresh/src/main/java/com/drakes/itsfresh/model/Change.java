package com.drakes.itsfresh.model;

import java.sql.Blob;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table
public class Change {
	private String tableName;
	private Integer Id1;
	private Integer Id2;
	private Integer Id3;
	private Integer changeType;
	private Timestamp changed;
	private String userId;
	private Blob recordData;
}
