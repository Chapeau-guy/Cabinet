package com.inti.restConroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Tache;
import com.inti.service.interfaces.ITacheService;

@RestController
public class TacheController {
	@Autowired				// on fais appelle au bon service . NB : Tache c'était Utilisateur
	ITacheService tacheService;

	@RequestMapping(value = "taches", method = RequestMethod.GET)
	public List<Tache> findAll() {
		return tacheService.findAll();
	}

	@RequestMapping(value = "taches/{idTache}", method = RequestMethod.GET)
	public Tache findOne(@PathVariable("idTache") Long id) {
		return tacheService.findOne(id);
	}

	@RequestMapping(value = "taches", method = RequestMethod.POST)
	public Tache saveTache(@RequestBody Tache tache) {
		return tacheService.save(tache);
	}

	@RequestMapping(value = "taches/{idTache}", method = RequestMethod.DELETE)
	public void deleteTache(@PathVariable("idTache") Long id) {
		tacheService.delete(id);
	}
	@RequestMapping(value = "taches/{idTache}", method = RequestMethod.PUT)
	public Tache updateTache(@PathVariable("idTache") Long id, @RequestBody Tache tache) {
		Tache currentTache= tacheService.findOne(id);
		currentTache.setTitre(tache.getTitre());
		currentTache.setDateDebut(tache.getDateDebut());
		currentTache.setDateDebut(tache.getDateFin());		
		currentTache.setDescription(tache.getDescription());
		currentTache.setStatutAudience(tache.isStatutAudience());;
		return tacheService.save(currentTache);
	}
}
