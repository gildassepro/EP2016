
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour examModuleGroupDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="examModuleGroupDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averageMark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="idExamModuleGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "examModuleGroupDto", propOrder = {
    "averageMark",
    "idExamModuleGroup",
    "maxMark",
    "minimumMark",
    "title"
})
public class ExamModuleGroupDto {

    @XmlElement(nillable = true)
    protected Double averageMark;
    protected Long idExamModuleGroup;
    @XmlElement(nillable = true)
    protected Double maxMark;
    @XmlElement(nillable = true)
    protected Double minimumMark;
    @XmlElement(nillable = true)
    protected String title;

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
     * Obtient la valeur de la propriété idExamModuleGroup.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdExamModuleGroup() {
        return idExamModuleGroup;
    }

    /**
     * Définit la valeur de la propriété idExamModuleGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdExamModuleGroup(Long value) {
        this.idExamModuleGroup = value;
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
