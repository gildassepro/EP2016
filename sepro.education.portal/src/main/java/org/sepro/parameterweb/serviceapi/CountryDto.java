
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour countryDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="countryDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alpha2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alpha3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCountry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lanPhoneFormat" type="{http://serviceapi.parameterweb.sepro.org/}phoneFormatDto" minOccurs="0"/>
 *         &lt;element name="language" type="{http://serviceapi.parameterweb.sepro.org/}languageDto" minOccurs="0"/>
 *         &lt;element name="mobilePhoneFormat" type="{http://serviceapi.parameterweb.sepro.org/}phoneFormatDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countryDto", propOrder = {
    "alpha2",
    "alpha3",
    "countryName",
    "idCountry",
    "isoCountryCode",
    "lanPhoneFormat",
    "language",
    "mobilePhoneFormat"
})
public class CountryDto {

    protected String alpha2;
    protected String alpha3;
    protected String countryName;
    protected Long idCountry;
    protected String isoCountryCode;
    @XmlElement(nillable = true)
    protected PhoneFormatDto lanPhoneFormat;
    protected LanguageDto language;
    @XmlElement(nillable = true)
    protected PhoneFormatDto mobilePhoneFormat;

    /**
     * Obtient la valeur de la propriété alpha2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlpha2() {
        return alpha2;
    }

    /**
     * Définit la valeur de la propriété alpha2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlpha2(String value) {
        this.alpha2 = value;
    }

    /**
     * Obtient la valeur de la propriété alpha3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlpha3() {
        return alpha3;
    }

    /**
     * Définit la valeur de la propriété alpha3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlpha3(String value) {
        this.alpha3 = value;
    }

    /**
     * Obtient la valeur de la propriété countryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Définit la valeur de la propriété countryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Obtient la valeur de la propriété idCountry.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCountry() {
        return idCountry;
    }

    /**
     * Définit la valeur de la propriété idCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCountry(Long value) {
        this.idCountry = value;
    }

    /**
     * Obtient la valeur de la propriété isoCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoCountryCode() {
        return isoCountryCode;
    }

    /**
     * Définit la valeur de la propriété isoCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoCountryCode(String value) {
        this.isoCountryCode = value;
    }

    /**
     * Obtient la valeur de la propriété lanPhoneFormat.
     * 
     * @return
     *     possible object is
     *     {@link PhoneFormatDto }
     *     
     */
    public PhoneFormatDto getLanPhoneFormat() {
        return lanPhoneFormat;
    }

    /**
     * Définit la valeur de la propriété lanPhoneFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneFormatDto }
     *     
     */
    public void setLanPhoneFormat(PhoneFormatDto value) {
        this.lanPhoneFormat = value;
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDto }
     *     
     */
    public LanguageDto getLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDto }
     *     
     */
    public void setLanguage(LanguageDto value) {
        this.language = value;
    }

    /**
     * Obtient la valeur de la propriété mobilePhoneFormat.
     * 
     * @return
     *     possible object is
     *     {@link PhoneFormatDto }
     *     
     */
    public PhoneFormatDto getMobilePhoneFormat() {
        return mobilePhoneFormat;
    }

    /**
     * Définit la valeur de la propriété mobilePhoneFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneFormatDto }
     *     
     */
    public void setMobilePhoneFormat(PhoneFormatDto value) {
        this.mobilePhoneFormat = value;
    }

}
