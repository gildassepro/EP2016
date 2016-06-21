
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour zipcodeDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="zipcodeDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="area_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://serviceapi.parameterweb.sepro.org/}cityDto" minOccurs="0"/>
 *         &lt;element name="idZipcode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="zip_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zipcodeDto", propOrder = {
    "areaName",
    "city",
    "idZipcode",
    "zipCode"
})
public class ZipcodeDto {

    @XmlElement(name = "area_name", nillable = true)
    protected String areaName;
    protected CityDto city;
    protected Long idZipcode;
    @XmlElement(name = "zip_code")
    protected String zipCode;

    /**
     * Obtient la valeur de la propriété areaName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * Définit la valeur de la propriété areaName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaName(String value) {
        this.areaName = value;
    }

    /**
     * Obtient la valeur de la propriété city.
     * 
     * @return
     *     possible object is
     *     {@link CityDto }
     *     
     */
    public CityDto getCity() {
        return city;
    }

    /**
     * Définit la valeur de la propriété city.
     * 
     * @param value
     *     allowed object is
     *     {@link CityDto }
     *     
     */
    public void setCity(CityDto value) {
        this.city = value;
    }

    /**
     * Obtient la valeur de la propriété idZipcode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdZipcode() {
        return idZipcode;
    }

    /**
     * Définit la valeur de la propriété idZipcode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdZipcode(Long value) {
        this.idZipcode = value;
    }

    /**
     * Obtient la valeur de la propriété zipCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Définit la valeur de la propriété zipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
