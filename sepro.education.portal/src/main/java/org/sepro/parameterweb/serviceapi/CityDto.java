
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour cityDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cityDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="region" type="{http://serviceapi.parameterweb.sepro.org/}regionDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cityDto", propOrder = {
    "cityCode",
    "cityName",
    "idCity",
    "region"
})
public class CityDto {

    @XmlElement(name = "city_code")
    protected String cityCode;
    @XmlElement(name = "city_name", nillable = true)
    protected String cityName;
    protected Long idCity;
    protected RegionDto region;

    /**
     * Obtient la valeur de la propri�t� cityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * D�finit la valeur de la propri�t� cityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Obtient la valeur de la propri�t� cityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * D�finit la valeur de la propri�t� cityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Obtient la valeur de la propri�t� idCity.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCity() {
        return idCity;
    }

    /**
     * D�finit la valeur de la propri�t� idCity.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCity(Long value) {
        this.idCity = value;
    }

    /**
     * Obtient la valeur de la propri�t� region.
     * 
     * @return
     *     possible object is
     *     {@link RegionDto }
     *     
     */
    public RegionDto getRegion() {
        return region;
    }

    /**
     * D�finit la valeur de la propri�t� region.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionDto }
     *     
     */
    public void setRegion(RegionDto value) {
        this.region = value;
    }

}
