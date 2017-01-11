
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateClassPaymentServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateClassPaymentServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classPaymentDto" type="{http://serviceapi.studentweb.sepro.org/}classPaymentDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateClassPaymentServicews", propOrder = {
    "classPaymentDto"
})
public class UpdateClassPaymentServicews {

    protected ClassPaymentDto classPaymentDto;

    /**
     * Obtient la valeur de la propriété classPaymentDto.
     * 
     * @return
     *     possible object is
     *     {@link ClassPaymentDto }
     *     
     */
    public ClassPaymentDto getClassPaymentDto() {
        return classPaymentDto;
    }

    /**
     * Définit la valeur de la propriété classPaymentDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassPaymentDto }
     *     
     */
    public void setClassPaymentDto(ClassPaymentDto value) {
        this.classPaymentDto = value;
    }

}
