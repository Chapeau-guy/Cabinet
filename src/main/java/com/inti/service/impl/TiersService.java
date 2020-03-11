package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Tiers;
import com.inti.repositories.TiersRepository;
import com.inti.service.interfaces.ITiersService;

@Service
public class TiersService implements ITiersService {
	@Autowired
	TiersRepository tiersRepository;

	@Override
	public List<Tiers> findAll() {
		return tiersRepository.findAll();
	}

	@Override
	public Tiers findOne(Long id) {
		return tiersRepository.findOne(id);
	}

	@Override
	public Tiers save(Tiers user) {
		return tiersRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		tiersRepository.delete(id);
	}



}
