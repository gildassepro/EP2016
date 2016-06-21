
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour roleDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="roleDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idRole" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="roleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roleDto", propOrder = {
    "idRole",
    "roleName"
})
public class RoleDto {

    protected Long idRole;
    protected String roleName;

    /**
     * Obtient la valeur de la propriété idRole.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdRole() {
        return idRole;
    }

    /**
     * Définit la valeur de la propriété idRole.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdRole(Long value) {
        this.idRole = value;
    }

    /**
     * Obtient la valeur de la propriété roleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Définit la valeur de la propriété roleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

}
