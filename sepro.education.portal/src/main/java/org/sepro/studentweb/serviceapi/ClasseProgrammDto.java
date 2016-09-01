
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.ProgrammeCalendarDto;
import org.sepro.teacherweb.serviceapi.IdentityTeacherDto;


/**
 * <p>Classe Java pour classeProgrammDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="classeProgrammDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academic_sector" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="academic_year" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="classeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idClasseProgramm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nombreEleve" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="programmeCalendar" type="{http://serviceapi.parameterweb.sepro.org/}programmeCalendarDto" minOccurs="0"/>
 *         &lt;element name="studentResponsable" type="{http://serviceapi.studentweb.sepro.org/}studentDto" minOccurs="0"/>
 *         &lt;element name="teacherResponsable" type="{http://serviceapi.teacherweb.sepro.org/}identityTeacherDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classeProgrammDto", propOrder = {
    "academicSector",
    "academicYear",
    "classeName",
    "idClasseProgramm",
    "nombreEleve",
    "programmeCalendar",
    "studentResponsable",
    "teacherResponsable"
})
public class ClasseProgrammDto {

    @XmlElement(name = "academic_sector")
    protected PopuplistDto academicSector;
    @XmlElement(name = "academic_year")
    protected PopuplistDto academicYear;
    protected String classeName;
    protected Long idClasseProgramm;
    protected Long nombreEleve;
    protected ProgrammeCalendarDto programmeCalendar;
    protected StudentDto studentResponsable;
    protected IdentityTeacherDto teacherResponsable;

    /**
     * Obtient la valeur de la propriété academicSector.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getAcademicSector() {
        return academicSector;
    }

    /**
     * Définit la valeur de la propriété academicSector.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setAcademicSector(PopuplistDto value) {
        this.academicSector = value;
    }

    /**
     * Obtient la valeur de la propriété academicYear.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getAcademicYear() {
        return academicYear;
    }

    /**
     * Définit la valeur de la propriété academicYear.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setAcademicYear(PopuplistDto value) {
        this.academicYear = value;
    }

    /**
     * Obtient la valeur de la propriété classeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasseName() {
        return classeName;
    }

    /**
     * Définit la valeur de la propriété classeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasseName(String value) {
        this.classeName = value;
    }

    /**
     * Obtient la valeur de la propriété idClasseProgramm.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdClasseProgramm() {
        return idClasseProgramm;
    }

    /**
     * Définit la valeur de la propriété idClasseProgramm.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdClasseProgramm(Long value) {
        this.idClasseProgramm = value;
    }

    /**
     * Obtient la valeur de la propriété nombreEleve.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNombreEleve() {
        return nombreEleve;
    }

    /**
     * Définit la valeur de la propriété nombreEleve.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNombreEleve(Long value) {
        this.nombreEleve = value;
    }

    /**
     * Obtient la valeur de la propriété programmeCalendar.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammeCalendarDto }
     *     
     */
    public ProgrammeCalendarDto getProgrammeCalendar() {
        return programmeCalendar;
    }

    /**
     * Définit la valeur de la propriété programmeCalendar.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammeCalendarDto }
     *     
     */
    public void setProgrammeCalendar(ProgrammeCalendarDto value) {
        this.programmeCalendar = value;
    }

    /**
     * Obtient la valeur de la propriété studentResponsable.
     * 
     * @return
     *     possible object is
     *     {@link StudentDto }
     *     
     */
    public StudentDto getStudentResponsable() {
        return studentResponsable;
    }

    /**
     * Définit la valeur de la propriété studentResponsable.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentDto }
     *     
     */
    public void setStudentResponsable(StudentDto value) {
        this.studentResponsable = value;
    }

    /**
     * Obtient la valeur de la propriété teacherResponsable.
     * 
     * @return
     *     possible object is
     *     {@link IdentityTeacherDto }
     *     
     */
    public IdentityTeacherDto getTeacherResponsable() {
        return teacherResponsable;
    }

    /**
     * Définit la valeur de la propriété teacherResponsable.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityTeacherDto }
     *     
     */
    public void setTeacherResponsable(IdentityTeacherDto value) {
        this.teacherResponsable = value;
    }

}
