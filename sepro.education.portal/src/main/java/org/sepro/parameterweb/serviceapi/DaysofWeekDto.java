
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour daysofWeekDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="daysofWeekDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDayofWeek" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "daysofWeekDto", propOrder = {
    "days",
    "idDayofWeek"
})
public class DaysofWeekDto {

    protected String days;
    protected Long idDayofWeek;

    /**
     * Obtient la valeur de la propriété days.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDays() {
        return days;
    }

    /**
     * Définit la valeur de la propriété days.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDays(String value) {
        this.days = value;
    }

    /**
     * Obtient la valeur de la propriété idDayofWeek.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDayofWeek() {
        return idDayofWeek;
    }

    /**
     * Définit la valeur de la propriété idDayofWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDayofWeek(Long value) {
        this.idDayofWeek = value;
    }

}
