package com.drakes.itsfresh.model;

import java.io.Serializable;
import java.util.Objects;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StoreLineKey implements Serializable{
	private Customer storeId;
	private Produce prodNo;
	
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof StoreLineKey)) return false;
	        StoreLineKey that = (StoreLineKey) o;
	        return Objects.equals(storeId, that.storeId) &&
	               Objects.equals(prodNo, that.prodNo);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(storeId, prodNo);
	    }
}
