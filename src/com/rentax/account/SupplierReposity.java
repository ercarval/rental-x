package com.rentax.account;

import org.springframework.stereotype.Repository;

import com.rentax.shared.repository.BaseRepository;

@Repository
public class SupplierReposity extends BaseRepository<Supplier,Long> {
	
	public SupplierReposity() {
		super(Supplier.class);
	}
	
}
