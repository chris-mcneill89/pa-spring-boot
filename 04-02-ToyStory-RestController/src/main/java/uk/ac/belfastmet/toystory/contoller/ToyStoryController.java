package uk.ac.belfastmet.toystory.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toystory")
public class ToyStoryController {
	
	@GetMapping()
	public String home() {
		return "Toy Story Home Page";
	}
	
	@GetMapping("/woody")
	public String woody() {
		return "Woody was played by Tom Hanks";
	}
	@GetMapping("/buzz")
	public String buzz() {
		return "Buzz was played by Tim Allen";
	}
	
	@GetMapping("/mrpotato")
	public String mrPotato() {
		return "Mr Potato Head was played by Don Rickles";
	}
	
	@GetMapping("/mrspotato")
	public String mrsPotato() {
		return "Mrs Potato Head was played by Estelle Harris";
	}
	
	@GetMapping("/rex")
	public String rex() {
		return "Rex was played by Wallace Shawn";
	}
	
	@GetMapping("/slinky")
	public String slinky() {
		return "Slinky was played by Jim Varney";
	}

}
