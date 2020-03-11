package com.inti.entities;

import java.io.Serializable;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Affaire implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAffaire;
	private String reference;
	private String titre;
	private String description;
	private int statut ;
	@ManyToMany(fetch = FetchType.EAGER)
	private
	
	

}
