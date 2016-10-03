
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.sepro.parameterweb.serviceapi.PopuplistDto;


/**
 * <p>Classe Java pour eventsStatusDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="eventsStatusDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualEnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEventsStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusEvent" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="studentEvents" type="{http://serviceapi.studentweb.sepro.org/}studentEventsDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventsStatusDto", propOrder = {
    "actualEnDate",
    "actualStartDate",
    "comments",
    "idEventsStatus",
    "statusEvent",
    "studentEvents"
})
public class EventsStatusDto {

    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualEnDate;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStartDate;
    @XmlElement(nillable = true)
    protected String comments;
    protected Long idEventsStatus;
    @XmlElement(nillable = true)
    protected PopuplistDto statusEvent;
    @XmlElement(nillable = true)
    protected StudentEventsDto studentEvents;

    /**
     * Obtient la valeur de la propri�t� actualEnDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualEnDate() {
        return actualEnDate;
    }

    /**
     * D�finit la valeur de la propri�t� actualEnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualEnDate(XMLGregorianCalendar value) {
        this.actualEnDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� actualStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualStartDate() {
        return actualStartDate;
    }

    /**
     * D�finit la valeur de la propri�t� actualStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualStartDate(XMLGregorianCalendar value) {
        this.actualStartDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * D�finit la valeur de la propri�t� comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtient la valeur de la propri�t� idEventsStatus.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEventsStatus() {
        return idEventsStatus;
    }

    /**
     * D�finit la valeur de la propri�t� idEventsStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEventsStatus(Long value) {
        this.idEventsStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� statusEvent.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getStatusEvent() {
        return statusEvent;
    }

    /**
     * D�finit la valeur de la propri�t� statusEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setStatusEvent(PopuplistDto value) {
        this.statusEvent = value;
    }

    /**
     * Obtient la valeur de la propri�t� studentEvents.
     * 
     * @return
     *     possible object is
     *     {@link StudentEventsDto }
     *     
     */
    public StudentEventsDto getStudentEvents() {
        return studentEvents;
    }

    /**
     * D�finit la valeur de la propri�t� studentEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentEventsDto }
     *     
     */
    public void setStudentEvents(StudentEventsDto value) {
        this.studentEvents = value;
    }

}
