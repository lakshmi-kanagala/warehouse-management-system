package com.drakes.itsfresh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.drakes.itsfresh.model.Store;

@Service
public interface StoreService {

	public Store getStore(Long storeId);

	public List<Store> getStores();

	public Store createStore(Store store);

	public List<Store> createStores(List<Store> stores);

	public Store updateStore(Store store);

	public boolean deleteStore(Long id);
	
}
