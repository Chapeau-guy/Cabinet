
//package com.inti.service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.inti.entities.Ref;
//import com.inti.repositories.RefRepository;
//import com.inti.service.interfaces.IRefService;
//
//@Service
//public class RefService implements IRefService {
//	@Autowired
//	RefRepository refRepository;
//
//	@Override
//	public List<Ref> findAll() {
//		return refRepository.findAll();
//	}
//
//	@Override
//	public Ref findOne(Long id) {
//		return refRepository.findOne(id);
//	}
//
//	@Override
//	public Ref save(Ref user) {
//		return refRepository.save(user);
//	}
//
//	@Override
//	public void delete(Long id) {
//		refRepository.delete(id);
//	}
//
//	@Override
//	public Ref findOneByUsername(String username) {
//		return refRepository.findOneByUsername(username);
//	}
//
//}

/*package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Ref;
import com.inti.repositories.RefRepository;
import com.inti.service.interfaces.IRefService;

@Service
public class RefService implements IRefService {
	@Autowired
	RefRepository refRepository;

	@Override
	public List<Ref> findAll() {
		return refRepository.findAll();
	}

	@Override
	public Ref findOne(Long id) {
		return refRepository.findOne(id);
	}

	@Override
	public Ref save(Ref user) {
		return refRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		refRepository.delete(id);
	}

	@Override
	public Ref findOneByUsername(String username) {
		return refRepository.findOneByUsername(username);
	}

}*/
