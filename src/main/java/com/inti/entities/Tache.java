package com.inti.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tache implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTache;
	private String titre;
	private String description;
	private Date dateCreation;
	private boolean statutAudience;
	@ManyToOne(fetch=FetchType.EAGER)
	private Tribunal tribunal; 
	@ManyToOne(fetch=FetchType.EAGER)
	private Utilisateur utilisateur; 
	
	
	public Tache() {
		super();
	}
	public Tache(String titre, String description, Date dateCreation, boolean statutAudience) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateCreation = dateCreation;
		this.statutAudience = statutAudience;
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
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public boolean isStatutAudience() {
		return statutAudience;
	}
	public void setStatutAudience(boolean statutAudience) {
		this.statutAudience = statutAudience;
	}
	public Long getIdTache() {
		return idTache;
	}
	
	

}
