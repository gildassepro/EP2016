
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createPhoneFormatServicewsResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createPhoneFormatServicewsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://serviceapi.parameterweb.sepro.org/}phoneFormatDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPhoneFormatServicewsResponse", propOrder = {
    "_return"
})
public class CreatePhoneFormatServicewsResponse {

    @XmlElement(name = "return")
    protected PhoneFormatDto _return;

    /**
     * Obtient la valeur de la propri�t� return.
     * 
     * @return
     *     possible object is
     *     {@link PhoneFormatDto }
     *     
     */
    public PhoneFormatDto getReturn() {
        return _return;
    }

    /**
     * D�finit la valeur de la propri�t� return.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneFormatDto }
     *     
     */
    public void setReturn(PhoneFormatDto value) {
        this._return = value;
    }

}
