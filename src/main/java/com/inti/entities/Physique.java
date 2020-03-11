package com.inti.entities;

public class Physique extends Tiers{
	private String nom;
	private String prenom;
	private Long NumIdentité;
	public Physique() {
		super();
	}
	
	
	
	public Physique(String adresse, Long tel , String nom, String prenom, Long numIdentité) {
		super(adresse,tel);
		this.nom = nom;
		this.prenom = prenom;
		NumIdentité = numIdentité;
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
		return NumIdentité;
	}
	public void setNumIdentité(Long numIdentité) {
		NumIdentité = numIdentité;
	}


	@Override
	public String toString() {
		return "Physique [nom=" + nom + ", prenom=" + prenom + ", NumIdentité=" + NumIdentité + "]";
	}
	
	
	
}
