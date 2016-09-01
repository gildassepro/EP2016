
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.parameterweb.serviceapi.ClasseDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.teacherweb.serviceapi.IdentityTeacherDto;


/**
 * <p>Classe Java pour studentEventsDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="studentEventsDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academic_module" type="{http://serviceapi.parameterweb.sepro.org/}academicModuleDto" minOccurs="0"/>
 *         &lt;element name="academic_year" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="allDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="classeProgramm" type="{http://serviceapi.studentweb.sepro.org/}classeProgrammDto" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="event_type" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="idStudentEvents" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="room" type="{http://serviceapi.parameterweb.sepro.org/}classeDto" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="teacher" type="{http://serviceapi.teacherweb.sepro.org/}identityTeacherDto" minOccurs="0"/>
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
@XmlType(name = "studentEventsDto", propOrder = {
    "academicModule",
    "academicYear",
    "allDayInd",
    "classeProgramm",
    "comments",
    "description",
    "enDate",
    "eventType",
    "idStudentEvents",
    "room",
    "startDate",
    "teacher",
    "title"
})
public class StudentEventsDto {

    @XmlElement(name = "academic_module")
    protected AcademicModuleDto academicModule;
    @XmlElement(name = "academic_year")
    protected PopuplistDto academicYear;
    protected Boolean allDayInd;
    protected ClasseProgrammDto classeProgramm;
    protected String comments;
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enDate;
    @XmlElement(name = "event_type")
    protected PopuplistDto eventType;
    protected Long idStudentEvents;
    protected ClasseDto room;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected IdentityTeacherDto teacher;
    protected String title;

    /**
     * Obtient la valeur de la propri�t� academicModule.
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
     * D�finit la valeur de la propri�t� academicModule.
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
     * Obtient la valeur de la propri�t� academicYear.
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
     * D�finit la valeur de la propri�t� academicYear.
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
     * Obtient la valeur de la propri�t� allDayInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllDayInd() {
        return allDayInd;
    }

    /**
     * D�finit la valeur de la propri�t� allDayInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllDayInd(Boolean value) {
        this.allDayInd = value;
    }

    /**
     * Obtient la valeur de la propri�t� classeProgramm.
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
     * D�finit la valeur de la propri�t� classeProgramm.
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
     * Obtient la valeur de la propri�t� description.
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
     * D�finit la valeur de la propri�t� description.
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
     * Obtient la valeur de la propri�t� enDate.
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
     * D�finit la valeur de la propri�t� enDate.
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
     * Obtient la valeur de la propri�t� eventType.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getEventType() {
        return eventType;
    }

    /**
     * D�finit la valeur de la propri�t� eventType.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setEventType(PopuplistDto value) {
        this.eventType = value;
    }

    /**
     * Obtient la valeur de la propri�t� idStudentEvents.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdStudentEvents() {
        return idStudentEvents;
    }

    /**
     * D�finit la valeur de la propri�t� idStudentEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdStudentEvents(Long value) {
        this.idStudentEvents = value;
    }

    /**
     * Obtient la valeur de la propri�t� room.
     * 
     * @return
     *     possible object is
     *     {@link ClasseDto }
     *     
     */
    public ClasseDto getRoom() {
        return room;
    }

    /**
     * D�finit la valeur de la propri�t� room.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasseDto }
     *     
     */
    public void setRoom(ClasseDto value) {
        this.room = value;
    }

    /**
     * Obtient la valeur de la propri�t� startDate.
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
     * D�finit la valeur de la propri�t� startDate.
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

    /**
     * Obtient la valeur de la propri�t� title.
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
     * D�finit la valeur de la propri�t� title.
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
