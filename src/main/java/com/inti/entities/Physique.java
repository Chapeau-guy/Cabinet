package com.inti.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("physique")
public class Physique extends Tiers {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private Long numIdentité;

	public Physique() {
		super();
	}

	public Physique(String adresse, Long tel, String nom, String prenom, Long numIdentité) {
		super(adresse, tel);
		this.nom = nom;
		this.prenom = prenom;
		this.numIdentité = numIdentité;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Long getNumIdentité() {
		return numIdentité;
	}

	public void setNumIdentité(Long numIdentité) {
		this.numIdentité = numIdentité;
	}

	@Override
	public String toString() {
		return "Physique [nom=" + nom + ", prenom=" + prenom + ", NumIdentité=" + numIdentité + "]";
	}

}
