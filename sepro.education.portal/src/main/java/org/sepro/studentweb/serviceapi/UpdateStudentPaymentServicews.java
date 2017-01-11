
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateStudentPaymentServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateStudentPaymentServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentPaymentDto" type="{http://serviceapi.studentweb.sepro.org/}studentPaymentDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStudentPaymentServicews", propOrder = {
    "studentPaymentDto"
})
public class UpdateStudentPaymentServicews {

    protected StudentPaymentDto studentPaymentDto;

    /**
     * Obtient la valeur de la propriété studentPaymentDto.
     * 
     * @return
     *     possible object is
     *     {@link StudentPaymentDto }
     *     
     */
    public StudentPaymentDto getStudentPaymentDto() {
        return studentPaymentDto;
    }

    /**
     * Définit la valeur de la propriété studentPaymentDto.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPaymentDto }
     *     
     */
    public void setStudentPaymentDto(StudentPaymentDto value) {
        this.studentPaymentDto = value;
    }

}
