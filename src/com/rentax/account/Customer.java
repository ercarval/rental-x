package com.rentax.account;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CUSTOMER")
public class Customer extends Account {

	private String creditCard;
	
	
}
