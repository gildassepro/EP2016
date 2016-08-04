
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.sepro.parameterweb.serviceapi.PopuplistDto;


/**
 * <p>Classe Java pour studentCVDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="studentCVDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactTelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diploma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="grade" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="idStudentCV" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nameOfScool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="student" type="{http://serviceapi.studentweb.sepro.org/}studentDto" minOccurs="0"/>
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
@XmlType(name = "studentCVDto", propOrder = {
    "contactEmail",
    "contactName",
    "contactTelephoneNumber",
    "diploma",
    "enDate",
    "grade",
    "idStudentCV",
    "nameOfScool",
    "startDate",
    "student",
    "typeOfContact"
})
public class StudentCVDto {

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
    protected Long idStudentCV;
    @XmlElement(nillable = true)
    protected String nameOfScool;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    protected StudentDto student;
    @XmlElement(nillable = true)
    protected PopuplistDto typeOfContact;

    /**
     * Obtient la valeur de la propri�t� contactEmail.
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
     * D�finit la valeur de la propri�t� contactEmail.
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
     * Obtient la valeur de la propri�t� contactName.
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
     * D�finit la valeur de la propri�t� contactName.
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
     * Obtient la valeur de la propri�t� contactTelephoneNumber.
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
     * D�finit la valeur de la propri�t� contactTelephoneNumber.
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
     * Obtient la valeur de la propri�t� diploma.
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
     * D�finit la valeur de la propri�t� diploma.
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
     * Obtient la valeur de la propri�t� grade.
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
     * D�finit la valeur de la propri�t� grade.
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
     * Obtient la valeur de la propri�t� idStudentCV.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdStudentCV() {
        return idStudentCV;
    }

    /**
     * D�finit la valeur de la propri�t� idStudentCV.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdStudentCV(Long value) {
        this.idStudentCV = value;
    }

    /**
     * Obtient la valeur de la propri�t� nameOfScool.
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
     * D�finit la valeur de la propri�t� nameOfScool.
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
     * Obtient la valeur de la propri�t� typeOfContact.
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
     * D�finit la valeur de la propri�t� typeOfContact.
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
