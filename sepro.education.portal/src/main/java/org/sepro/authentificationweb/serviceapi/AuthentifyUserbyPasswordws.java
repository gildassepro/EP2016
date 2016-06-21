
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour authentifyUserbyPasswordws complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="authentifyUserbyPasswordws">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authDto" type="{http://serviceapi.authentificationweb.sepro.org/}authDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authentifyUserbyPasswordws", propOrder = {
    "authDto"
})
public class AuthentifyUserbyPasswordws {

    protected AuthDto authDto;

    /**
     * Obtient la valeur de la propriété authDto.
     * 
     * @return
     *     possible object is
     *     {@link AuthDto }
     *     
     */
    public AuthDto getAuthDto() {
        return authDto;
    }

    /**
     * Définit la valeur de la propriété authDto.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthDto }
     *     
     */
    public void setAuthDto(AuthDto value) {
        this.authDto = value;
    }

}
