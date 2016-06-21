
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour curriculumDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="curriculumDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academic_grade" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="academique_year" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="cursus_presentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cursus_status" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="idCurriculum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name_curriculum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number_of_sessions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number_of_years" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type_of_course" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "curriculumDto", propOrder = {
    "academicGrade",
    "academiqueYear",
    "cursusPresentation",
    "cursusStatus",
    "idCurriculum",
    "nameCurriculum",
    "numberOfSessions",
    "numberOfYears",
    "typeOfCourse"
})
public class CurriculumDto {

    @XmlElement(name = "academic_grade")
    protected PopuplistDto academicGrade;
    @XmlElement(name = "academique_year")
    protected PopuplistDto academiqueYear;
    @XmlElement(name = "cursus_presentation")
    protected String cursusPresentation;
    @XmlElement(name = "cursus_status")
    protected PopuplistDto cursusStatus;
    protected Long idCurriculum;
    @XmlElement(name = "name_curriculum")
    protected String nameCurriculum;
    @XmlElement(name = "number_of_sessions")
    protected int numberOfSessions;
    @XmlElement(name = "number_of_years")
    protected int numberOfYears;
    @XmlElement(name = "type_of_course")
    protected Boolean typeOfCourse;

    /**
     * Obtient la valeur de la propriété academicGrade.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getAcademicGrade() {
        return academicGrade;
    }

    /**
     * Définit la valeur de la propriété academicGrade.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setAcademicGrade(PopuplistDto value) {
        this.academicGrade = value;
    }

    /**
     * Obtient la valeur de la propriété academiqueYear.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getAcademiqueYear() {
        return academiqueYear;
    }

    /**
     * Définit la valeur de la propriété academiqueYear.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setAcademiqueYear(PopuplistDto value) {
        this.academiqueYear = value;
    }

    /**
     * Obtient la valeur de la propriété cursusPresentation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursusPresentation() {
        return cursusPresentation;
    }

    /**
     * Définit la valeur de la propriété cursusPresentation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursusPresentation(String value) {
        this.cursusPresentation = value;
    }

    /**
     * Obtient la valeur de la propriété cursusStatus.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getCursusStatus() {
        return cursusStatus;
    }

    /**
     * Définit la valeur de la propriété cursusStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setCursusStatus(PopuplistDto value) {
        this.cursusStatus = value;
    }

    /**
     * Obtient la valeur de la propriété idCurriculum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCurriculum() {
        return idCurriculum;
    }

    /**
     * Définit la valeur de la propriété idCurriculum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCurriculum(Long value) {
        this.idCurriculum = value;
    }

    /**
     * Obtient la valeur de la propriété nameCurriculum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCurriculum() {
        return nameCurriculum;
    }

    /**
     * Définit la valeur de la propriété nameCurriculum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCurriculum(String value) {
        this.nameCurriculum = value;
    }

    /**
     * Obtient la valeur de la propriété numberOfSessions.
     * 
     */
    public int getNumberOfSessions() {
        return numberOfSessions;
    }

    /**
     * Définit la valeur de la propriété numberOfSessions.
     * 
     */
    public void setNumberOfSessions(int value) {
        this.numberOfSessions = value;
    }

    /**
     * Obtient la valeur de la propriété numberOfYears.
     * 
     */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /**
     * Définit la valeur de la propriété numberOfYears.
     * 
     */
    public void setNumberOfYears(int value) {
        this.numberOfYears = value;
    }

    /**
     * Obtient la valeur de la propriété typeOfCourse.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTypeOfCourse() {
        return typeOfCourse;
    }

    /**
     * Définit la valeur de la propriété typeOfCourse.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTypeOfCourse(Boolean value) {
        this.typeOfCourse = value;
    }

}
