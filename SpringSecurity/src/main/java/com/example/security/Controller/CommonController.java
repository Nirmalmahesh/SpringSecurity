package com.example.security.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@GetMapping("/rest/home")
	public String home()
	{
		return "I am On Home";
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/rest/secured/home")
	public String securedHome()
	{
		return "I am On Secured Home";
	}
}
