package com.drakes.itsfresh.model;

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
public class GroupLine {
	
	private Integer groupId;
	@Id
	private Integer prodNo;
	private Boolean active;

}
