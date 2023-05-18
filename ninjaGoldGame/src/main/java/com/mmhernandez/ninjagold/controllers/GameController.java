package com.mmhernandez.ninjagold.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@PostMapping("/gold/{type}")
	public String calcGold(@PathVariable String type, Model model) {
		Random rand = new Random();
		int randNum = 0;
		ArrayList<String> activityLog = new ArrayList<String>();
		Date timestamp = new Date();
		String transaction = "earned";
		
		if(type.equals("farm")) {
			randNum = rand.nextInt(11) + 10;
			System.out.println("farm" + randNum);
			
		} else if(type.equals("cave")) {
			randNum = rand.nextInt(6) + 5;
			System.out.println("cave" + randNum);
			
		} else if(type.equals("house")) {
			randNum = rand.nextInt(4) + 2;
			System.out.println("house" + randNum);
			
		} else if(type.equals("quest")) {
			randNum = rand.nextInt(50);
			System.out.println("quest" + randNum);
			
		} else {
			randNum = 0;
		}
		
		String output = "You entered a " + type + " and " + transaction + " " + randNum + " gold. (" + timestamp + ")";
		activityLog.add(output);
		for(String each : activityLog) {
			System.out.println(each);
		}
		model.addAttribute("log", activityLog);
		
		return "redirect:/";
	}
}
