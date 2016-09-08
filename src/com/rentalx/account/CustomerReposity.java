package com.rentalx.account;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentalx.shared.repository.BaseRepository;

@Repository
public class CustomerReposity extends BaseRepository<Customer,Long>  {

	public CustomerReposity() {
		super(Customer.class);
	}
	
}
