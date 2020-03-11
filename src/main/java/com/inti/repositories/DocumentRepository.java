package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
