
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sepro.parameterweb.serviceapi.PopuplistDto;


/**
 * <p>Classe Java pour classeProgrammExamDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="classeProgrammExamDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classeProgramm" type="{http://serviceapi.studentweb.sepro.org/}classeProgrammDto" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idClasseProgrammExam" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rattrapageMark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="statusClasseProgrammExam" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="student" type="{http://serviceapi.studentweb.sepro.org/}studentDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classeProgrammExamDto", propOrder = {
    "classeProgramm",
    "comments",
    "idClasseProgrammExam",
    "mark",
    "rattrapageMark",
    "statusClasseProgrammExam",
    "student"
})
public class ClasseProgrammExamDto {

    @XmlElement(nillable = true)
    protected ClasseProgrammDto classeProgramm;
    @XmlElement(nillable = true)
    protected String comments;
    protected Long idClasseProgrammExam;
    @XmlElement(nillable = true)
    protected Double mark;
    @XmlElement(nillable = true)
    protected Double rattrapageMark;
    @XmlElement(nillable = true)
    protected PopuplistDto statusClasseProgrammExam;
    @XmlElement(nillable = true)
    protected StudentDto student;

    /**
     * Obtient la valeur de la propriété classeProgramm.
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
     * Définit la valeur de la propriété classeProgramm.
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
     * Obtient la valeur de la propriété idClasseProgrammExam.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdClasseProgrammExam() {
        return idClasseProgrammExam;
    }

    /**
     * Définit la valeur de la propriété idClasseProgrammExam.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdClasseProgrammExam(Long value) {
        this.idClasseProgrammExam = value;
    }

    /**
     * Obtient la valeur de la propriété mark.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMark() {
        return mark;
    }

    /**
     * Définit la valeur de la propriété mark.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMark(Double value) {
        this.mark = value;
    }

    /**
     * Obtient la valeur de la propriété rattrapageMark.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRattrapageMark() {
        return rattrapageMark;
    }

    /**
     * Définit la valeur de la propriété rattrapageMark.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRattrapageMark(Double value) {
        this.rattrapageMark = value;
    }

    /**
     * Obtient la valeur de la propriété statusClasseProgrammExam.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getStatusClasseProgrammExam() {
        return statusClasseProgrammExam;
    }

    /**
     * Définit la valeur de la propriété statusClasseProgrammExam.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setStatusClasseProgrammExam(PopuplistDto value) {
        this.statusClasseProgrammExam = value;
    }

    /**
     * Obtient la valeur de la propriété student.
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
     * Définit la valeur de la propriété student.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentDto }
     *     
     */
    public void setStudent(StudentDto value) {
        this.student = value;
    }

}
