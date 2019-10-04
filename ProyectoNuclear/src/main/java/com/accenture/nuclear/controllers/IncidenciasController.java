package com.accenture.nuclear.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.accenture.nuclear.dao.IncidenciasRepo;
import com.accenture.nuclear.pojos.Incidencia;
import com.accenture.nuclear.pojos.Usuarios;

@Controller
public class IncidenciasController {

	@Autowired
	IncidenciasRepo reportRepo;
	@Autowired
	HttpSession session;
	/*
	 * Method that send to the user a list of all reports in database "nuclear".
	 */
	@RequestMapping(value = "/verIncidencias")
	public String verIncidencias(Model model) {
		
		//query at database nuclear
		Iterable<Incidencia> result = this.reportRepo.findAll();
		
		// save attribute of the query
		model.addAttribute("reportList", result);
		
		return "incidenciasLista";
	}
	/**
	 * 
	 * @param id of the nuclear plant for create a new report
	 * @return an url redirecting to nuevaIncidencia.HTML
	 */
	@RequestMapping(value = "/nuevaIncidencia")
	public String nuevaIncidencia(Model model,
			@RequestParam("id") Integer id,
			@SessionAttribute("userConected") Usuarios user
			) {
		model.addAttribute("idNuclearPlant", id);
		model.addAttribute("userId", user.getId());
		return "nuevaIncidencia";
	}
	@RequestMapping(value = "/insertarIncidencia")
	public String insertarIncidencia(Model model,
			@RequestParam("nuclearPlantId") Integer nuclearPlantId,
			@RequestParam("userId") Integer idUser,
			@RequestParam("report") String report,
			@RequestParam("resolved") String resolved,
			HttpSession session
			) {
		boolean resolvedBoolean = false;
		if(resolved.equals("true")) 
		{
			resolvedBoolean = true;
		}
		// Creating new Incidencia
		Incidencia newReport = new Incidencia();
		// Setting up the report
		newReport.setId_central(nuclearPlantId);
		newReport.setId_usuario(idUser);
		newReport.setFecha("2017-01-01");
		newReport.setTexto(report);
		newReport.setResuelta(resolvedBoolean);
		this.reportRepo.save(newReport); // inserted on database nuclear
		return "menuPrincipal";
	}
	/**
	 * 
	 */
	@RequestMapping(value = "/borrarIncidencia")
	public String borrarIncidencia(Model model,
			@RequestParam("id") Integer idReport
			) {
		this.reportRepo.delete(idReport); // deleting the report by id on database nuclear
		return "menuPrincipal";
	}
	
}
