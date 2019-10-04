package com.accenture.nuclear.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accenture.nuclear.pojos.Usuarios;

@Controller
public class UsuariosController {

	/*
	 * redirect to usuariosConectados.html
	 */
	@RequestMapping(value = "/usuariosConectados")
	public String acceso(Model model, HttpSession session) {
		Usuarios user = (Usuarios) session.getAttribute("userConected"); // getting the session of the user.
		model.addAttribute("user", user);
		return "usuariosConectados";
	}

}
