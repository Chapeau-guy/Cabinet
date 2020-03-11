package com.inti.restConroller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Tiers;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.ITiersService;
import com.inti.service.interfaces.IUtilisateurService;


@RestController
public class TiersController {
	@Autowired				// on fais appelle au bon service . NB : Tiers c'était Utilisateur
	ITiersService userService;

	@RequestMapping(value = "users", method = RequestMethod.GET)
	public List<Tiers> findAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "users/{idTiers}", method = RequestMethod.GET)
	public Tiers findOne(@PathVariable("idTiers") Long id) {
		return userService.findOne(id);
	}

	@RequestMapping(value = "users", method = RequestMethod.POST)
	public Tiers saveTiers(@RequestBody Tiers user) {
		return userService.save(user);
	}

	@RequestMapping(value = "users/{idTiers}", method = RequestMethod.DELETE)
	public void deleteTiers(@PathVariable("idTiers") Long id) {
		userService.delete(id);
	}
	@RequestMapping(value = "users/{idTiers}", method = RequestMethod.PUT)
	public Tiers updateTiers(@PathVariable("idTiers") Long id, @RequestBody Tiers user) {
		Tiers currentTiers= userService.findOne(id);
		currentTiers.setAdresse(user.getAdresse());
		currentTiers.setTel(user.getTel());
		// comment on gere l'heritage dans ce cas ci. 
		return userService.save(currentTiers);
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
