package com.coding.dojo.daikichipath;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiPathController {

	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable(value="city") String city) {
		char capFirstLetter = Character.toUpperCase(city.charAt(0));
		String capitalizedCity = city.replace(city.charAt(0), capFirstLetter);
		
		return "Congratulations! You will soon travel to " + capitalizedCity + "!";
	}
	
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable(value="num") Integer num) {
		if(num % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		} else if(num % 2 > 0) {			
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		} else return "";
	}
}
