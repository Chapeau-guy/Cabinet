package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Moral;
import com.inti.entities.Physique;
import com.inti.entities.Tiers;

@Repository
public interface PhysiqueRepository extends JpaRepository<Physique, Long> {

}
