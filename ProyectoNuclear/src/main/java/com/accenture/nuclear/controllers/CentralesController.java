package com.accenture.nuclear.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.accenture.nuclear.dao.CentralesRepo;
import com.accenture.nuclear.pojos.Central;

@Controller
public class CentralesController {

	@Autowired
	CentralesRepo nuclearPlantsRepo;
	/*
	 * Method that send to the user a list of all nuclear plants in database "nuclear".
	 */
	@RequestMapping(value = "/verCentrales")
	public String acceso(Model model) {
		
		//query at database nuclear
		Iterable<Central> result = this.nuclearPlantsRepo.findAll();
		
		// save attribute of the query
		model.addAttribute("centralesLista", result);
		
		return "centralesLista";
	}
	/*
	 * Method that send to the user a list of all nuclear plants in database "nuclear".
	 */
	@RequestMapping(value = "/verFichaCentral")
	public String verFicha(Model model,
			@RequestParam("id") Integer id
			) {
		
		//Integer idNumber = Integer.parseInt(id);
		//query at database nuclear
		Central result = this.nuclearPlantsRepo.findOne(id);
		
		// save attribute of the query
		model.addAttribute("nuclearPlant", result);
		
		return "fichaCentralNuclear";
	}
	
}
