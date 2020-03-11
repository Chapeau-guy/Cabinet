package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Ref;

public interface IRefService {
	List<Ref> findAll();

	Ref findOne(Long id);

	Ref save(Ref user);

	void delete(Long id);
	
	Ref findOneByUsername(String username);

}
