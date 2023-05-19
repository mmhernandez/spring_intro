package com.mmhernandez.ninjagold.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class GameController {

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@PostMapping("/gold/{type}")
	public String calcGold(@PathVariable String type, Model model, HttpSession session) {
		int gold = 0;
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", gold);
		} else {
			gold = (int) session.getAttribute("gold");
		}
		
		
		Random rand = new Random();
		int randNum = 0;
		ArrayList<String> activityLog = new ArrayList<String>();
		Date timestamp = new Date();
		String transaction = "earned";
		
		if(type.equals("farm")) {
			randNum = rand.nextInt(11) + 10;
			
		} else if(type.equals("cave")) {
			randNum = rand.nextInt(6) + 5;
			
		} else if(type.equals("house")) {
			randNum = rand.nextInt(4) + 2;
			
		} else if(type.equals("quest")) {
			randNum = rand.nextInt(50);
			int randFlip = rand.nextInt(2);
			if(randFlip == 0) {
				transaction = "lost";
			}
		} else if (type.equals("spa")) {
			randNum = rand.nextInt(16)+ 5;
			transaction = "lost";
		} else {
			randNum = 0;
		}
		
		String output = "You entered a " + type + " and " + transaction + " " + randNum + " gold. (" + timestamp + ")";
		
		activityLog.add(output);
		
		if(session.getAttribute("activity") == null) {
			session.setAttribute("activity", activityLog);
		} else {
			ArrayList<String> log = new ArrayList<String>();
			log = (ArrayList<String>) session.getAttribute("activity");
			log.add(output);
			session.setAttribute("activity", log);
		}
		
		if(transaction == "lost") {
			gold -= randNum;
		} else {			
			gold += randNum;
		}
		
		session.setAttribute("gold", gold);
		
		model.addAttribute("log", session.getAttribute("activity"));
		model.addAttribute("gold", gold);
		
		return "redirect:/";
	}
	
	@RequestMapping("/reset") 
	public String reset(HttpSession session) {
		session.removeAttribute("gold");
		session.removeAttribute("activity");
		return "redirect:/";
	}
}
