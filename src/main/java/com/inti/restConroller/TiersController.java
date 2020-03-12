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
	ITiersService tierService;

	@RequestMapping(value = "tiers", method = RequestMethod.GET)
	public List<Tiers> findAll() {
		return tierService.findAll();
	}

	@RequestMapping(value = "tiers/{idTiers}", method = RequestMethod.GET)
	public Tiers findOne(@PathVariable("idTiers") Long id) {
		return tierService.findOne(id);
	}

	@RequestMapping(value = "tiers", method = RequestMethod.POST)
	public Tiers saveTiers(@RequestBody Tiers tier) {
		return tierService.save(tier);
	}

	@RequestMapping(value = "tiers/{idTiers}", method = RequestMethod.DELETE)
	public void deleteTiers(@PathVariable("idTiers") Long id) {
		tierService.delete(id);
	}
	@RequestMapping(value = "tiers/{idTiers}", method = RequestMethod.PUT)
	public Tiers updateTiers(@PathVariable("idTiers") Long id, @RequestBody Tiers tier) {
		Tiers currentTiers= tierService.findOne(id);
		currentTiers.setAdresse(tier.getAdresse());
		currentTiers.setTel(tier.getTel());
		// comment on gere l'heritage dans ce cas ci. 
		return tierService.save(currentTiers);
	}
}
