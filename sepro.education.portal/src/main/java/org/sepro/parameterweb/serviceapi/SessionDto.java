
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour sessionDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="sessionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academique_year" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="idSession" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="session_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="statusSession" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sessionDto", propOrder = {
    "academiqueYear",
    "endDate",
    "idSession",
    "sessionName",
    "startDate",
    "statusSession"
})
public class SessionDto {

    @XmlElement(name = "academique_year")
    protected PopuplistDto academiqueYear;
    @XmlElement(name = "end_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected Long idSession;
    @XmlElement(name = "session_name")
    protected String sessionName;
    @XmlElement(name = "start_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    protected PopuplistDto statusSession;

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
     * Obtient la valeur de la propriété endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Définit la valeur de la propriété endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Obtient la valeur de la propriété idSession.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSession() {
        return idSession;
    }

    /**
     * Définit la valeur de la propriété idSession.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSession(Long value) {
        this.idSession = value;
    }

    /**
     * Obtient la valeur de la propriété sessionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * Définit la valeur de la propriété sessionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionName(String value) {
        this.sessionName = value;
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
     * Obtient la valeur de la propriété statusSession.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getStatusSession() {
        return statusSession;
    }

    /**
     * Définit la valeur de la propriété statusSession.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setStatusSession(PopuplistDto value) {
        this.statusSession = value;
    }

}
