package com.automatic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="/auto")
public class Controller {
	@GetMapping(value="/automatic")
	public String getName() {
		return "OneSoft";
	}
	

}
