package com.drakes.itsfresh.model;

import java.sql.Date;

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
public class  PickList{
	@Id
	private Integer Id;
	private Date date;
	private Integer status;
	private String description;
	private String type;
}