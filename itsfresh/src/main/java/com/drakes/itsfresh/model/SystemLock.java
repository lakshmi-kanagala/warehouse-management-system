package com.drakes.itsfresh.model;

import java.sql.Blob;
import java.sql.Date;
import java.util.Currency;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Table
@Entity
public class SystemLock {
	@Id
	@GeneratedValue(generator = "uuid2")
    private UUID id;
    private String installName;
    private boolean market;
    private boolean lockedOut;
    private Date lockedOutAt;
    private String lockedOutBy;
    private Date lastUpdate;
    private Date lastEdit;
    private String dataVersion;
    private Date remoteChangeStart;
    private Double timeDifference;
    private Date backup;
    private Long numberLoggedIn;
    private Date lastPriceChange;
    private String title;
    private String subTitle;
    private Date startDate;
    private Date endDate;
    private Currency ammount1;
    private Currency ammount2;
    private Integer No1Active;
    private Integer No2Ordered;
    private Integer No3Specials;
    private Blob settings;
    private boolean multiUser;
    private Date lastProduceChange;
    private Date lastStoreOrderChange;
    private Integer dataSetType;
    private Date lastestUpdateToHO;

}
