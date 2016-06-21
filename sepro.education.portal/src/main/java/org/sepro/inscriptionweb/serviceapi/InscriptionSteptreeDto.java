
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.ProgrammeCalendarDto;


/**
 * <p>Classe Java pour inscriptionSteptreeDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="inscriptionSteptreeDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academic_sector" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="academic_year" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idInscriptionSteptree" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inscriptionAuthentification" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionAuthentificationDto" minOccurs="0"/>
 *         &lt;element name="nameOfDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programmeCalendar" type="{http://serviceapi.parameterweb.sepro.org/}programmeCalendarDto" minOccurs="0"/>
 *         &lt;element name="stepIndicator" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="stepStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="typeOfDocument" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inscriptionSteptreeDto", propOrder = {
    "academicSector",
    "academicYear",
    "description",
    "idInscriptionSteptree",
    "inscriptionAuthentification",
    "nameOfDocument",
    "programmeCalendar",
    "stepIndicator",
    "stepStartDate",
    "typeOfDocument"
})
public class InscriptionSteptreeDto {

    @XmlElement(name = "academic_sector", nillable = true)
    protected PopuplistDto academicSector;
    @XmlElement(name = "academic_year", nillable = true)
    protected PopuplistDto academicYear;
    @XmlElement(nillable = true)
    protected String description;
    protected Long idInscriptionSteptree;
    @XmlElement(nillable = true)
    protected InscriptionAuthentificationDto inscriptionAuthentification;
    @XmlElement(nillable = true)
    protected String nameOfDocument;
    @XmlElement(nillable = true)
    protected ProgrammeCalendarDto programmeCalendar;
    protected Long stepIndicator;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stepStartDate;
    @XmlElement(nillable = true)
    protected PopuplistDto typeOfDocument;

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
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propriété idInscriptionSteptree.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdInscriptionSteptree() {
        return idInscriptionSteptree;
    }

    /**
     * Définit la valeur de la propriété idInscriptionSteptree.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdInscriptionSteptree(Long value) {
        this.idInscriptionSteptree = value;
    }

    /**
     * Obtient la valeur de la propriété inscriptionAuthentification.
     * 
     * @return
     *     possible object is
     *     {@link InscriptionAuthentificationDto }
     *     
     */
    public InscriptionAuthentificationDto getInscriptionAuthentification() {
        return inscriptionAuthentification;
    }

    /**
     * Définit la valeur de la propriété inscriptionAuthentification.
     * 
     * @param value
     *     allowed object is
     *     {@link InscriptionAuthentificationDto }
     *     
     */
    public void setInscriptionAuthentification(InscriptionAuthentificationDto value) {
        this.inscriptionAuthentification = value;
    }

    /**
     * Obtient la valeur de la propriété nameOfDocument.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfDocument() {
        return nameOfDocument;
    }

    /**
     * Définit la valeur de la propriété nameOfDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfDocument(String value) {
        this.nameOfDocument = value;
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
     * Obtient la valeur de la propriété stepIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStepIndicator() {
        return stepIndicator;
    }

    /**
     * Définit la valeur de la propriété stepIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStepIndicator(Long value) {
        this.stepIndicator = value;
    }

    /**
     * Obtient la valeur de la propriété stepStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStepStartDate() {
        return stepStartDate;
    }

    /**
     * Définit la valeur de la propriété stepStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStepStartDate(XMLGregorianCalendar value) {
        this.stepStartDate = value;
    }

    /**
     * Obtient la valeur de la propriété typeOfDocument.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getTypeOfDocument() {
        return typeOfDocument;
    }

    /**
     * Définit la valeur de la propriété typeOfDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setTypeOfDocument(PopuplistDto value) {
        this.typeOfDocument = value;
    }

}
