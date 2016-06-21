
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateZipcodeServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateZipcodeServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zipcodeDto" type="{http://serviceapi.parameterweb.sepro.org/}zipcodeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateZipcodeServicews", propOrder = {
    "zipcodeDto"
})
public class UpdateZipcodeServicews {

    protected ZipcodeDto zipcodeDto;

    /**
     * Obtient la valeur de la propriété zipcodeDto.
     * 
     * @return
     *     possible object is
     *     {@link ZipcodeDto }
     *     
     */
    public ZipcodeDto getZipcodeDto() {
        return zipcodeDto;
    }

    /**
     * Définit la valeur de la propriété zipcodeDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipcodeDto }
     *     
     */
    public void setZipcodeDto(ZipcodeDto value) {
        this.zipcodeDto = value;
    }

}
