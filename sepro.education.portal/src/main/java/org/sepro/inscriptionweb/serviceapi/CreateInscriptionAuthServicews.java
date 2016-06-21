
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createInscriptionAuthServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createInscriptionAuthServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inscriptionAuthentificationDto" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionAuthentificationDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createInscriptionAuthServicews", propOrder = {
    "inscriptionAuthentificationDto"
})
public class CreateInscriptionAuthServicews {

    protected InscriptionAuthentificationDto inscriptionAuthentificationDto;

    /**
     * Obtient la valeur de la propriété inscriptionAuthentificationDto.
     * 
     * @return
     *     possible object is
     *     {@link InscriptionAuthentificationDto }
     *     
     */
    public InscriptionAuthentificationDto getInscriptionAuthentificationDto() {
        return inscriptionAuthentificationDto;
    }

    /**
     * Définit la valeur de la propriété inscriptionAuthentificationDto.
     * 
     * @param value
     *     allowed object is
     *     {@link InscriptionAuthentificationDto }
     *     
     */
    public void setInscriptionAuthentificationDto(InscriptionAuthentificationDto value) {
        this.inscriptionAuthentificationDto = value;
    }

}
