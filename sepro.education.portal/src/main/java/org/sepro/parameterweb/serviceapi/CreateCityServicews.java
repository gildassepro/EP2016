
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createCityServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createCityServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cityDto" type="{http://serviceapi.parameterweb.sepro.org/}cityDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCityServicews", propOrder = {
    "cityDto"
})
public class CreateCityServicews {

    protected CityDto cityDto;

    /**
     * Obtient la valeur de la propriété cityDto.
     * 
     * @return
     *     possible object is
     *     {@link CityDto }
     *     
     */
    public CityDto getCityDto() {
        return cityDto;
    }

    /**
     * Définit la valeur de la propriété cityDto.
     * 
     * @param value
     *     allowed object is
     *     {@link CityDto }
     *     
     */
    public void setCityDto(CityDto value) {
        this.cityDto = value;
    }

}
