package uk.ac.belfastmet.toystory.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/movies")
	public String movies() {
		return "This is a list of movies";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "Contact Page";
	}
	
	@GetMapping("/about")
	public String about() {
		return "About Us Page";
	}
	
}
