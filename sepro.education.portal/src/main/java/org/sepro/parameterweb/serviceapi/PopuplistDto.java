
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour popuplistDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="popuplistDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPopuplist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "popuplistDto", propOrder = {
    "entity",
    "idPopuplist",
    "value"
})
public class PopuplistDto {

    protected String entity;
    protected Long idPopuplist;
    protected String value;

    /**
     * Obtient la valeur de la propriété entity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Définit la valeur de la propriété entity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Obtient la valeur de la propriété idPopuplist.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPopuplist() {
        return idPopuplist;
    }

    /**
     * Définit la valeur de la propriété idPopuplist.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPopuplist(Long value) {
        this.idPopuplist = value;
    }

    /**
     * Obtient la valeur de la propriété value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
