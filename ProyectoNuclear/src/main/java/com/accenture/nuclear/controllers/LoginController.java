package com.accenture.nuclear.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.accenture.nuclear.dao.UsuariosRepo;
import com.accenture.nuclear.pojos.Usuarios;

@Controller
public class LoginController {

	@Autowired
	UsuariosRepo usersRepo;
	/*
	 * Method that check if the values of email and password are correct. if it´s the user enter in menuPrincipal
	 * Getting the parametters of the html over the post method in the parameters of the method
	 */
	@RequestMapping(value = "menuPrincipal", method = RequestMethod.POST)
	public String acceso(Model model,
			
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			HttpSession session
			) {
		String endURL = "inicio";
		
		//query at database nuclear
		Usuarios result = this.usersRepo.findByCorreo(email);
		System.out.println(result);
		// Checking the results
		if(result != null) {
			if(result.getClave().equals(password)) {
				endURL = "menuPrincipal"; // data is correct
				session.setAttribute("userConected", result); // sending the user data to the session, for future access.
			} else {
				endURL = "inicio"; //incorrect password
				model.addAttribute("errorPassword", true);
			}
		} else {
			endURL = "inicio"; // incorrect Email
			model.addAttribute("errorEmail", true);
		}
		
		return endURL;
	}
	
	/*
	 * redirect to cerrarSesion.html
	 */
	@RequestMapping(value = "/cerrarSesion")
	public String acceso(Model model, HttpSession session) {
		session.invalidate(); // closing the user session
		return "cerrarSesion";
	}

}
