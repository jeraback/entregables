package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.ModelService;

@Controller
@RequestMapping("/")
public class WelcomeController { 
	
private ModelService modelService;
	
	@Autowired
	public WelcomeController(ModelService modelService) {
		this.modelService = modelService;
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(
			Model model) {

		return "inicio";
	}

}
