
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour prospectDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="prospectDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inscriptionAuthentificationDto" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionAuthentificationDto" minOccurs="0"/>
 *         &lt;element name="inscriptionSteponeDto" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionSteponeDto" minOccurs="0"/>
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
@XmlType(name = "prospectDto", propOrder = {
    "inscriptionAuthentificationDto",
    "inscriptionSteponeDto",
    "inscriptionSteptreeDto"
})
public class ProspectDto {

    protected InscriptionAuthentificationDto inscriptionAuthentificationDto;
    protected InscriptionSteponeDto inscriptionSteponeDto;
    protected InscriptionSteptreeDto inscriptionSteptreeDto;

    /**
     * Obtient la valeur de la propri�t� inscriptionAuthentificationDto.
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
     * D�finit la valeur de la propri�t� inscriptionAuthentificationDto.
     * 
     * @param value
     *     allowed object is
     *     {@link InscriptionAuthentificationDto }
     *     
     */
    public void setInscriptionAuthentificationDto(InscriptionAuthentificationDto value) {
        this.inscriptionAuthentificationDto = value;
    }

    /**
     * Obtient la valeur de la propri�t� inscriptionSteponeDto.
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
     * D�finit la valeur de la propri�t� inscriptionSteponeDto.
     * 
     * @param value
     *     allowed object is
     *     {@link InscriptionSteponeDto }
     *     
     */
    public void setInscriptionSteponeDto(InscriptionSteponeDto value) {
        this.inscriptionSteponeDto = value;
    }

    /**
     * Obtient la valeur de la propri�t� inscriptionSteptreeDto.
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
     * D�finit la valeur de la propri�t� inscriptionSteptreeDto.
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
