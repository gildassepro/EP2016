
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteSessionServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteSessionServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionDto" type="{http://serviceapi.parameterweb.sepro.org/}sessionDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteSessionServicews", propOrder = {
    "sessionDto"
})
public class DeleteSessionServicews {

    protected SessionDto sessionDto;

    /**
     * Obtient la valeur de la propriété sessionDto.
     * 
     * @return
     *     possible object is
     *     {@link SessionDto }
     *     
     */
    public SessionDto getSessionDto() {
        return sessionDto;
    }

    /**
     * Définit la valeur de la propriété sessionDto.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionDto }
     *     
     */
    public void setSessionDto(SessionDto value) {
        this.sessionDto = value;
    }

}
