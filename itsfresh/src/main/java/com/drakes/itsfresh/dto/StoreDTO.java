package com.drakes.itsfresh.dto;

public class StoreDTO {

	private final String storeName;
	private final Long storeId;
	public StoreDTO(Long storeId,String storeName) {
		super();
		this.storeName = storeName;
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public Long getStoreId() {
		return storeId;
	}

}
