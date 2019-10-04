package com.accenture.nuclear.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	/*
	 * login redirect
	 */
	@RequestMapping(value = "/")
	public String inicio() {
		
		return "inicio";
	}
}
