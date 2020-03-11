package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Document implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDocument;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	private String nom;
	private String description;
	@ManyToOne(fetch=FetchType.EAGER)
	private Affaire affaire ;
	
	
	public Document() {
	
	}
	public Document(Date dateCreation, String nom, String description) {
			
		this.dateCreation = dateCreation;
		this.nom = nom;
		this.description = description;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Document [dateCreation=" + dateCreation + ", nom=" + nom + ", description=" + description + "]";
	}

}
