package com.rentalx.rental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/rental")
public class RentalController {

	@RequestMapping(path="/")
	public String home () {
		return "home";
	}
	
}
