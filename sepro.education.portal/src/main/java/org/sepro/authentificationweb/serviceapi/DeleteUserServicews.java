
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteUserServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteUserServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userDto" type="{http://serviceapi.authentificationweb.sepro.org/}userDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteUserServicews", propOrder = {
    "userDto"
})
public class DeleteUserServicews {

    protected UserDto userDto;

    /**
     * Obtient la valeur de la propri�t� userDto.
     * 
     * @return
     *     possible object is
     *     {@link UserDto }
     *     
     */
    public UserDto getUserDto() {
        return userDto;
    }

    /**
     * D�finit la valeur de la propri�t� userDto.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDto }
     *     
     */
    public void setUserDto(UserDto value) {
        this.userDto = value;
    }

}
