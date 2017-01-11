
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sepro.parameterweb.serviceapi.PopuplistDto;


/**
 * <p>Classe Java pour studentPaymentDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="studentPaymentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classPayment" type="{http://serviceapi.studentweb.sepro.org/}classPaymentDto" minOccurs="0"/>
 *         &lt;element name="idStudentPayment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusStudentPayment" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
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
@XmlType(name = "studentPaymentDto", propOrder = {
    "classPayment",
    "idStudentPayment",
    "statusStudentPayment",
    "student"
})
public class StudentPaymentDto {

    @XmlElement(nillable = true)
    protected ClassPaymentDto classPayment;
    protected Long idStudentPayment;
    @XmlElement(nillable = true)
    protected PopuplistDto statusStudentPayment;
    @XmlElement(nillable = true)
    protected StudentDto student;

    /**
     * Obtient la valeur de la propriété classPayment.
     * 
     * @return
     *     possible object is
     *     {@link ClassPaymentDto }
     *     
     */
    public ClassPaymentDto getClassPayment() {
        return classPayment;
    }

    /**
     * Définit la valeur de la propriété classPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassPaymentDto }
     *     
     */
    public void setClassPayment(ClassPaymentDto value) {
        this.classPayment = value;
    }

    /**
     * Obtient la valeur de la propriété idStudentPayment.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdStudentPayment() {
        return idStudentPayment;
    }

    /**
     * Définit la valeur de la propriété idStudentPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdStudentPayment(Long value) {
        this.idStudentPayment = value;
    }

    /**
     * Obtient la valeur de la propriété statusStudentPayment.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getStatusStudentPayment() {
        return statusStudentPayment;
    }

    /**
     * Définit la valeur de la propriété statusStudentPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setStatusStudentPayment(PopuplistDto value) {
        this.statusStudentPayment = value;
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
