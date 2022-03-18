package example.smallest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@GetMapping(value ="/hola")
	public @ResponseBody String helloWorld() {
		
		//Flux
		
		
		
		
		return "Hello FUCKING World!!!"; //"application/json" mean this is a text not a redirect
	}
}
