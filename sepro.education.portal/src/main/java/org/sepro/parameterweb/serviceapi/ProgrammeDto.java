
package org.sepro.parameterweb.serviceapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour programmeDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="programmeDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academic_grade" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="academicmodule" minOccurs="0">
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
 *         &lt;element name="curriculum" type="{http://serviceapi.parameterweb.sepro.org/}curriculumDto" minOccurs="0"/>
 *         &lt;element name="idProgramme" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name_programme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "programmeDto", propOrder = {
    "academicGrade",
    "academicmodule",
    "academiqueYear",
    "curriculum",
    "idProgramme",
    "nameProgramme"
})
public class ProgrammeDto {

    @XmlElement(name = "academic_grade")
    protected PopuplistDto academicGrade;
    protected ProgrammeDto.Academicmodule academicmodule;
    @XmlElement(name = "academique_year")
    protected PopuplistDto academiqueYear;
    protected CurriculumDto curriculum;
    protected Long idProgramme;
    @XmlElement(name = "name_programme")
    protected String nameProgramme;

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
     * Obtient la valeur de la propriété academicmodule.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammeDto.Academicmodule }
     *     
     */
    public ProgrammeDto.Academicmodule getAcademicmodule() {
        return academicmodule;
    }

    /**
     * Définit la valeur de la propriété academicmodule.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammeDto.Academicmodule }
     *     
     */
    public void setAcademicmodule(ProgrammeDto.Academicmodule value) {
        this.academicmodule = value;
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
     * Obtient la valeur de la propriété curriculum.
     * 
     * @return
     *     possible object is
     *     {@link CurriculumDto }
     *     
     */
    public CurriculumDto getCurriculum() {
        return curriculum;
    }

    /**
     * Définit la valeur de la propriété curriculum.
     * 
     * @param value
     *     allowed object is
     *     {@link CurriculumDto }
     *     
     */
    public void setCurriculum(CurriculumDto value) {
        this.curriculum = value;
    }

    /**
     * Obtient la valeur de la propriété idProgramme.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProgramme() {
        return idProgramme;
    }

    /**
     * Définit la valeur de la propriété idProgramme.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProgramme(Long value) {
        this.idProgramme = value;
    }

    /**
     * Obtient la valeur de la propriété nameProgramme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameProgramme() {
        return nameProgramme;
    }

    /**
     * Définit la valeur de la propriété nameProgramme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameProgramme(String value) {
        this.nameProgramme = value;
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
    public static class Academicmodule {

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
