
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createInscriptionStepfourServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createInscriptionStepfourServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inscriptionStepfourDto" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionStepfourDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createInscriptionStepfourServicews", propOrder = {
    "inscriptionStepfourDto"
})
public class CreateInscriptionStepfourServicews {

    protected InscriptionStepfourDto inscriptionStepfourDto;

    /**
     * Obtient la valeur de la propri�t� inscriptionStepfourDto.
     * 
     * @return
     *     possible object is
     *     {@link InscriptionStepfourDto }
     *     
     */
    public InscriptionStepfourDto getInscriptionStepfourDto() {
        return inscriptionStepfourDto;
    }

    /**
     * D�finit la valeur de la propri�t� inscriptionStepfourDto.
     * 
     * @param value
     *     allowed object is
     *     {@link InscriptionStepfourDto }
     *     
     */
    public void setInscriptionStepfourDto(InscriptionStepfourDto value) {
        this.inscriptionStepfourDto = value;
    }

}
