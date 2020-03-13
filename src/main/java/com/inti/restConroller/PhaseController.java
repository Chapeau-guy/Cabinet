package com.inti.restConroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Phase;
import com.inti.service.interfaces.IPhaseService;


@RestController
public class PhaseController {
	@Autowired				// on fais appelle au bon service . NB : Phase c'était Utilisateur
	IPhaseService userService;

	@RequestMapping(value = "phase", method = RequestMethod.GET)
	public List<Phase> findAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "phase/{idPhase}", method = RequestMethod.GET)
	public Phase findOne(@PathVariable("idPhase") Long id) {
		return userService.findOne(id);
	}

	@RequestMapping(value = "phase", method = RequestMethod.POST)
	public Phase savePhase(@RequestBody Phase user) {
		return userService.save(user);
	}

	@RequestMapping(value = "phase/{idPhase}", method = RequestMethod.DELETE)
	public void deletePhase(@PathVariable("idPhase") Long id) {
		userService.delete(id);
	}
	@RequestMapping(value = "phase/{idPhase}", method = RequestMethod.PUT)
	public Phase updatePhase(@PathVariable("idPhase") Long id, @RequestBody Phase user) {
		Phase currentPhase= userService.findOne(id);
		currentPhase.setNomPhase(user.getNomPhase());
		return userService.save(currentPhase);
	}
}
