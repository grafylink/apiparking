package com.formation.parking.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsEntity {

	@JsonProperty(value = "idobj")
	private String idObj;
	@JsonProperty(value = "grp_nom")
	private String grpNom;
	@JsonProperty(value = "grp_exploitation")
	private int grpExploitation;
	@JsonProperty(value = "disponibilite")
	private int disponibilite;
	@JsonProperty(value = "grp_statut")
	private int grpStatut;
	@JsonProperty(value = "grp_horodatage")
	private String grpHorodatage;
	public String getIdObj() {
		return idObj;
	}
	public void setIdObj(String idObj) {
		this.idObj = idObj;
	}
	public String getGrpNom() {
		return grpNom;
	}
	public void setGrpNom(String grpNom) {
		this.grpNom = grpNom;
	}
	public int getGrpExploitation() {
		return grpExploitation;
	}
	public void setGrpExploitation(int grpExploitation) {
		this.grpExploitation = grpExploitation;
	}
	public int getDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(int disponibilite) {
		this.disponibilite = disponibilite;
	}
	public int getGrpStatut() {
		return grpStatut;
	}
	public void setGrpStatut(int grpStatut) {
		this.grpStatut = grpStatut;
	}
	public String getGrpHorodatage() {
		return grpHorodatage;
	}
	public void setGrpHorodatage(String grpHorodatage) {
		this.grpHorodatage = grpHorodatage;
	}
	
	

}
