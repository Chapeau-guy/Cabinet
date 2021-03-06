package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Moral;
import com.inti.repositories.MoralRepository;
import com.inti.service.interfaces.IMoralService;

@Service
public class MoralService implements IMoralService {
	@Autowired
	MoralRepository moralRepository;

	@Override
	public List<Moral> findAll() {
		return moralRepository.findAll();
	}

	@Override
	public Moral findOne(Long id) {
		return moralRepository.findOne(id);
	}

	@Override
	public Moral save(Moral user) {
		return moralRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		moralRepository.delete(id);
	}



}
