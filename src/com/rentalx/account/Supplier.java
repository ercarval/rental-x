package com.rentalx.account;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="SUPPLIER")
public class Supplier extends Account {

		
	
}
