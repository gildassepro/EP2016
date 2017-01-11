
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.sepro.parameterweb.serviceapi.PopuplistDto;


/**
 * <p>Classe Java pour examDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="examDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualEnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="averageMark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="coefficient" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="examGroup" type="{http://serviceapi.studentweb.sepro.org/}examGroupDto" minOccurs="0"/>
 *         &lt;element name="idExam" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxMark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minimumMark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="studentEvents" type="{http://serviceapi.studentweb.sepro.org/}studentEventsDto" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeExam" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "examDto", propOrder = {
    "actualEnDate",
    "actualStartDate",
    "averageMark",
    "coefficient",
    "comments",
    "examGroup",
    "idExam",
    "maxMark",
    "minimumMark",
    "studentEvents",
    "title",
    "typeExam"
})
public class ExamDto {

    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualEnDate;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStartDate;
    @XmlElement(nillable = true)
    protected Double averageMark;
    @XmlElement(nillable = true)
    protected Double coefficient;
    @XmlElement(nillable = true)
    protected String comments;
    @XmlElement(nillable = true)
    protected ExamGroupDto examGroup;
    protected Long idExam;
    @XmlElement(nillable = true)
    protected Double maxMark;
    @XmlElement(nillable = true)
    protected Double minimumMark;
    @XmlElement(nillable = true)
    protected StudentEventsDto studentEvents;
    @XmlElement(nillable = true)
    protected String title;
    @XmlElement(nillable = true)
    protected PopuplistDto typeExam;

    /**
     * Obtient la valeur de la propriété actualEnDate.
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
     * Définit la valeur de la propriété actualEnDate.
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
     * Obtient la valeur de la propriété actualStartDate.
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
     * Définit la valeur de la propriété actualStartDate.
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
     * Obtient la valeur de la propriété comments.
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
     * Définit la valeur de la propriété comments.
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
     * Obtient la valeur de la propriété idExam.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdExam() {
        return idExam;
    }

    /**
     * Définit la valeur de la propriété idExam.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdExam(Long value) {
        this.idExam = value;
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
     * Obtient la valeur de la propriété studentEvents.
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
     * Définit la valeur de la propriété studentEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentEventsDto }
     *     
     */
    public void setStudentEvents(StudentEventsDto value) {
        this.studentEvents = value;
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

    /**
     * Obtient la valeur de la propriété typeExam.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getTypeExam() {
        return typeExam;
    }

    /**
     * Définit la valeur de la propriété typeExam.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setTypeExam(PopuplistDto value) {
        this.typeExam = value;
    }

}
