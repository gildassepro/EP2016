
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createProfileServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createProfileServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profileDto" type="{http://serviceapi.authentificationweb.sepro.org/}profileDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createProfileServicews", propOrder = {
    "profileDto"
})
public class CreateProfileServicews {

    protected ProfileDto profileDto;

    /**
     * Obtient la valeur de la propriété profileDto.
     * 
     * @return
     *     possible object is
     *     {@link ProfileDto }
     *     
     */
    public ProfileDto getProfileDto() {
        return profileDto;
    }

    /**
     * Définit la valeur de la propriété profileDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileDto }
     *     
     */
    public void setProfileDto(ProfileDto value) {
        this.profileDto = value;
    }

}
