package com.inti.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("moral")
public class Moral extends Tiers{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String RaisonSociale;
	
	public Moral() {
		super();
	}
	
	public Moral(String adresse, Long tel, String maisonSocial) {
		super(adresse, tel);
		RaisonSociale = maisonSocial;
	}



	public String getRaisonSociale() {
		return RaisonSociale;
	}

	public void setRaisonSociale(String maisonSocial) {
		RaisonSociale = maisonSocial;
	}
	

}
