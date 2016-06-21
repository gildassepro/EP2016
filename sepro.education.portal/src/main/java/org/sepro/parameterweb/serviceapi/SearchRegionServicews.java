
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchRegionServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchRegionServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regionDto" type="{http://serviceapi.parameterweb.sepro.org/}regionDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRegionServicews", propOrder = {
    "regionDto"
})
public class SearchRegionServicews {

    protected RegionDto regionDto;

    /**
     * Obtient la valeur de la propriété regionDto.
     * 
     * @return
     *     possible object is
     *     {@link RegionDto }
     *     
     */
    public RegionDto getRegionDto() {
        return regionDto;
    }

    /**
     * Définit la valeur de la propriété regionDto.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionDto }
     *     
     */
    public void setRegionDto(RegionDto value) {
        this.regionDto = value;
    }

}
