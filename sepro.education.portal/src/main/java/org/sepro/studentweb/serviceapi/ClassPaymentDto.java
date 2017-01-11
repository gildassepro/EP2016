
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.sepro.parameterweb.serviceapi.PopuplistDto;


/**
 * <p>Classe Java pour classPaymentDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="classPaymentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academic_year" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="classeProgramm" type="{http://serviceapi.studentweb.sepro.org/}classeProgrammDto" minOccurs="0"/>
 *         &lt;element name="idClassPayment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inscription_fees" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classPaymentDto", propOrder = {
    "academicYear",
    "amount",
    "classeProgramm",
    "idClassPayment",
    "inscriptionFees",
    "month"
})
public class ClassPaymentDto {

    @XmlElement(name = "academic_year", nillable = true)
    protected PopuplistDto academicYear;
    @XmlElement(nillable = true)
    protected Double amount;
    @XmlElement(nillable = true)
    protected ClasseProgrammDto classeProgramm;
    protected Long idClassPayment;
    @XmlElement(name = "inscription_fees", nillable = true)
    protected Double inscriptionFees;
    @XmlElement(nillable = true)
    protected Long month;

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
     * Obtient la valeur de la propri�t� amount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * D�finit la valeur de la propri�t� amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
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
     * Obtient la valeur de la propri�t� idClassPayment.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdClassPayment() {
        return idClassPayment;
    }

    /**
     * D�finit la valeur de la propri�t� idClassPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdClassPayment(Long value) {
        this.idClassPayment = value;
    }

    /**
     * Obtient la valeur de la propri�t� inscriptionFees.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInscriptionFees() {
        return inscriptionFees;
    }

    /**
     * D�finit la valeur de la propri�t� inscriptionFees.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInscriptionFees(Double value) {
        this.inscriptionFees = value;
    }

    /**
     * Obtient la valeur de la propri�t� month.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonth() {
        return month;
    }

    /**
     * D�finit la valeur de la propri�t� month.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonth(Long value) {
        this.month = value;
    }

}
