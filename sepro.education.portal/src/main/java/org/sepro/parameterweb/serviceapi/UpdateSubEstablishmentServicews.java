
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateSubEstablishmentServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateSubEstablishmentServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subestablishmentDto" type="{http://serviceapi.parameterweb.sepro.org/}subEstablishmentDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSubEstablishmentServicews", propOrder = {
    "subestablishmentDto"
})
public class UpdateSubEstablishmentServicews {

    protected SubEstablishmentDto subestablishmentDto;

    /**
     * Obtient la valeur de la propriété subestablishmentDto.
     * 
     * @return
     *     possible object is
     *     {@link SubEstablishmentDto }
     *     
     */
    public SubEstablishmentDto getSubestablishmentDto() {
        return subestablishmentDto;
    }

    /**
     * Définit la valeur de la propriété subestablishmentDto.
     * 
     * @param value
     *     allowed object is
     *     {@link SubEstablishmentDto }
     *     
     */
    public void setSubestablishmentDto(SubEstablishmentDto value) {
        this.subestablishmentDto = value;
    }

}
