package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Document;
import com.inti.repositories.DocumentRepository;
import com.inti.service.interfaces.IDocumentService;

@Service
public class DocumentService implements IDocumentService {
	@Autowired
	DocumentRepository documentRepository;

	@Override
	public List<Document> findAll() {
		return documentRepository.findAll();
	}

	@Override
	public Document findOne(Long id) {
		return documentRepository.findOne(id);
	}

	@Override
	public Document save(Document user) {
		return documentRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		documentRepository.delete(id);
	}
}
