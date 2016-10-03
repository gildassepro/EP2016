
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateEventsForumServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateEventsForumServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventsForumDto" type="{http://serviceapi.studentweb.sepro.org/}eventsForumDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEventsForumServicews", propOrder = {
    "eventsForumDto"
})
public class UpdateEventsForumServicews {

    protected EventsForumDto eventsForumDto;

    /**
     * Obtient la valeur de la propriété eventsForumDto.
     * 
     * @return
     *     possible object is
     *     {@link EventsForumDto }
     *     
     */
    public EventsForumDto getEventsForumDto() {
        return eventsForumDto;
    }

    /**
     * Définit la valeur de la propriété eventsForumDto.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsForumDto }
     *     
     */
    public void setEventsForumDto(EventsForumDto value) {
        this.eventsForumDto = value;
    }

}
