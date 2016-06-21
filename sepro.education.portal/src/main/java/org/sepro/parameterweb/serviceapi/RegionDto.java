
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour regionDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="regionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://serviceapi.parameterweb.sepro.org/}countryDto" minOccurs="0"/>
 *         &lt;element name="idRegion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="region_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regionDto", propOrder = {
    "country",
    "idRegion",
    "regionCode",
    "regionName"
})
public class RegionDto {

    protected CountryDto country;
    protected Long idRegion;
    @XmlElement(name = "region_code")
    protected String regionCode;
    @XmlElement(name = "region_name", nillable = true)
    protected String regionName;

    /**
     * Obtient la valeur de la propriété country.
     * 
     * @return
     *     possible object is
     *     {@link CountryDto }
     *     
     */
    public CountryDto getCountry() {
        return country;
    }

    /**
     * Définit la valeur de la propriété country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDto }
     *     
     */
    public void setCountry(CountryDto value) {
        this.country = value;
    }

    /**
     * Obtient la valeur de la propriété idRegion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdRegion() {
        return idRegion;
    }

    /**
     * Définit la valeur de la propriété idRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdRegion(Long value) {
        this.idRegion = value;
    }

    /**
     * Obtient la valeur de la propriété regionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Définit la valeur de la propriété regionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

    /**
     * Obtient la valeur de la propriété regionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Définit la valeur de la propriété regionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

}
