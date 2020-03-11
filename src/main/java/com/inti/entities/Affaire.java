package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.OneToMany;

@Entity
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
	@OneToMany
	List<Document> documents = new ArrayList<>();
	
	
	
	public Affaire(String reference, String titre, String description, int statut, List<Document> documents) {
		super();
		this.reference = reference;
		this.titre = titre;
		this.description = description;
		this.statut = statut;
		this.documents = documents;
	}
	
	public Affaire() {
		
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatut() {
		return statut;
	}

	public void setStatut(int statut) {
		this.statut = statut;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Affaire [reference=" + reference + ", titre=" + titre + ", description=" + description + ", statut="
				+ statut + ", documents=" + documents + "]";
	}
	
	
	

}
