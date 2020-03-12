package com.inti.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tache implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTache;
	private String titre;
	private String description;
	private Date dateCreation;
	private boolean statutAudience;
	@ManyToOne(fetch = FetchType.EAGER)
	private Tribunal tribunal;
	@ManyToOne(fetch = FetchType.EAGER)
	private Utilisateur utilisateur;
	@OneToMany(mappedBy = "tache", fetch = FetchType.EAGER)
	private List<Phase> phases = new ArrayList<>();
	@ManyToOne(fetch = FetchType.EAGER)
	private Affaire affaire;

	public Tache() {
	}

	public Tache(String titre, String description, Date dateCreation, boolean statutAudience, Tribunal tribunal,
			Utilisateur utilisateur, Affaire affaire) {
		this.titre = titre;
		this.description = description;
		this.dateCreation = dateCreation;
		this.statutAudience = statutAudience;
		this.tribunal = tribunal;
		this.utilisateur = utilisateur;
		this.affaire = affaire;
	}

	public Long getIdTache() {
		return idTache;
	}

	public void setIdTache(Long idTache) {
		this.idTache = idTache;
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

	public Tribunal getTribunal() {
		return tribunal;
	}

	public void setTribunal(Tribunal tribunal) {
		this.tribunal = tribunal;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Phase> getPhases() {
		return phases;
	}

	public void setPhases(List<Phase> phases) {
		this.phases = phases;
	}

	public Affaire getAffaire() {
		return affaire;
	}

	public void setAffaire(Affaire affaire) {
		this.affaire = affaire;
	}

}
