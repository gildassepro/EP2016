
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteMenuServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteMenuServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="menuDto" type="{http://serviceapi.authentificationweb.sepro.org/}menuDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteMenuServicews", propOrder = {
    "menuDto"
})
public class DeleteMenuServicews {

    protected MenuDto menuDto;

    /**
     * Obtient la valeur de la propriété menuDto.
     * 
     * @return
     *     possible object is
     *     {@link MenuDto }
     *     
     */
    public MenuDto getMenuDto() {
        return menuDto;
    }

    /**
     * Définit la valeur de la propriété menuDto.
     * 
     * @param value
     *     allowed object is
     *     {@link MenuDto }
     *     
     */
    public void setMenuDto(MenuDto value) {
        this.menuDto = value;
    }

}
