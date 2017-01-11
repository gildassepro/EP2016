
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.teacherweb.serviceapi.IdentityTeacherDto;


/**
 * <p>Classe Java pour teacherPresenceDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="teacherPresenceDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualEnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventsStatus" type="{http://serviceapi.studentweb.sepro.org/}eventsStatusDto" minOccurs="0"/>
 *         &lt;element name="idTeacherPresence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="statusTeacher" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="teacher" type="{http://serviceapi.teacherweb.sepro.org/}identityTeacherDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "teacherPresenceDto", propOrder = {
    "actualEnDate",
    "actualStartDate",
    "comments",
    "eventsStatus",
    "idTeacherPresence",
    "rating",
    "statusTeacher",
    "teacher"
})
public class TeacherPresenceDto {

    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualEnDate;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStartDate;
    @XmlElement(nillable = true)
    protected String comments;
    @XmlElement(nillable = true)
    protected EventsStatusDto eventsStatus;
    protected Long idTeacherPresence;
    @XmlElement(nillable = true)
    protected Double rating;
    @XmlElement(nillable = true)
    protected PopuplistDto statusTeacher;
    @XmlElement(nillable = true)
    protected IdentityTeacherDto teacher;

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
     * Obtient la valeur de la propri�t� eventsStatus.
     * 
     * @return
     *     possible object is
     *     {@link EventsStatusDto }
     *     
     */
    public EventsStatusDto getEventsStatus() {
        return eventsStatus;
    }

    /**
     * D�finit la valeur de la propri�t� eventsStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsStatusDto }
     *     
     */
    public void setEventsStatus(EventsStatusDto value) {
        this.eventsStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� idTeacherPresence.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTeacherPresence() {
        return idTeacherPresence;
    }

    /**
     * D�finit la valeur de la propri�t� idTeacherPresence.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTeacherPresence(Long value) {
        this.idTeacherPresence = value;
    }

    /**
     * Obtient la valeur de la propri�t� rating.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRating() {
        return rating;
    }

    /**
     * D�finit la valeur de la propri�t� rating.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRating(Double value) {
        this.rating = value;
    }

    /**
     * Obtient la valeur de la propri�t� statusTeacher.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getStatusTeacher() {
        return statusTeacher;
    }

    /**
     * D�finit la valeur de la propri�t� statusTeacher.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setStatusTeacher(PopuplistDto value) {
        this.statusTeacher = value;
    }

    /**
     * Obtient la valeur de la propri�t� teacher.
     * 
     * @return
     *     possible object is
     *     {@link IdentityTeacherDto }
     *     
     */
    public IdentityTeacherDto getTeacher() {
        return teacher;
    }

    /**
     * D�finit la valeur de la propri�t� teacher.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityTeacherDto }
     *     
     */
    public void setTeacher(IdentityTeacherDto value) {
        this.teacher = value;
    }

}
