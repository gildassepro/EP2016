
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchRoomInventoryServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchRoomInventoryServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomInventoryDto" type="{http://serviceapi.parameterweb.sepro.org/}roomInventoryDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRoomInventoryServicews", propOrder = {
    "roomInventoryDto"
})
public class SearchRoomInventoryServicews {

    protected RoomInventoryDto roomInventoryDto;

    /**
     * Obtient la valeur de la propriété roomInventoryDto.
     * 
     * @return
     *     possible object is
     *     {@link RoomInventoryDto }
     *     
     */
    public RoomInventoryDto getRoomInventoryDto() {
        return roomInventoryDto;
    }

    /**
     * Définit la valeur de la propriété roomInventoryDto.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomInventoryDto }
     *     
     */
    public void setRoomInventoryDto(RoomInventoryDto value) {
        this.roomInventoryDto = value;
    }

}
