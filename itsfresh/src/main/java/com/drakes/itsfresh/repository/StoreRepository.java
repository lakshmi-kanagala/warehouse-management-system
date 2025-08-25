package com.drakes.itsfresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drakes.itsfresh.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>{

	//public StoreDTO getStore(int storeId);

	//public List<StoreDTO> getStores();
	
}
