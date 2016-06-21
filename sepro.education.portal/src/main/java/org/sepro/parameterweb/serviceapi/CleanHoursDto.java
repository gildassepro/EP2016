
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour cleanHoursDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cleanHoursDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCleanHours" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cleanHoursDto", propOrder = {
    "hours",
    "idCleanHours"
})
public class CleanHoursDto {

    protected String hours;
    protected Long idCleanHours;

    /**
     * Obtient la valeur de la propriété hours.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHours() {
        return hours;
    }

    /**
     * Définit la valeur de la propriété hours.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHours(String value) {
        this.hours = value;
    }

    /**
     * Obtient la valeur de la propriété idCleanHours.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCleanHours() {
        return idCleanHours;
    }

    /**
     * Définit la valeur de la propriété idCleanHours.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCleanHours(Long value) {
        this.idCleanHours = value;
    }

}
