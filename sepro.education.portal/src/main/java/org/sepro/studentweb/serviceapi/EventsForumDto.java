
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sepro.teacherweb.serviceapi.IdentityTeacherDto;


/**
 * <p>Classe Java pour eventsForumDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="eventsForumDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventsStatus" type="{http://serviceapi.studentweb.sepro.org/}eventsStatusDto" minOccurs="0"/>
 *         &lt;element name="idEventsForum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="student" type="{http://serviceapi.studentweb.sepro.org/}studentDto" minOccurs="0"/>
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
@XmlType(name = "eventsForumDto", propOrder = {
    "comments",
    "eventsStatus",
    "idEventsForum",
    "rating",
    "student",
    "teacher"
})
public class EventsForumDto {

    @XmlElement(nillable = true)
    protected String comments;
    @XmlElement(nillable = true)
    protected EventsStatusDto eventsStatus;
    protected Long idEventsForum;
    @XmlElement(nillable = true)
    protected Long rating;
    @XmlElement(nillable = true)
    protected StudentDto student;
    @XmlElement(nillable = true)
    protected IdentityTeacherDto teacher;

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
     * Obtient la valeur de la propri�t� idEventsForum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEventsForum() {
        return idEventsForum;
    }

    /**
     * D�finit la valeur de la propri�t� idEventsForum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEventsForum(Long value) {
        this.idEventsForum = value;
    }

    /**
     * Obtient la valeur de la propri�t� rating.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRating() {
        return rating;
    }

    /**
     * D�finit la valeur de la propri�t� rating.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRating(Long value) {
        this.rating = value;
    }

    /**
     * Obtient la valeur de la propri�t� student.
     * 
     * @return
     *     possible object is
     *     {@link StudentDto }
     *     
     */
    public StudentDto getStudent() {
        return student;
    }

    /**
     * D�finit la valeur de la propri�t� student.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentDto }
     *     
     */
    public void setStudent(StudentDto value) {
        this.student = value;
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
