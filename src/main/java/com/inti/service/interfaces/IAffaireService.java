package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Affaire;


public interface IAffaireService{

	
	List<Affaire> findAll();

	Affaire findOne(Long id);

	Affaire save(Affaire user);

	void delete(Long id);
	
	
	// potentiellment ajouter un tri par date , amis a voir plus tard. 

}
