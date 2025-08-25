package com.drakes.itsfresh.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.drakes.itsfresh.model.Store;
import com.drakes.itsfresh.repository.StoreRepository;
import com.drakes.itsfresh.service.StoreService;

@Component
public class StoreServiceImpl implements StoreService{
	
	@Autowired
	@Qualifier("storeRepository")
	private StoreRepository storeRepo;
	
	public Store getStore(Long storeId) {
		return storeRepo.findById(storeId).orElse(null);
	}

	@Override
	public List<Store> getStores() {
		return storeRepo.findAll();
	}

	@Override
	public Store createStore(Store store) {	
		return storeRepo.save(store);
	}

	@Override
	public List<Store> createStores(List<Store> stores) {
		return storeRepo.saveAll(stores);
	}

	@Override
	public Store updateStore(Store store) {
		return storeRepo.save(store);
	}

	@Override
	public boolean deleteStore(Long id) {
		Boolean existed = storeRepo.existsById(id);
		if(existed)
			storeRepo.deleteById(id);
		return existed;
	}
}
