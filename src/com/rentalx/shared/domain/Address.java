package com.rentalx.shared.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Embeddable
@Data
public class Address implements Serializable {


	@Size(max = 100)
	@Column(name = "ADDRESS_NAME", nullable = true, length = 100)
	private String name;

	@Size(max = 100)
	@NotNull
	@Column(nullable = true, length = 100)
	private String address;

	@Size(max = 80)
	@NotNull
	@Column(nullable = true, length = 80)
	private String country;

	@Size(max = 50)
	@Column(nullable = true, length = 50)
	private String region;

	@Size(max = 35)
	@NotNull
	@Column(nullable = true, length = 35)
	private String city;

	@Size(max = 10)
	@NotNull
	@Column(nullable = true, length = 10)
	private String zipCode;

	@Size(max = 3)
	@NotNull
	@Column(nullable = true, length = 3)
	private String stateProvince;

	@Size(max = 30)
	@Column(length = 30)
	private String phone;

	
}
