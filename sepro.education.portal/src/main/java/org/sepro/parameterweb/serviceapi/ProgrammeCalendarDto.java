
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour programmeCalendarDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="programmeCalendarDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academique_year" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="idProgrammeCalendar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="programme" type="{http://serviceapi.parameterweb.sepro.org/}programmeDto" minOccurs="0"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "programmeCalendarDto", propOrder = {
    "academiqueYear",
    "endDate",
    "idProgrammeCalendar",
    "programme",
    "startDate"
})
public class ProgrammeCalendarDto {

    @XmlElement(name = "academique_year")
    protected PopuplistDto academiqueYear;
    @XmlElement(name = "end_date", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected Long idProgrammeCalendar;
    protected ProgrammeDto programme;
    @XmlElement(name = "start_date", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;

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
     * Obtient la valeur de la propriété idProgrammeCalendar.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProgrammeCalendar() {
        return idProgrammeCalendar;
    }

    /**
     * Définit la valeur de la propriété idProgrammeCalendar.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProgrammeCalendar(Long value) {
        this.idProgrammeCalendar = value;
    }

    /**
     * Obtient la valeur de la propriété programme.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammeDto }
     *     
     */
    public ProgrammeDto getProgramme() {
        return programme;
    }

    /**
     * Définit la valeur de la propriété programme.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammeDto }
     *     
     */
    public void setProgramme(ProgrammeDto value) {
        this.programme = value;
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

}
