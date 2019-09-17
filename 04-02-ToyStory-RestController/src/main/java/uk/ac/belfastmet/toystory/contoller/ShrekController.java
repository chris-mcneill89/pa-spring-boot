package uk.ac.belfastmet.toystory.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shrekmovie")

public class ShrekController {

	@GetMapping()
	public String home() {
		return "Shrek Home Page"; 
	}
	
	@GetMapping("/shrek")
	public String shrek() {
		return "Shrek was played by Mike Myers"; 
	}
	
	@GetMapping("/donkey")
	public String donkey() {
		return "Donkey was played by Eddie Murphy"; 
	}
	
	@GetMapping("/fiona")
	public String fiona() {
		return "Fiona was played by Cameron Diaz"; 
	}

}
