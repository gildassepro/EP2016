
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteInscriptionSteponeServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteInscriptionSteponeServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inscriptionSteponeDto" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionSteponeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteInscriptionSteponeServicews", propOrder = {
    "inscriptionSteponeDto"
})
public class DeleteInscriptionSteponeServicews {

    protected InscriptionSteponeDto inscriptionSteponeDto;

    /**
     * Obtient la valeur de la propriété inscriptionSteponeDto.
     * 
     * @return
     *     possible object is
     *     {@link InscriptionSteponeDto }
     *     
     */
    public InscriptionSteponeDto getInscriptionSteponeDto() {
        return inscriptionSteponeDto;
    }

    /**
     * Définit la valeur de la propriété inscriptionSteponeDto.
     * 
     * @param value
     *     allowed object is
     *     {@link InscriptionSteponeDto }
     *     
     */
    public void setInscriptionSteponeDto(InscriptionSteponeDto value) {
        this.inscriptionSteponeDto = value;
    }

}
