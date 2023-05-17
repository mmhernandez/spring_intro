package com.coding.dojo.hellohuman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController
@Controller
public class HelloHumanController {
	
	@RequestMapping("/")
	public String helloFullName(@RequestParam(value="firstName", required=false) String firstName, @RequestParam(value="lastName", required=false) String lastName, @RequestParam(value="times", required=false) Integer num) {
		
		if(num != null && num > 0) {
			String output = "";
			for(int i=0; i<num; i++) {				
				if(firstName == null && lastName == null) {			
					output += "Hello Human ";
				} else if(firstName != null && lastName == null) {
					output += "Hello " + firstName + " ";
				} else if(firstName == null && lastName != null) {
					output += "Hello Mr/Mrs " + lastName + " ";
				} else {
					output += "Hello " + firstName + " " + lastName + " ";
				}
			}
			return output;
		}
		
		if(firstName == null && lastName == null) {			
			return "Hello Human";
		} else if(firstName != null && lastName == null) {
			return "Hello " + firstName;
		} else if(firstName == null && lastName != null) {
			return "Hello Mr/Mrs " + lastName;
		} 
		return "Hello " + firstName + " " + lastName;
	}
	
	@RequestMapping("/test") 
	public String test() {
		return "demo.jsp";
	}

}
