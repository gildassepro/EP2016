
package org.sepro.parameterweb.serviceapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour academicModuleDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="academicModuleDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academic_grade" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="academic_sector" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="academique_year" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="grade_eliminatory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="grade_rattrapage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="grade_success" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idAcademicModule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="module_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="module_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="module_price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="objectives" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="on_entreprise" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rate_of_success" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requiredModules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="requiredModule" type="{http://serviceapi.parameterweb.sepro.org/}academicModuleDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="teaching_hours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "academicModuleDto", propOrder = {
    "academicGrade",
    "academicSector",
    "academiqueYear",
    "gradeEliminatory",
    "gradeRattrapage",
    "gradeSuccess",
    "idAcademicModule",
    "moduleDescription",
    "moduleName",
    "modulePrice",
    "objectives",
    "onEntreprise",
    "rateOfSuccess",
    "requiredModules",
    "teachingHours"
})
public class AcademicModuleDto {

    @XmlElement(name = "academic_grade")
    protected PopuplistDto academicGrade;
    @XmlElement(name = "academic_sector")
    protected PopuplistDto academicSector;
    @XmlElement(name = "academique_year")
    protected PopuplistDto academiqueYear;
    @XmlElement(name = "grade_eliminatory")
    protected int gradeEliminatory;
    @XmlElement(name = "grade_rattrapage")
    protected int gradeRattrapage;
    @XmlElement(name = "grade_success")
    protected int gradeSuccess;
    protected Long idAcademicModule;
    @XmlElement(name = "module_description")
    protected String moduleDescription;
    @XmlElement(name = "module_name")
    protected String moduleName;
    @XmlElement(name = "module_price")
    protected int modulePrice;
    protected String objectives;
    @XmlElement(name = "on_entreprise")
    protected Boolean onEntreprise;
    @XmlElement(name = "rate_of_success")
    protected int rateOfSuccess;
    protected AcademicModuleDto.RequiredModules requiredModules;
    @XmlElement(name = "teaching_hours")
    protected int teachingHours;

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
     * Obtient la valeur de la propriété gradeEliminatory.
     * 
     */
    public int getGradeEliminatory() {
        return gradeEliminatory;
    }

    /**
     * Définit la valeur de la propriété gradeEliminatory.
     * 
     */
    public void setGradeEliminatory(int value) {
        this.gradeEliminatory = value;
    }

    /**
     * Obtient la valeur de la propriété gradeRattrapage.
     * 
     */
    public int getGradeRattrapage() {
        return gradeRattrapage;
    }

    /**
     * Définit la valeur de la propriété gradeRattrapage.
     * 
     */
    public void setGradeRattrapage(int value) {
        this.gradeRattrapage = value;
    }

    /**
     * Obtient la valeur de la propriété gradeSuccess.
     * 
     */
    public int getGradeSuccess() {
        return gradeSuccess;
    }

    /**
     * Définit la valeur de la propriété gradeSuccess.
     * 
     */
    public void setGradeSuccess(int value) {
        this.gradeSuccess = value;
    }

    /**
     * Obtient la valeur de la propriété idAcademicModule.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAcademicModule() {
        return idAcademicModule;
    }

    /**
     * Définit la valeur de la propriété idAcademicModule.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAcademicModule(Long value) {
        this.idAcademicModule = value;
    }

    /**
     * Obtient la valeur de la propriété moduleDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleDescription() {
        return moduleDescription;
    }

    /**
     * Définit la valeur de la propriété moduleDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleDescription(String value) {
        this.moduleDescription = value;
    }

    /**
     * Obtient la valeur de la propriété moduleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Définit la valeur de la propriété moduleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Obtient la valeur de la propriété modulePrice.
     * 
     */
    public int getModulePrice() {
        return modulePrice;
    }

    /**
     * Définit la valeur de la propriété modulePrice.
     * 
     */
    public void setModulePrice(int value) {
        this.modulePrice = value;
    }

    /**
     * Obtient la valeur de la propriété objectives.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectives() {
        return objectives;
    }

    /**
     * Définit la valeur de la propriété objectives.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectives(String value) {
        this.objectives = value;
    }

    /**
     * Obtient la valeur de la propriété onEntreprise.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOnEntreprise() {
        return onEntreprise;
    }

    /**
     * Définit la valeur de la propriété onEntreprise.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnEntreprise(Boolean value) {
        this.onEntreprise = value;
    }

    /**
     * Obtient la valeur de la propriété rateOfSuccess.
     * 
     */
    public int getRateOfSuccess() {
        return rateOfSuccess;
    }

    /**
     * Définit la valeur de la propriété rateOfSuccess.
     * 
     */
    public void setRateOfSuccess(int value) {
        this.rateOfSuccess = value;
    }

    /**
     * Obtient la valeur de la propriété requiredModules.
     * 
     * @return
     *     possible object is
     *     {@link AcademicModuleDto.RequiredModules }
     *     
     */
    public AcademicModuleDto.RequiredModules getRequiredModules() {
        return requiredModules;
    }

    /**
     * Définit la valeur de la propriété requiredModules.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicModuleDto.RequiredModules }
     *     
     */
    public void setRequiredModules(AcademicModuleDto.RequiredModules value) {
        this.requiredModules = value;
    }

    /**
     * Obtient la valeur de la propriété teachingHours.
     * 
     */
    public int getTeachingHours() {
        return teachingHours;
    }

    /**
     * Définit la valeur de la propriété teachingHours.
     * 
     */
    public void setTeachingHours(int value) {
        this.teachingHours = value;
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
     *         &lt;element name="requiredModule" type="{http://serviceapi.parameterweb.sepro.org/}academicModuleDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "requiredModule"
    })
    public static class RequiredModules {

        protected List<AcademicModuleDto> requiredModule;

        /**
         * Gets the value of the requiredModule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requiredModule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequiredModule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AcademicModuleDto }
         * 
         * 
         */
        public List<AcademicModuleDto> getRequiredModule() {
            if (requiredModule == null) {
                requiredModule = new ArrayList<AcademicModuleDto>();
            }
            return this.requiredModule;
        }

    }

}
