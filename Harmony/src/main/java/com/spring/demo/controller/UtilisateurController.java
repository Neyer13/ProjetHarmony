package com.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Utilisateur;
import com.spring.demo.repository.UtilisateurRepository;

@RestController
public class UtilisateurController {

	@Autowired
	private UtilisateurRepository utiliRepository;

	@PostMapping("/addUtilisateur")
	public String saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		utiliRepository.save(utilisateur);
		return "Un Utilisateur avec l'Id : "+utilisateur.getId()+" a etait cree.";
	}
}
