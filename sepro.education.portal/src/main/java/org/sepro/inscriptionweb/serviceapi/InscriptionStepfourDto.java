
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.sepro.parameterweb.serviceapi.PopuplistDto;


/**
 * <p>Classe Java pour inscriptionStepfourDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="inscriptionStepfourDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactTelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diploma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="grade" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="idInscriptionStepfour" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inscriptionAuthentification" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionAuthentificationDto" minOccurs="0"/>
 *         &lt;element name="nameOfScool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="stepIndicator" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="stepStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="typeOfContact" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inscriptionStepfourDto", propOrder = {
    "contactEmail",
    "contactName",
    "contactTelephoneNumber",
    "diploma",
    "enDate",
    "grade",
    "idInscriptionStepfour",
    "inscriptionAuthentification",
    "nameOfScool",
    "startDate",
    "stepIndicator",
    "stepStartDate",
    "typeOfContact"
})
public class InscriptionStepfourDto {

    @XmlElement(nillable = true)
    protected String contactEmail;
    @XmlElement(nillable = true)
    protected String contactName;
    @XmlElement(nillable = true)
    protected String contactTelephoneNumber;
    @XmlElement(nillable = true)
    protected String diploma;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enDate;
    @XmlElement(nillable = true)
    protected PopuplistDto grade;
    protected Long idInscriptionStepfour;
    protected InscriptionAuthentificationDto inscriptionAuthentification;
    @XmlElement(nillable = true)
    protected String nameOfScool;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    protected Long stepIndicator;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stepStartDate;
    @XmlElement(nillable = true)
    protected PopuplistDto typeOfContact;

    /**
     * Obtient la valeur de la propriété contactEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Définit la valeur de la propriété contactEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Obtient la valeur de la propriété contactName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Définit la valeur de la propriété contactName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Obtient la valeur de la propriété contactTelephoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTelephoneNumber() {
        return contactTelephoneNumber;
    }

    /**
     * Définit la valeur de la propriété contactTelephoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTelephoneNumber(String value) {
        this.contactTelephoneNumber = value;
    }

    /**
     * Obtient la valeur de la propriété diploma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiploma() {
        return diploma;
    }

    /**
     * Définit la valeur de la propriété diploma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiploma(String value) {
        this.diploma = value;
    }

    /**
     * Obtient la valeur de la propriété enDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnDate() {
        return enDate;
    }

    /**
     * Définit la valeur de la propriété enDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnDate(XMLGregorianCalendar value) {
        this.enDate = value;
    }

    /**
     * Obtient la valeur de la propriété grade.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getGrade() {
        return grade;
    }

    /**
     * Définit la valeur de la propriété grade.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setGrade(PopuplistDto value) {
        this.grade = value;
    }

    /**
     * Obtient la valeur de la propriété idInscriptionStepfour.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdInscriptionStepfour() {
        return idInscriptionStepfour;
    }

    /**
     * Définit la valeur de la propriété idInscriptionStepfour.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdInscriptionStepfour(Long value) {
        this.idInscriptionStepfour = value;
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
     * Obtient la valeur de la propriété nameOfScool.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfScool() {
        return nameOfScool;
    }

    /**
     * Définit la valeur de la propriété nameOfScool.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfScool(String value) {
        this.nameOfScool = value;
    }

    /**
     * Obtient la valeur de la propriété startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Définit la valeur de la propriété startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
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
     * Obtient la valeur de la propriété typeOfContact.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getTypeOfContact() {
        return typeOfContact;
    }

    /**
     * Définit la valeur de la propriété typeOfContact.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setTypeOfContact(PopuplistDto value) {
        this.typeOfContact = value;
    }

}
