
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchEstablishmentServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchEstablishmentServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="establishmentDto" type="{http://serviceapi.parameterweb.sepro.org/}establishmentDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchEstablishmentServicews", propOrder = {
    "establishmentDto"
})
public class SearchEstablishmentServicews {

    protected EstablishmentDto establishmentDto;

    /**
     * Obtient la valeur de la propriété establishmentDto.
     * 
     * @return
     *     possible object is
     *     {@link EstablishmentDto }
     *     
     */
    public EstablishmentDto getEstablishmentDto() {
        return establishmentDto;
    }

    /**
     * Définit la valeur de la propriété establishmentDto.
     * 
     * @param value
     *     allowed object is
     *     {@link EstablishmentDto }
     *     
     */
    public void setEstablishmentDto(EstablishmentDto value) {
        this.establishmentDto = value;
    }

}
