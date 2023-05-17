package com.mmhernandez.fruityloops.controllers;
import com.mmhernandez.fruityloops.models.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

@Controller
public class FruityLoopsController {

	@RequestMapping("/")
	public String index(Model model) {
		ArrayList<FruityLoopsItem> item_list = new ArrayList<FruityLoopsItem>();
		
		item_list.add(new FruityLoopsItem("Kiwi", 1.5));
		item_list.add(new FruityLoopsItem("Mango", 2));
		item_list.add(new FruityLoopsItem("Banana", 0.75));
		item_list.add(new FruityLoopsItem("Strawberry", 3.5));
		
		model.addAttribute("fruits", item_list);
		return "index.jsp";
	}
}
