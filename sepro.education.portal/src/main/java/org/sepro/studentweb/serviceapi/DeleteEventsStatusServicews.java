
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteEventsStatusServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteEventsStatusServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventsStatusDto" type="{http://serviceapi.studentweb.sepro.org/}eventsStatusDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteEventsStatusServicews", propOrder = {
    "eventsStatusDto"
})
public class DeleteEventsStatusServicews {

    protected EventsStatusDto eventsStatusDto;

    /**
     * Obtient la valeur de la propri�t� eventsStatusDto.
     * 
     * @return
     *     possible object is
     *     {@link EventsStatusDto }
     *     
     */
    public EventsStatusDto getEventsStatusDto() {
        return eventsStatusDto;
    }

    /**
     * D�finit la valeur de la propri�t� eventsStatusDto.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsStatusDto }
     *     
     */
    public void setEventsStatusDto(EventsStatusDto value) {
        this.eventsStatusDto = value;
    }

}
