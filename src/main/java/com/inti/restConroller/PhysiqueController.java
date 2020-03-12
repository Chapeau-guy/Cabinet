package com.inti.restConroller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Physique;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IPhysiqueService;
import com.inti.service.interfaces.IUtilisateurService;


@RestController
public class PhysiqueController {
	@Autowired				// on fais appelle au bon service . NB : Physique c'était Utilisateur
	IPhysiqueService userService;

	@RequestMapping(value = "tiers", method = RequestMethod.GET)
	public List<Physique> findAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "tiers/{idPhysique}", method = RequestMethod.GET)
	public Physique findOne(@PathVariable("idPhysique") Long id) {
		return userService.findOne(id);
	}

	@RequestMapping(value = "tiers", method = RequestMethod.POST)
	public Physique savePhysique(@RequestBody Physique user) {
		return userService.save(user);
	}

	@RequestMapping(value = "tiers/{idPhysique}", method = RequestMethod.DELETE)
	public void deletePhysique(@PathVariable("idPhysique") Long id) {
		userService.delete(id);
	}
	@RequestMapping(value = "tiers/{idPhysique}", method = RequestMethod.PUT)
	public Physique updatePhysique(@PathVariable("idPhysique") Long id, @RequestBody Physique user) {
		Physique currentPhysique= userService.findOne(id);
		currentPhysique.setAdresse(user.getAdresse());
		currentPhysique.setTel(user.getTel());
		// comment on gere l'heritage dans ce cas ci. 
		return userService.save(currentPhysique);
	}
}
