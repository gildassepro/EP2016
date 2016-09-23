package org.sepro.filter;

import java.util.ArrayList;
import java.util.List;

import org.sepro.inscriptionweb.serviceapi.InscriptionAuthentificationDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteptreeDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.studentweb.serviceapi.StudentDto;

public class FilteredDto {

	private List<StudentDto> listStudent = new ArrayList<StudentDto>();
	private List<InscriptionSteptreeDto> listInscriptionSteptree = new ArrayList<InscriptionSteptreeDto>();
	
	private List<FilteredDto> listFiltre = new ArrayList<FilteredDto>();
	
	private String nom; 
	private String prenom;
	private InscriptionAuthentificationDto idAuthentification;
	private PopuplistDto fillier;
	private String listfilliere;
	private Long idAuthentif;
	
	
	
	public List<FilteredDto> getListFiltre() {
		return listFiltre;
	}
	public void setListFiltre(List<FilteredDto> listFiltre) {
		this.listFiltre = listFiltre;
	}
	public List<StudentDto> getListStudent() {
		return listStudent;
	}
	public void setListStudent(List<StudentDto> listStudent) {
		this.listStudent = listStudent;
	}
	public List<InscriptionSteptreeDto> getListInscriptionSteptree() {
		return listInscriptionSteptree;
	}
	public void setListInscriptionSteptree(
			List<InscriptionSteptreeDto> listInscriptionSteptree) {
		this.listInscriptionSteptree = listInscriptionSteptree;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public InscriptionAuthentificationDto getIdAuthentification() {
		return idAuthentification;
	}
	public void setIdAuthentification(
			InscriptionAuthentificationDto idAuthentification) {
		this.idAuthentification = idAuthentification;
	}
	public PopuplistDto getFillier() {
		return fillier;
	}
	public void setFillier(PopuplistDto fillier) {
		this.fillier = fillier;
	}
	public String getListfilliere() {
		return listfilliere;
	}
	public void setListfilliere(String listfilliere) {
		this.listfilliere = listfilliere;
	}
	public Long getIdAuthentif() {
		return idAuthentif;
	}
	public void setIdAuthentif(Long idAuthentif) {
		this.idAuthentif = idAuthentif;
	}
	
	
	public List<FilteredDto> getInformations(List<StudentDto> listStudent,List<InscriptionSteptreeDto> listInscriptionSteptree ){
		
		for(int i = 0; i < listStudent.size(); i ++){
			FilteredDto filteredDtos = new FilteredDto();
			
			filteredDtos.setNom(listStudent.get(i).getName());
			filteredDtos.setPrenom(listStudent.get(i).getFirstName());
			filteredDtos.setIdAuthentif(listStudent.get(i).getInscriptionAuthentification().getIdInscription());
		}
		
       for(int j = 0; j < listInscriptionSteptree.size(); j ++){
			
		}
		
		return listFiltre;
	}
	
	
}
