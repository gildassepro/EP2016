
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchPhoneFormatServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchPhoneFormatServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneFormatDto" type="{http://serviceapi.parameterweb.sepro.org/}phoneFormatDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPhoneFormatServicews", propOrder = {
    "phoneFormatDto"
})
public class SearchPhoneFormatServicews {

    protected PhoneFormatDto phoneFormatDto;

    /**
     * Obtient la valeur de la propriété phoneFormatDto.
     * 
     * @return
     *     possible object is
     *     {@link PhoneFormatDto }
     *     
     */
    public PhoneFormatDto getPhoneFormatDto() {
        return phoneFormatDto;
    }

    /**
     * Définit la valeur de la propriété phoneFormatDto.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneFormatDto }
     *     
     */
    public void setPhoneFormatDto(PhoneFormatDto value) {
        this.phoneFormatDto = value;
    }

}
