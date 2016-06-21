
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateInscriptionAuthServicewsResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateInscriptionAuthServicewsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionAuthentificationDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateInscriptionAuthServicewsResponse", propOrder = {
    "_return"
})
public class UpdateInscriptionAuthServicewsResponse {

    @XmlElement(name = "return")
    protected InscriptionAuthentificationDto _return;

    /**
     * Obtient la valeur de la propriété return.
     * 
     * @return
     *     possible object is
     *     {@link InscriptionAuthentificationDto }
     *     
     */
    public InscriptionAuthentificationDto getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     * 
     * @param value
     *     allowed object is
     *     {@link InscriptionAuthentificationDto }
     *     
     */
    public void setReturn(InscriptionAuthentificationDto value) {
        this._return = value;
    }

}
