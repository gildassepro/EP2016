
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateInscriptionStepfourServicewsResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateInscriptionStepfourServicewsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionStepfourDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateInscriptionStepfourServicewsResponse", propOrder = {
    "_return"
})
public class UpdateInscriptionStepfourServicewsResponse {

    @XmlElement(name = "return")
    protected InscriptionStepfourDto _return;

    /**
     * Obtient la valeur de la propriété return.
     * 
     * @return
     *     possible object is
     *     {@link InscriptionStepfourDto }
     *     
     */
    public InscriptionStepfourDto getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     * 
     * @param value
     *     allowed object is
     *     {@link InscriptionStepfourDto }
     *     
     */
    public void setReturn(InscriptionStepfourDto value) {
        this._return = value;
    }

}
