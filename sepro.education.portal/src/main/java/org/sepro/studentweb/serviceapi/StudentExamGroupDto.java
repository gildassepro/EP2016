
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sepro.parameterweb.serviceapi.PopuplistDto;


/**
 * <p>Classe Java pour studentExamGroupDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="studentExamGroupDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="examGroup" type="{http://serviceapi.studentweb.sepro.org/}examGroupDto" minOccurs="0"/>
 *         &lt;element name="idStudentExamGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rattrapageMark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="statusExam" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
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
@XmlType(name = "studentExamGroupDto", propOrder = {
    "comments",
    "examGroup",
    "idStudentExamGroup",
    "mark",
    "rattrapageMark",
    "statusExam",
    "student"
})
public class StudentExamGroupDto {

    @XmlElement(nillable = true)
    protected String comments;
    protected ExamGroupDto examGroup;
    protected Long idStudentExamGroup;
    @XmlElement(nillable = true)
    protected Double mark;
    @XmlElement(nillable = true)
    protected Double rattrapageMark;
    @XmlElement(nillable = true)
    protected PopuplistDto statusExam;
    @XmlElement(nillable = true)
    protected StudentDto student;

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
     * Obtient la valeur de la propriété idStudentExamGroup.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdStudentExamGroup() {
        return idStudentExamGroup;
    }

    /**
     * Définit la valeur de la propriété idStudentExamGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdStudentExamGroup(Long value) {
        this.idStudentExamGroup = value;
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
     * Obtient la valeur de la propriété statusExam.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getStatusExam() {
        return statusExam;
    }

    /**
     * Définit la valeur de la propriété statusExam.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setStatusExam(PopuplistDto value) {
        this.statusExam = value;
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
