
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sepro.parameterweb.serviceapi.PopuplistDto;


/**
 * <p>Classe Java pour moduleAcademiExamDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="moduleAcademiExamDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="examModuleGroup" type="{http://serviceapi.studentweb.sepro.org/}examModuleGroupDto" minOccurs="0"/>
 *         &lt;element name="idModuleAcademiExam" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rattrapageMark" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="statusModuleAcademiExam" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
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
@XmlType(name = "moduleAcademiExamDto", propOrder = {
    "comments",
    "examModuleGroup",
    "idModuleAcademiExam",
    "mark",
    "rattrapageMark",
    "statusModuleAcademiExam",
    "student"
})
public class ModuleAcademiExamDto {

    @XmlElement(nillable = true)
    protected String comments;
    @XmlElement(nillable = true)
    protected ExamModuleGroupDto examModuleGroup;
    protected Long idModuleAcademiExam;
    @XmlElement(nillable = true)
    protected Double mark;
    @XmlElement(nillable = true)
    protected Double rattrapageMark;
    @XmlElement(nillable = true)
    protected PopuplistDto statusModuleAcademiExam;
    @XmlElement(nillable = true)
    protected StudentDto student;

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
     * Obtient la valeur de la propri�t� examModuleGroup.
     * 
     * @return
     *     possible object is
     *     {@link ExamModuleGroupDto }
     *     
     */
    public ExamModuleGroupDto getExamModuleGroup() {
        return examModuleGroup;
    }

    /**
     * D�finit la valeur de la propri�t� examModuleGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link ExamModuleGroupDto }
     *     
     */
    public void setExamModuleGroup(ExamModuleGroupDto value) {
        this.examModuleGroup = value;
    }

    /**
     * Obtient la valeur de la propri�t� idModuleAcademiExam.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdModuleAcademiExam() {
        return idModuleAcademiExam;
    }

    /**
     * D�finit la valeur de la propri�t� idModuleAcademiExam.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdModuleAcademiExam(Long value) {
        this.idModuleAcademiExam = value;
    }

    /**
     * Obtient la valeur de la propri�t� mark.
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
     * D�finit la valeur de la propri�t� mark.
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
     * Obtient la valeur de la propri�t� rattrapageMark.
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
     * D�finit la valeur de la propri�t� rattrapageMark.
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
     * Obtient la valeur de la propri�t� statusModuleAcademiExam.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getStatusModuleAcademiExam() {
        return statusModuleAcademiExam;
    }

    /**
     * D�finit la valeur de la propri�t� statusModuleAcademiExam.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setStatusModuleAcademiExam(PopuplistDto value) {
        this.statusModuleAcademiExam = value;
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

}
