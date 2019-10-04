package com.accenture.nuclear.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.accenture.nuclear.dao.IncidenciasRepo;

@Controller
public class SimuladorController {

	@Autowired
	IncidenciasRepo reportRepo;
	/*
	 * redirect to simulacion.html
	 */
	@RequestMapping(value = "/simulador")
	public String acceso(Model model) {

		return "simulacion";
	}
	
}
