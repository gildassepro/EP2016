
package org.sepro.parameterweb.serviceapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour courseSubjectDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="courseSubjectDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academic_grade" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="academicmodules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="academicmodule" type="{http://serviceapi.parameterweb.sepro.org/}academicModuleDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="academique_year" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="idCourseSubject" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="number_of_attendent_max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number_of_attendent_min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="number_of_hours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subject_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="teache_rate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type_of_classe" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "courseSubjectDto", propOrder = {
    "academicGrade",
    "academicmodules",
    "academiqueYear",
    "idCourseSubject",
    "numberOfAttendentMax",
    "numberOfAttendentMin",
    "numberOfHours",
    "subjectName",
    "teacheRate",
    "typeOfClasse"
})
public class CourseSubjectDto {

    @XmlElement(name = "academic_grade")
    protected PopuplistDto academicGrade;
    protected CourseSubjectDto.Academicmodules academicmodules;
    @XmlElement(name = "academique_year")
    protected PopuplistDto academiqueYear;
    protected Long idCourseSubject;
    @XmlElement(name = "number_of_attendent_max")
    protected int numberOfAttendentMax;
    @XmlElement(name = "number_of_attendent_min")
    protected int numberOfAttendentMin;
    @XmlElement(name = "number_of_hours")
    protected int numberOfHours;
    @XmlElement(name = "subject_name")
    protected String subjectName;
    @XmlElement(name = "teache_rate")
    protected int teacheRate;
    @XmlElement(name = "type_of_classe")
    protected PopuplistDto typeOfClasse;

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
     * Obtient la valeur de la propriété academicmodules.
     * 
     * @return
     *     possible object is
     *     {@link CourseSubjectDto.Academicmodules }
     *     
     */
    public CourseSubjectDto.Academicmodules getAcademicmodules() {
        return academicmodules;
    }

    /**
     * Définit la valeur de la propriété academicmodules.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseSubjectDto.Academicmodules }
     *     
     */
    public void setAcademicmodules(CourseSubjectDto.Academicmodules value) {
        this.academicmodules = value;
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
     * Obtient la valeur de la propriété idCourseSubject.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCourseSubject() {
        return idCourseSubject;
    }

    /**
     * Définit la valeur de la propriété idCourseSubject.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCourseSubject(Long value) {
        this.idCourseSubject = value;
    }

    /**
     * Obtient la valeur de la propriété numberOfAttendentMax.
     * 
     */
    public int getNumberOfAttendentMax() {
        return numberOfAttendentMax;
    }

    /**
     * Définit la valeur de la propriété numberOfAttendentMax.
     * 
     */
    public void setNumberOfAttendentMax(int value) {
        this.numberOfAttendentMax = value;
    }

    /**
     * Obtient la valeur de la propriété numberOfAttendentMin.
     * 
     */
    public int getNumberOfAttendentMin() {
        return numberOfAttendentMin;
    }

    /**
     * Définit la valeur de la propriété numberOfAttendentMin.
     * 
     */
    public void setNumberOfAttendentMin(int value) {
        this.numberOfAttendentMin = value;
    }

    /**
     * Obtient la valeur de la propriété numberOfHours.
     * 
     */
    public int getNumberOfHours() {
        return numberOfHours;
    }

    /**
     * Définit la valeur de la propriété numberOfHours.
     * 
     */
    public void setNumberOfHours(int value) {
        this.numberOfHours = value;
    }

    /**
     * Obtient la valeur de la propriété subjectName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Définit la valeur de la propriété subjectName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Obtient la valeur de la propriété teacheRate.
     * 
     */
    public int getTeacheRate() {
        return teacheRate;
    }

    /**
     * Définit la valeur de la propriété teacheRate.
     * 
     */
    public void setTeacheRate(int value) {
        this.teacheRate = value;
    }

    /**
     * Obtient la valeur de la propriété typeOfClasse.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getTypeOfClasse() {
        return typeOfClasse;
    }

    /**
     * Définit la valeur de la propriété typeOfClasse.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setTypeOfClasse(PopuplistDto value) {
        this.typeOfClasse = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="academicmodule" type="{http://serviceapi.parameterweb.sepro.org/}academicModuleDto" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "academicmodule"
    })
    public static class Academicmodules {

        protected List<AcademicModuleDto> academicmodule;

        /**
         * Gets the value of the academicmodule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the academicmodule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcademicmodule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AcademicModuleDto }
         * 
         * 
         */
        public List<AcademicModuleDto> getAcademicmodule() {
            if (academicmodule == null) {
                academicmodule = new ArrayList<AcademicModuleDto>();
            }
            return this.academicmodule;
        }

    }

}
