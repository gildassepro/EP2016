
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour lockUser complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lockUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userlogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lockUser", propOrder = {
    "userlogin"
})
public class LockUser {

    protected String userlogin;

    /**
     * Obtient la valeur de la propriété userlogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserlogin() {
        return userlogin;
    }

    /**
     * Définit la valeur de la propriété userlogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserlogin(String value) {
        this.userlogin = value;
    }

}
