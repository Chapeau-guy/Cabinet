package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Phase;
import com.inti.repositories.PhaseRepository;
import com.inti.service.interfaces.IPhaseService;

@Service
public class PhaseService implements IPhaseService {
	@Autowired
	PhaseRepository phaseRepository;

	@Override
	public List<Phase> findAll() {
		return phaseRepository.findAll();
	}

	@Override
	public Phase findOne(Long id) {
		return phaseRepository.findOne(id);
	}

	@Override
	public Phase save(Phase user) {
		return phaseRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		phaseRepository.delete(id);
	}



}
