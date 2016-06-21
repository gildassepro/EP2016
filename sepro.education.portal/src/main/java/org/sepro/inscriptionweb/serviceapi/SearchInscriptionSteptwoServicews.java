
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchInscriptionSteptwoServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchInscriptionSteptwoServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inscriptionSteptwoDto" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionSteptwoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchInscriptionSteptwoServicews", propOrder = {
    "inscriptionSteptwoDto"
})
public class SearchInscriptionSteptwoServicews {

    protected InscriptionSteptwoDto inscriptionSteptwoDto;

    /**
     * Obtient la valeur de la propriété inscriptionSteptwoDto.
     * 
     * @return
     *     possible object is
     *     {@link InscriptionSteptwoDto }
     *     
     */
    public InscriptionSteptwoDto getInscriptionSteptwoDto() {
        return inscriptionSteptwoDto;
    }

    /**
     * Définit la valeur de la propriété inscriptionSteptwoDto.
     * 
     * @param value
     *     allowed object is
     *     {@link InscriptionSteptwoDto }
     *     
     */
    public void setInscriptionSteptwoDto(InscriptionSteptwoDto value) {
        this.inscriptionSteptwoDto = value;
    }

}
