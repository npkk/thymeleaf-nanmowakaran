package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(Model model) {
        Dto dto = new Dto();
        dto.setF(false);
        dto.setG("hello");
		model.addAttribute("name", "world");
        model.addAttribute("Dto", dto);
		return "greeting";
	}

}