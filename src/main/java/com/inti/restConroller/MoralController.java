package com.inti.restConroller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Moral;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IMoralService;
import com.inti.service.interfaces.IUtilisateurService;


@RestController
public class MoralController {
	@Autowired				// on fais appelle au bon service . NB : Moral c'était Utilisateur
	IMoralService moralService;

	@RequestMapping(value = "moral", method = RequestMethod.GET)
	public List<Moral> findAll() {
		return moralService.findAll();
	}

	@RequestMapping(value = "moral/{idMoral}", method = RequestMethod.GET)
	public Moral findOne(@PathVariable("idMoral") Long id) {
		return moralService.findOne(id);
	}

	@RequestMapping(value = "moral", method = RequestMethod.POST)
	public Moral saveMoral(@RequestBody Moral user) {
		return moralService.save(user);
	}

	@RequestMapping(value = "moral/{idMoral}", method = RequestMethod.DELETE)
	public void deleteMoral(@PathVariable("idMoral") Long id) {
		moralService.delete(id);
	}
	@RequestMapping(value = "moral/{idMoral}", method = RequestMethod.PUT)
	public Moral updateMoral(@PathVariable("idMoral") Long id, @RequestBody Moral moral) {
		Moral currentMoral= moralService.findOne(id);
		currentMoral.setAdresse(moral.getAdresse());
		currentMoral.setTel(moral.getTel());
		currentMoral.setRaisonSociale(moral.getRaisonSociale()); 
		return moralService.save(currentMoral);
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
