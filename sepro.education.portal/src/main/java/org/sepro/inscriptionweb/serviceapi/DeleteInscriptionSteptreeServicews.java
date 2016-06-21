
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteInscriptionSteptreeServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteInscriptionSteptreeServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inscriptionSteptreeDto" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionSteptreeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteInscriptionSteptreeServicews", propOrder = {
    "inscriptionSteptreeDto"
})
public class DeleteInscriptionSteptreeServicews {

    protected InscriptionSteptreeDto inscriptionSteptreeDto;

    /**
     * Obtient la valeur de la propriété inscriptionSteptreeDto.
     * 
     * @return
     *     possible object is
     *     {@link InscriptionSteptreeDto }
     *     
     */
    public InscriptionSteptreeDto getInscriptionSteptreeDto() {
        return inscriptionSteptreeDto;
    }

    /**
     * Définit la valeur de la propriété inscriptionSteptreeDto.
     * 
     * @param value
     *     allowed object is
     *     {@link InscriptionSteptreeDto }
     *     
     */
    public void setInscriptionSteptreeDto(InscriptionSteptreeDto value) {
        this.inscriptionSteptreeDto = value;
    }

}
