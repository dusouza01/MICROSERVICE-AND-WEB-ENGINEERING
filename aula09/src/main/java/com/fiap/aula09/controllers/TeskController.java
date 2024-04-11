package com.fiap.aula09.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeskController {
	
	@GetMapping("/todo/list")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		String nomeUsuario = "José Romualdo";
		model.addObject("nome", nomeUsuario);
		return model;
		
		
		
	}

}
