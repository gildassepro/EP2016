
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;


/**
 * <p>Classe Java pour examGroupDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="examGroupDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academic_module" type="{http://serviceapi.parameterweb.sepro.org/}academicModuleDto" minOccurs="0"/>
 *         &lt;element name="academic_year" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="averageMark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="classeProgramm" type="{http://serviceapi.studentweb.sepro.org/}classeProgrammDto" minOccurs="0"/>
 *         &lt;element name="coefficient" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="examGroup" type="{http://serviceapi.studentweb.sepro.org/}examGroupDto" minOccurs="0"/>
 *         &lt;element name="examModuleGroup" type="{http://serviceapi.studentweb.sepro.org/}examModuleGroupDto" minOccurs="0"/>
 *         &lt;element name="idExamGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxMark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minimumMark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "examGroupDto", propOrder = {
    "academicModule",
    "academicYear",
    "averageMark",
    "classeProgramm",
    "coefficient",
    "examGroup",
    "examModuleGroup",
    "idExamGroup",
    "maxMark",
    "minimumMark",
    "title"
})
public class ExamGroupDto {

    @XmlElement(name = "academic_module", nillable = true)
    protected AcademicModuleDto academicModule;
    @XmlElement(name = "academic_year", nillable = true)
    protected PopuplistDto academicYear;
    @XmlElement(nillable = true)
    protected Double averageMark;
    @XmlElement(nillable = true)
    protected ClasseProgrammDto classeProgramm;
    @XmlElement(nillable = true)
    protected Double coefficient;
    @XmlElement(nillable = true)
    protected ExamGroupDto examGroup;
    @XmlElement(nillable = true)
    protected ExamModuleGroupDto examModuleGroup;
    protected Long idExamGroup;
    @XmlElement(nillable = true)
    protected Double maxMark;
    @XmlElement(nillable = true)
    protected Double minimumMark;
    @XmlElement(nillable = true)
    protected String title;

    /**
     * Obtient la valeur de la propriété academicModule.
     * 
     * @return
     *     possible object is
     *     {@link AcademicModuleDto }
     *     
     */
    public AcademicModuleDto getAcademicModule() {
        return academicModule;
    }

    /**
     * Définit la valeur de la propriété academicModule.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicModuleDto }
     *     
     */
    public void setAcademicModule(AcademicModuleDto value) {
        this.academicModule = value;
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
     * Obtient la valeur de la propriété averageMark.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageMark() {
        return averageMark;
    }

    /**
     * Définit la valeur de la propriété averageMark.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageMark(Double value) {
        this.averageMark = value;
    }

    /**
     * Obtient la valeur de la propriété classeProgramm.
     * 
     * @return
     *     possible object is
     *     {@link ClasseProgrammDto }
     *     
     */
    public ClasseProgrammDto getClasseProgramm() {
        return classeProgramm;
    }

    /**
     * Définit la valeur de la propriété classeProgramm.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasseProgrammDto }
     *     
     */
    public void setClasseProgramm(ClasseProgrammDto value) {
        this.classeProgramm = value;
    }

    /**
     * Obtient la valeur de la propriété coefficient.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoefficient() {
        return coefficient;
    }

    /**
     * Définit la valeur de la propriété coefficient.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoefficient(Double value) {
        this.coefficient = value;
    }

    /**
     * Obtient la valeur de la propriété examGroup.
     * 
     * @return
     *     possible object is
     *     {@link ExamGroupDto }
     *     
     */
    public ExamGroupDto getExamGroup() {
        return examGroup;
    }

    /**
     * Définit la valeur de la propriété examGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link ExamGroupDto }
     *     
     */
    public void setExamGroup(ExamGroupDto value) {
        this.examGroup = value;
    }

    /**
     * Obtient la valeur de la propriété examModuleGroup.
     * 
     * @return
     *     possible object is
     *     {@link ExamModuleGroupDto }
     *     
     */
    public ExamModuleGroupDto getExamModuleGroup() {
        return examModuleGroup;
    }

    /**
     * Définit la valeur de la propriété examModuleGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link ExamModuleGroupDto }
     *     
     */
    public void setExamModuleGroup(ExamModuleGroupDto value) {
        this.examModuleGroup = value;
    }

    /**
     * Obtient la valeur de la propriété idExamGroup.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdExamGroup() {
        return idExamGroup;
    }

    /**
     * Définit la valeur de la propriété idExamGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdExamGroup(Long value) {
        this.idExamGroup = value;
    }

    /**
     * Obtient la valeur de la propriété maxMark.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxMark() {
        return maxMark;
    }

    /**
     * Définit la valeur de la propriété maxMark.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxMark(Double value) {
        this.maxMark = value;
    }

    /**
     * Obtient la valeur de la propriété minimumMark.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumMark() {
        return minimumMark;
    }

    /**
     * Définit la valeur de la propriété minimumMark.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumMark(Double value) {
        this.minimumMark = value;
    }

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
