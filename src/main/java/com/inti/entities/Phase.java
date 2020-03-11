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
public class Phase implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPhase;
	private String nomPhase;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	@ManyToOne(fetch=FetchType.EAGER)
	private Tache tache;
	
	public Phase(String nomPhase, Date dateDebut, Date dateFin, Tache tache) {
		super();
		this.nomPhase = nomPhase;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.tache = tache;
	}
	public Phase() {
		super();
	}
	public String getNomPhase() {
		return nomPhase;
	}
	public void setNomPhase(String nomPhase) {
		this.nomPhase = nomPhase;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Tache getTache() {
		return tache;
	}
	public void setTache(Tache tache) {
		this.tache = tache;
	}
	public Long getIdPhase() {
		return idPhase;
	}
	@Override
	public String toString() {
		return "Phase [nomPhase=" + nomPhase + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", tache=" + tache
				+ "]";
	}

	
}
