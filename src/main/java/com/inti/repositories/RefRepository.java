package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Ref;
import com.inti.entities.Utilisateur;

@Repository
public interface RefRepository extends JpaRepository<Utilisateur, Long> {
	Ref findOneByUsername(String machin);
}
