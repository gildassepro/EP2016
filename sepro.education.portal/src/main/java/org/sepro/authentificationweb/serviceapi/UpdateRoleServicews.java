
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateRoleServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateRoleServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roleDto" type="{http://serviceapi.authentificationweb.sepro.org/}roleDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRoleServicews", propOrder = {
    "roleDto"
})
public class UpdateRoleServicews {

    protected RoleDto roleDto;

    /**
     * Obtient la valeur de la propriété roleDto.
     * 
     * @return
     *     possible object is
     *     {@link RoleDto }
     *     
     */
    public RoleDto getRoleDto() {
        return roleDto;
    }

    /**
     * Définit la valeur de la propriété roleDto.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleDto }
     *     
     */
    public void setRoleDto(RoleDto value) {
        this.roleDto = value;
    }

}
