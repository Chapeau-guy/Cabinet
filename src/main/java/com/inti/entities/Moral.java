package com.inti.entities;

import javax.persistence.Entity;

@Entity
public class Moral extends Tiers{
	private String MaisonSocial;
	
	public Moral() {
		super();
	}
	
	public Moral(String adresse, Long tel, String maisonSocial) {
		super(adresse, tel);
		MaisonSocial = maisonSocial;
	}



	public String getMaisonSocial() {
		return MaisonSocial;
	}

	public void setMaisonSocial(String maisonSocial) {
		MaisonSocial = maisonSocial;
	}
	

}
