package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Tribunal;

public interface TribunalRepository extends JpaRepository<Tribunal, Long> {

}
