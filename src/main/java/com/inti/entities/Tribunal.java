package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Tribunal implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTribunal;
	private String nomTribunal;
	private String adresse;
	private String fax;
	private String region;
	@OneToMany(mappedBy="tribunal")
	private List<Tache> taches = new ArrayList<>();
	public Tribunal(String nomTribunal, String adresse, String fax, String region, List<Tache> taches) {
		super();
		this.nomTribunal = nomTribunal;
		this.adresse = adresse;
		this.fax = fax;
		this.region = region;
		this.taches = taches;
	}
	public Tribunal() {
		super();
	}
	public String getNomTribunal() {
		return nomTribunal;
	}
	public void setNomTribunal(String nomTribunal) {
		this.nomTribunal = nomTribunal;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public List<Tache> getTaches() {
		return taches;
	}
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
	public Long getIdTribunal() {
		return idTribunal;
	}
	@Override
	public String toString() {
		return "Tribunal [nomTribunal=" + nomTribunal + ", adresse=" + adresse + ", fax=" + fax + ", region=" + region
				+ ", taches=" + taches + "]";
	}
	
	
	

}
