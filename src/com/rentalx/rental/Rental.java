package com.rentalx.rental;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.rentalx.account.Customer;
import com.rentalx.shared.domain.date.DateRange;
import com.rentalx.vehicle.Car;

@Entity
public class Rental {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Customer customer;
	
	@Embedded
	private DateRange period;
	
	
	
	@ManyToOne
	private Car car;
	
	
}
