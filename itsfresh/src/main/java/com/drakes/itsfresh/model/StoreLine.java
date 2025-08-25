package com.drakes.itsfresh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@IdClass(StoreLineKey.class)
@Table(name = "store_line",uniqueConstraints = @UniqueConstraint(columnNames = {"store_id", "prod_no"}))
public class StoreLine {
//	@EmbeddedId
//	private StoreLineKey storeLineKey;
	 	@Id
	  	@ManyToOne
	    @JoinColumn(name = "store_id", referencedColumnName = "id", nullable = false)
	    private Customer storeId;

	    @Id
	    @ManyToOne
	    @JoinColumn(name = "prod_no", referencedColumnName = "prod_no", nullable = false)
	    private Produce prodNo;
	private Integer selectOrBlock;
}

