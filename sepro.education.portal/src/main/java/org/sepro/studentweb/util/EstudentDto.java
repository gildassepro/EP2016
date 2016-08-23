package org.sepro.studentweb.util;

import java.util.ArrayList;
import java.util.List;

import org.sepro.inscriptionweb.serviceapi.InscriptionAuthentificationDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionStepfourDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteptreeDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.studentweb.serviceapi.StudentDto;

public class EstudentDto {

	
	private List<StudentDto> listStudent = new ArrayList<StudentDto>();
	private List<InscriptionSteptreeDto> listInscriptionSteptree = new ArrayList<InscriptionSteptreeDto>();
	
	private String nom; 
	private String prenom;
	private InscriptionAuthentificationDto idAuthentification;
	private PopuplistDto fillier;
	private String listfilliere;
	private Long idAuthentif;
	
	private List<EstudentDto> listEstudents = new ArrayList<EstudentDto>();
	
	
	
	
	
	public List<StudentDto> getListStudent() {
		return listStudent;
	}





	public void setListStudent(List<StudentDto> listStudent) {
		this.listStudent = listStudent;
	}





	public PopuplistDto getFillier() {
		return fillier;
	}





	public void setFillier(PopuplistDto fillier) {
		this.fillier = fillier;
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





	public List<EstudentDto> getListEstudents() {
		return listEstudents;
	}





	public void setListEstudents(List<EstudentDto> listEstudents) {
		this.listEstudents = listEstudents;
	}





	public List<EstudentDto> getInformations(List<StudentDto> listStudentIdentity,List<InscriptionSteptreeDto> listInscriptionSteptree ) {
		
		
		for(int i = 0; i < listStudentIdentity.size(); i++)
			{
			    EstudentDto estudentDtos = new EstudentDto();
			    estudentDtos.setNom(listStudentIdentity.get(i).getName());
			    estudentDtos.setPrenom(listStudentIdentity.get(i).getFirstName());
			    estudentDtos.setIdAuthentif(listStudentIdentity.get(i).getInscriptionAuthentification().getIdInscription());
				
				
				for(int j = 0; j < listInscriptionSteptree.size(); j ++){
					if( estudentDtos.getIdAuthentif() == listInscriptionSteptree.get(j).getInscriptionAuthentification().getIdInscription()){
						estudentDtos.setListfilliere(listInscriptionSteptree.get(j).getAcademicSector().getValue());
					}
				}
				listEstudents.add(estudentDtos);
				
			}
		
		return listEstudents;
		
	}
}
