
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchCountryServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchCountryServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryDto" type="{http://serviceapi.parameterweb.sepro.org/}countryDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchCountryServicews", propOrder = {
    "countryDto"
})
public class SearchCountryServicews {

    protected CountryDto countryDto;

    /**
     * Obtient la valeur de la propriété countryDto.
     * 
     * @return
     *     possible object is
     *     {@link CountryDto }
     *     
     */
    public CountryDto getCountryDto() {
        return countryDto;
    }

    /**
     * Définit la valeur de la propriété countryDto.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDto }
     *     
     */
    public void setCountryDto(CountryDto value) {
        this.countryDto = value;
    }

}
