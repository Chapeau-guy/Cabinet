package com.inti.restConroller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Affaire;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IAffaireService;
import com.inti.service.interfaces.IUtilisateurService;


@RestController
public class AffaireController {
	@Autowired				// on fais appelle au bon service . NB : Affaire c'était Utilisateur
	IAffaireService userService;

	@RequestMapping(value = "affaire", method = RequestMethod.GET)
	public List<Affaire> findAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "affaire/{idAffaire}", method = RequestMethod.GET)
	public Affaire findOne(@PathVariable("idAffaire") Long id) {
		return userService.findOne(id);
	}

	@RequestMapping(value = "affaire", method = RequestMethod.POST)
	public Affaire saveAffaire(@RequestBody Affaire user) {
		return userService.save(user);
	}

	@RequestMapping(value = "affaire/{idAffaire}", method = RequestMethod.DELETE)
	public void deleteAffaire(@PathVariable("idAffaire") Long id) {
		userService.delete(id);
	}
	@RequestMapping(value = "affaire/{idAffaire}", method = RequestMethod.PUT)
	public Affaire updateAffaire(@PathVariable("idAffaire") Long id, @RequestBody Affaire user) {
		Affaire currentAffaire= userService.findOne(id);
		currentAffaire.setReference(user.getReference());
		currentAffaire.setTitre(user.getTitre());
		currentAffaire.setDescription(user.getDescription());
		currentAffaire.setStatut(user.getStatut());
		return userService.save(currentAffaire);
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
