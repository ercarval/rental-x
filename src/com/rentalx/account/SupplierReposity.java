package com.rentalx.account;

import org.springframework.stereotype.Repository;

import com.rentalx.shared.repository.BaseRepository;

@Repository
public class SupplierReposity extends BaseRepository<Supplier,Long> {
	
	public SupplierReposity() {
		super(Supplier.class);
	}
	
}
