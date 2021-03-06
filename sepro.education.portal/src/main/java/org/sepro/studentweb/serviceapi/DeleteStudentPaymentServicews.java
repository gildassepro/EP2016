
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteStudentPaymentServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteStudentPaymentServicews">
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
@XmlType(name = "deleteStudentPaymentServicews", propOrder = {
    "studentPaymentDto"
})
public class DeleteStudentPaymentServicews {

    protected StudentPaymentDto studentPaymentDto;

    /**
     * Obtient la valeur de la propri�t� studentPaymentDto.
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
     * D�finit la valeur de la propri�t� studentPaymentDto.
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
