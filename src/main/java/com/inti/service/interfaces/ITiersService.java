package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Tiers;


public interface ITiersService{

	
	List<Tiers> findAll();

	Tiers findOne(Long id);

	Tiers save(Tiers user);

	void delete(Long id);
	
	
	// potentiellment ajouter un tri par date , amis a voir plus tard. 

}
