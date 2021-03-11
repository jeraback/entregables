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
@RequestMapping("/italikaDelete")
public class DeleteController {

private ModelService modelService;
	
	@Autowired
	public DeleteController(ModelService modelService) {
		this.modelService = modelService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(
			Model model) {
		Italika moto = new Italika();
		model.addAttribute("moto",moto);
		return "deleteForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(
			@ModelAttribute("moto") Italika moto,
			BindingResult result, Model model) {
		    model.addAttribute("mensaje","producto eliminado correctamente");
		    modelService.delete(moto);
		    return "inicio";
		    }
}
