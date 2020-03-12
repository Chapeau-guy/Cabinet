package com.inti.restConroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Physique;
import com.inti.service.interfaces.IPhysiqueService;


@RestController
public class PhysiqueController {
	@Autowired				// on fais appelle au bon service . NB : Physique c'était Utilisateur
	IPhysiqueService physiqueService;

	@RequestMapping(value = "tiers", method = RequestMethod.GET)
	public List<Physique> findAll() {
		return physiqueService.findAll();
	}

	@RequestMapping(value = "tiers/{idTiers}", method = RequestMethod.GET)
	public Physique findOne(@PathVariable("idTiers") Long id) {
		return physiqueService.findOne(id);
	}

	@RequestMapping(value = "tiers", method = RequestMethod.POST)
	public Physique savePhysique(@RequestBody Physique user) {
		return physiqueService.save(user);
	}

	@RequestMapping(value = "tiers/{idTiers}", method = RequestMethod.DELETE)
	public void deletePhysique(@PathVariable("idTiers") Long id) {
		physiqueService.delete(id);
	}
	@RequestMapping(value = "tiers/{idTiers}", method = RequestMethod.PUT)
	public Physique updatePhysique(@PathVariable("idTiers") Long id, @RequestBody Physique physique) {
		Physique currentPhysique= physiqueService.findOne(id);
		currentPhysique.setAdresse(physique.getAdresse());
		currentPhysique.setTel(physique.getTel());
		currentPhysique.setNom(physique.getNom());
		currentPhysique.setPrenom(physique.getPrenom());
		currentPhysique.setNumIdentité(physique.getNumIdentité());
		// comment on gere l'heritage dans ce cas ci. 
		return physiqueService.save(currentPhysique);
	}
}
