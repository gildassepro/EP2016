package org.sepro.filter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.sepro.inscriptionweb.serviceapi.InscriptionSteptreeDto;
import org.sepro.inscriptionweb.serviceimpl.InscriptionSteptreeServicews;
import org.sepro.inscriptionweb.serviceimpl.InscriptionSteptreeServicewsEndpoint;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.studentweb.serviceapi.StudentDto;
import org.sepro.studentweb.serviceimpl.StudentEventsServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentServicews;
import org.sepro.studentweb.serviceimpl.StudentServicewsEndpoint;


public class FilteredCursusDto {

	
	private String nom; 
	private String prenom;
	private XMLGregorianCalendar datenaissance;
	private String listfilliere;
	private Long idAuthentif;
	
	private List<StudentDto> listStudent = new ArrayList<StudentDto>();
	private List<InscriptionSteptreeDto> listInscriptionSteptree = new ArrayList<InscriptionSteptreeDto>();
	private InscriptionSteptreeServicewsEndpoint inscriptionSteptreeServicewsEndpoint;
	private InscriptionSteptreeServicews inscriptionSteptreeServicews = new InscriptionSteptreeServicews();
	
	private StudentServicewsEndpoint studentServicewsEndpoint;
	private StudentServicews studentServicews = new StudentServicews();
	
	
	private List<FilteredCursusDto> listCursus = new ArrayList<FilteredCursusDto>();
	
	private List<FilteredCursusDto> listStudentCursus = new ArrayList<FilteredCursusDto>();
	
	
	
	
	
	public List<FilteredCursusDto> getListStudentCursus() {
		return listStudentCursus;
	}
	public void setListStudentCursus(List<FilteredCursusDto> listStudentCursus) {
		this.listStudentCursus = listStudentCursus;
	}
	public XMLGregorianCalendar getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(XMLGregorianCalendar datenaissance) {
		this.datenaissance = datenaissance;
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
	
	
	public List<FilteredCursusDto> getListCursus() {
		return listCursus;
	}
	public void setListCursus(List<FilteredCursusDto> listCursus) {
		this.listCursus = listCursus;
	}
	
	
	public List<FilteredCursusDto> getData(Long id, List<StudentDto> listStudents, List<InscriptionSteptreeDto> listSteptrees){
		studentServicewsEndpoint = studentServicews.getStudentServicewsImplPort();
		inscriptionSteptreeServicewsEndpoint = inscriptionSteptreeServicews.getInscriptionSteptreeServicewsImplPort();
		
		FilteredCursusDto flt = new FilteredCursusDto();
		for(int i = 0; i < listSteptrees.size(); i ++){
			if (id == listSteptrees.get(i).getAcademicSector().getIdPopuplist()){
				flt.setIdAuthentif(listSteptrees.get(i).getInscriptionAuthentification().getIdInscription());
			}
			for(int j = 0; j < listStudents.size(); j ++){
				if(flt.getIdAuthentif() == listStudents.get(j).getInscriptionAuthentification().getIdInscription()){
					flt.setNom(listStudents.get(j).getName());
					flt.setPrenom(listStudents.get(j).getFirstName());
					flt.setDatenaissance(listStudents.get(j).getBirthday());
				}
			}
			
			listCursus.add(flt);
			
		}
		
		return listCursus;
	}
	
	public List<FilteredCursusDto> getInfo(Long id, List<InscriptionSteptreeDto> listInscript3){
		
		
		
		return listStudentCursus;
	}
	
	
	
	
}
