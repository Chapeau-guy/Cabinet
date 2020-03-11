package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.Tribunal;
import com.inti.repositories.TribunalRepository;
import com.inti.service.interfaces.ITribunalService;

public class TribunalService implements ITribunalService{
	@Autowired
	TribunalRepository tribunalRepository;

	@Override
	public List<Tribunal> findAll() {
		return tribunalRepository.findAll();
	}

	@Override
	public Tribunal findOne(Long id) {
		return tribunalRepository.findOne(id);
	}

	@Override
	public Tribunal save(Tribunal user) {
		return tribunalRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		tribunalRepository.delete(id);
	}

}
