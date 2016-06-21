
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour zipcodeDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� areaName.
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
     * D�finit la valeur de la propri�t� areaName.
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
     * Obtient la valeur de la propri�t� city.
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
     * D�finit la valeur de la propri�t� city.
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
     * Obtient la valeur de la propri�t� idZipcode.
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
     * D�finit la valeur de la propri�t� idZipcode.
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
     * Obtient la valeur de la propri�t� zipCode.
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
     * D�finit la valeur de la propri�t� zipCode.
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
