
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchPopuplistDtoServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchPopuplistDtoServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPopuplistDtoServicews", propOrder = {
    "entite"
})
public class SearchPopuplistDtoServicews {

    protected String entite;

    /**
     * Obtient la valeur de la propriété entite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntite() {
        return entite;
    }

    /**
     * Définit la valeur de la propriété entite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntite(String value) {
        this.entite = value;
    }

}
