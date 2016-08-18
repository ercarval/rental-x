package com.rentax.rental;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.rentax.account.Customer;
import com.rentax.shared.domain.date.DateRange;

@Entity
public class Rental {

	@ManyToOne
	private Customer customer;
	
	@Embedded
	private DateRange period;
	
	
	
	
}
