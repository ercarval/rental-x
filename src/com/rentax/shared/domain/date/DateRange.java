package com.rentax.shared.domain.date;

import java.util.Date;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class DateRange {

	private Date startDate;
	private Date endDate;
	
}
