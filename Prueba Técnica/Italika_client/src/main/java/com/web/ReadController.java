package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.ModelService;
import com.service.Italika;

@Controller
@RequestMapping("/italikaSearch")
public class ReadController {
	
private ModelService modelService;
	
	@Autowired
	public ReadController(ModelService modelService) {
		this.modelService = modelService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(
			Model model) {
		Italika moto = new Italika();
		model.addAttribute("moto",moto);

		return "searchForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(
			@ModelAttribute("moto") Italika moto,
			BindingResult result, Model model) {
		    
		    moto = modelService.read(moto);
			System.out.println(moto.getModelo());

		    model.addAttribute("moto",moto);
		    return "searchForm";
		    }
}
