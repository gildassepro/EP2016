package org.sepro.studentweb.bean.util;

import java.util.ArrayList;
import java.util.List;

import org.sepro.inscriptionweb.serviceapi.InscriptionAuthentificationDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionStepfourDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteponeDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteptreeDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteptwoDto;

import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.studentweb.serviceapi.StudentDto;

public class ProspectDto {
	
	
	
	private List<InscriptionSteponeDto> listStudentIdentity = new ArrayList<InscriptionSteponeDto>();
	private List<InscriptionSteptwoDto> listInscriptionSteptwo = new ArrayList<InscriptionSteptwoDto>();
	private List<InscriptionSteptreeDto> listInscriptionSteptree = new ArrayList<InscriptionSteptreeDto>();
	private List<InscriptionStepfourDto> listInscriptionStepfour = new ArrayList<InscriptionStepfourDto>();
	
	
	
	
	private String nom; 
	private String prenom;
	private InscriptionAuthentificationDto idAuthentification;
	private PopuplistDto fillier;
	private String listfilliere;
	private Integer idAuth;
	private Long idAuthentif;
	
	private List<ProspectDto> listprospects = new ArrayList<ProspectDto>();
	private List<StudentDto> listStudentPart = new ArrayList<StudentDto>();
	
	
	public Long getIdAuthentif() {
		return idAuthentif;
	}
	public void setIdAuthentif(Long idAuthentif) {
		this.idAuthentif = idAuthentif;
	}
	public List<ProspectDto> getListprospects() {
		return listprospects;
	}
	public void setListprospects(List<ProspectDto> listprospects) {
		this.listprospects = listprospects;
	}	
	
	public String getListfilliere() {
		return listfilliere;
	}
	public void setListfilliere(String listfilliere) {
		this.listfilliere = listfilliere;
	}
	public Integer getIdAuth() {
		return idAuth;
	}
	public void setIdAuth(Integer idAuth) {
		this.idAuth = idAuth;
	}
	
	
	public List<InscriptionSteponeDto> getListStudentIdentity() {
		return listStudentIdentity;
	}
	public void setListStudentIdentity(
			List<InscriptionSteponeDto> listStudentIdentity) {
		this.listStudentIdentity = listStudentIdentity;
	}
	
	public List<InscriptionSteptwoDto> getListInscriptionSteptwo() {
		return listInscriptionSteptwo;
	}
	public void setListInscriptionSteptwo(
			List<InscriptionSteptwoDto> listInscriptionSteptwo) {
		this.listInscriptionSteptwo = listInscriptionSteptwo;
	}
	
	public List<InscriptionSteptreeDto> getListInscriptionSteptree() {
		return listInscriptionSteptree;
	}
	public void setListInscriptionSteptree(
			List<InscriptionSteptreeDto> listInscriptionSteptree) {
		this.listInscriptionSteptree = listInscriptionSteptree;
	}
	
	public List<InscriptionStepfourDto> getListInscriptionStepfour() {
		return listInscriptionStepfour;
	}
	public void setListInscriptionStepfour(
			List<InscriptionStepfourDto> listInscriptionStepfour) {
		this.listInscriptionStepfour = listInscriptionStepfour;
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
	
	
	
	public List<StudentDto> getListStudentPart() {
		return listStudentPart;
	}
	public void setListStudentPart(List<StudentDto> listStudentPart) {
		this.listStudentPart = listStudentPart;
	}
	
//	
//	public List<ProspectDto> getInformations(List<InscriptionSteponeDto> listStudentIdentity,List<InscriptionSteptreeDto> listInscriptionSteptree ) {
//		
//		
//		for(int i = 0; i < listStudentIdentity.size(); i++)
//			{
//			    ProspectDto prospectDtos = new ProspectDto();
//				prospectDtos.setNom(listStudentIdentity.get(i).getName());
//				prospectDtos.setPrenom(listStudentIdentity.get(i).getFirstName());
//				prospectDtos.setIdAuthentif(listStudentIdentity.get(i).getInscriptionAuthentification().getIdInscription());
//				
//				
//				for(int j = 0; j < listInscriptionSteptree.size(); j ++){
//					if( prospectDtos.getIdAuthentif() == listInscriptionSteptree.get(j).getInscriptionAuthentification().getIdInscription()){
//						prospectDtos.setListfilliere(listInscriptionSteptree.get(j).getAcademicSector().getValue());
//					}
//				}
//				listprospects.add(prospectDtos);
//				
//			}
//		
//		return listprospects;
//		
//	}
	
public List<ProspectDto> getInformations(List<StudentDto> listStudentPart,List<InscriptionSteptreeDto> listInscriptionSteptree ) {
		
		
		for(int i = 0; i < listStudentPart.size(); i++)
			{
			    ProspectDto prospectDtos = new ProspectDto();
				prospectDtos.setNom(listStudentPart.get(i).getName());
				prospectDtos.setPrenom(listStudentPart.get(i).getFirstName());
				prospectDtos.setIdAuthentif(listStudentPart.get(i).getInscriptionAuthentification().getIdInscription());
				
				
				for(int j = 0; j < listInscriptionSteptree.size(); j ++){
					if( prospectDtos.getIdAuthentif() == listInscriptionSteptree.get(j).getInscriptionAuthentification().getIdInscription()){
						prospectDtos.setListfilliere(listInscriptionSteptree.get(j).getAcademicSector().getValue());
					}
				}
				listprospects.add(prospectDtos);
				
			}
		
		return listprospects;
		
	}
	
		

}
