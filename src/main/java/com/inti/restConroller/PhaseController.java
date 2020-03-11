package com.inti.restConroller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Phase;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IPhaseService;
import com.inti.service.interfaces.IUtilisateurService;


@RestController
public class PhaseController {
	@Autowired				// on fais appelle au bon service . NB : Phase c'était Utilisateur
	IPhaseService userService;

	@RequestMapping(value = "users", method = RequestMethod.GET)
	public List<Phase> findAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "users/{idPhase}", method = RequestMethod.GET)
	public Phase findOne(@PathVariable("idPhase") Long id) {
		return userService.findOne(id);
	}

	@RequestMapping(value = "users", method = RequestMethod.POST)
	public Phase savePhase(@RequestBody Phase user) {
		return userService.save(user);
	}

	@RequestMapping(value = "users/{idPhase}", method = RequestMethod.DELETE)
	public void deletePhase(@PathVariable("idPhase") Long id) {
		userService.delete(id);
	}
	@RequestMapping(value = "users/{idPhase}", method = RequestMethod.PUT)
	public Phase updatePhase(@PathVariable("idPhase") Long id, @RequestBody Phase user) {
		Phase currentPhase= userService.findOne(id);
		currentPhase.setNomPhase(user.getNomPhase());
		currentPhase.setPrenomPhase(user.getPrenomPhase());
		currentPhase.setUsername(user.getUsername());
		currentPhase.setPassword(user.getPassword());
		currentPhase.setDateNaissance(user.getDateNaissance());
		currentPhase.setEmail(user.getEmail());
		currentPhase.setImage(user.getImage());
		currentPhase.setRoles(user.getRoles());
		return userService.save(currentPhase);
	}
	
	// partie pour le login
	@RestController
	@RequestMapping(value = "/login")
	public class LoginConroller {
		@Autowired
		IUtilisateurService utilisateurService;
		
		public Utilisateur login(Principal principal) {
			return utilisateurService.findOneByUsername(principal.getName());
		}
	}
}
