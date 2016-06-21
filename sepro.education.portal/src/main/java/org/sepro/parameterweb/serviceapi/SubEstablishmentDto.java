
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour subEstablishmentDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="subEstablishmentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address_ligne_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_ligne_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_ligne_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_ligne_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="care_of" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://serviceapi.parameterweb.sepro.org/}cityDto" minOccurs="0"/>
 *         &lt;element name="contact_address_ligne_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_address_ligne_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_address_ligne_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_address_ligne_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_care_of" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_city" type="{http://serviceapi.parameterweb.sepro.org/}cityDto" minOccurs="0"/>
 *         &lt;element name="contact_country" type="{http://serviceapi.parameterweb.sepro.org/}countryDto" minOccurs="0"/>
 *         &lt;element name="contact_email_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_fax_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_fist_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_lan_phone_number_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_lan_phone_number_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_last_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_middle_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_region" type="{http://serviceapi.parameterweb.sepro.org/}regionDto" minOccurs="0"/>
 *         &lt;element name="contact_zipcode" type="{http://serviceapi.parameterweb.sepro.org/}zipcodeDto" minOccurs="0"/>
 *         &lt;element name="country" type="{http://serviceapi.parameterweb.sepro.org/}countryDto" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment" type="{http://serviceapi.parameterweb.sepro.org/}establishmentDto" minOccurs="0"/>
 *         &lt;element name="facebook_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSubEstablishmentDto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lan_phone_number_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lan_phone_number_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_address_ligne_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_address_ligne_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_address_ligne_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_address_ligne_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_care_of" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_city" type="{http://serviceapi.parameterweb.sepro.org/}cityDto" minOccurs="0"/>
 *         &lt;element name="manager_country" type="{http://serviceapi.parameterweb.sepro.org/}countryDto" minOccurs="0"/>
 *         &lt;element name="manager_email_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_fax_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_fist_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_lan_phone_number_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_lan_phone_number_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_last_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_middle_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager_region" type="{http://serviceapi.parameterweb.sepro.org/}regionDto" minOccurs="0"/>
 *         &lt;element name="manager_zipcode" type="{http://serviceapi.parameterweb.sepro.org/}zipcodeDto" minOccurs="0"/>
 *         &lt;element name="name_subestablishment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region" type="{http://serviceapi.parameterweb.sepro.org/}regionDto" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="twitter_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="website_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="youtubechannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipcode" type="{http://serviceapi.parameterweb.sepro.org/}zipcodeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subEstablishmentDto", propOrder = {
    "addressLigne1",
    "addressLigne2",
    "addressLigne3",
    "addressLigne4",
    "careOf",
    "city",
    "contactAddressLigne1",
    "contactAddressLigne2",
    "contactAddressLigne3",
    "contactAddressLigne4",
    "contactCareOf",
    "contactCity",
    "contactCountry",
    "contactEmailAddress",
    "contactFaxNumber",
    "contactFistName",
    "contactLanPhoneNumber1",
    "contactLanPhoneNumber2",
    "contactLastName",
    "contactMiddleName",
    "contactPosition",
    "contactRegion",
    "contactZipcode",
    "country",
    "description",
    "emailAddress",
    "establishment",
    "facebookId",
    "faxNumber",
    "idSubEstablishmentDto",
    "lanPhoneNumber1",
    "lanPhoneNumber2",
    "location",
    "managerAddressLigne1",
    "managerAddressLigne2",
    "managerAddressLigne3",
    "managerAddressLigne4",
    "managerCareOf",
    "managerCity",
    "managerCountry",
    "managerEmailAddress",
    "managerFaxNumber",
    "managerFistName",
    "managerLanPhoneNumber1",
    "managerLanPhoneNumber2",
    "managerLastName",
    "managerMiddleName",
    "managerPosition",
    "managerRegion",
    "managerZipcode",
    "nameSubestablishment",
    "region",
    "status",
    "twitterId",
    "websiteAddress",
    "youtubechannel",
    "zipcode"
})
public class SubEstablishmentDto {

    @XmlElement(name = "address_ligne_1", nillable = true)
    protected String addressLigne1;
    @XmlElement(name = "address_ligne_2", nillable = true)
    protected String addressLigne2;
    @XmlElement(name = "address_ligne_3", nillable = true)
    protected String addressLigne3;
    @XmlElement(name = "address_ligne_4", nillable = true)
    protected String addressLigne4;
    @XmlElement(name = "care_of", nillable = true)
    protected String careOf;
    protected CityDto city;
    @XmlElement(name = "contact_address_ligne_1", nillable = true)
    protected String contactAddressLigne1;
    @XmlElement(name = "contact_address_ligne_2", nillable = true)
    protected String contactAddressLigne2;
    @XmlElement(name = "contact_address_ligne_3", nillable = true)
    protected String contactAddressLigne3;
    @XmlElement(name = "contact_address_ligne_4", nillable = true)
    protected String contactAddressLigne4;
    @XmlElement(name = "contact_care_of", nillable = true)
    protected String contactCareOf;
    @XmlElement(name = "contact_city")
    protected CityDto contactCity;
    @XmlElement(name = "contact_country")
    protected CountryDto contactCountry;
    @XmlElement(name = "contact_email_address", nillable = true)
    protected String contactEmailAddress;
    @XmlElement(name = "contact_fax_number", nillable = true)
    protected String contactFaxNumber;
    @XmlElement(name = "contact_fist_name", nillable = true)
    protected String contactFistName;
    @XmlElement(name = "contact_lan_phone_number_1", nillable = true)
    protected String contactLanPhoneNumber1;
    @XmlElement(name = "contact_lan_phone_number_2", nillable = true)
    protected String contactLanPhoneNumber2;
    @XmlElement(name = "contact_last_name", nillable = true)
    protected String contactLastName;
    @XmlElement(name = "contact_middle_name", nillable = true)
    protected String contactMiddleName;
    @XmlElement(name = "contact_position", nillable = true)
    protected String contactPosition;
    @XmlElement(name = "contact_region")
    protected RegionDto contactRegion;
    @XmlElement(name = "contact_zipcode")
    protected ZipcodeDto contactZipcode;
    protected CountryDto country;
    @XmlElement(nillable = true)
    protected String description;
    @XmlElement(name = "email_address", nillable = true)
    protected String emailAddress;
    protected EstablishmentDto establishment;
    @XmlElement(name = "facebook_id", nillable = true)
    protected String facebookId;
    @XmlElement(name = "fax_number", nillable = true)
    protected String faxNumber;
    protected Long idSubEstablishmentDto;
    @XmlElement(name = "lan_phone_number_1", nillable = true)
    protected String lanPhoneNumber1;
    @XmlElement(name = "lan_phone_number_2", nillable = true)
    protected String lanPhoneNumber2;
    @XmlElement(nillable = true)
    protected String location;
    @XmlElement(name = "manager_address_ligne_1", nillable = true)
    protected String managerAddressLigne1;
    @XmlElement(name = "manager_address_ligne_2", nillable = true)
    protected String managerAddressLigne2;
    @XmlElement(name = "manager_address_ligne_3", nillable = true)
    protected String managerAddressLigne3;
    @XmlElement(name = "manager_address_ligne_4", nillable = true)
    protected String managerAddressLigne4;
    @XmlElement(name = "manager_care_of", nillable = true)
    protected String managerCareOf;
    @XmlElement(name = "manager_city")
    protected CityDto managerCity;
    @XmlElement(name = "manager_country")
    protected CountryDto managerCountry;
    @XmlElement(name = "manager_email_address", nillable = true)
    protected String managerEmailAddress;
    @XmlElement(name = "manager_fax_number", nillable = true)
    protected String managerFaxNumber;
    @XmlElement(name = "manager_fist_name", nillable = true)
    protected String managerFistName;
    @XmlElement(name = "manager_lan_phone_number_1", nillable = true)
    protected String managerLanPhoneNumber1;
    @XmlElement(name = "manager_lan_phone_number_2", nillable = true)
    protected String managerLanPhoneNumber2;
    @XmlElement(name = "manager_last_name", nillable = true)
    protected String managerLastName;
    @XmlElement(name = "manager_middle_name", nillable = true)
    protected String managerMiddleName;
    @XmlElement(name = "manager_position", nillable = true)
    protected String managerPosition;
    @XmlElement(name = "manager_region")
    protected RegionDto managerRegion;
    @XmlElement(name = "manager_zipcode")
    protected ZipcodeDto managerZipcode;
    @XmlElement(name = "name_subestablishment")
    protected String nameSubestablishment;
    protected RegionDto region;
    protected Boolean status;
    @XmlElement(name = "twitter_id", nillable = true)
    protected String twitterId;
    @XmlElement(name = "website_address", nillable = true)
    protected String websiteAddress;
    @XmlElement(nillable = true)
    protected String youtubechannel;
    protected ZipcodeDto zipcode;

    /**
     * Obtient la valeur de la propriété addressLigne1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLigne1() {
        return addressLigne1;
    }

    /**
     * Définit la valeur de la propriété addressLigne1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLigne1(String value) {
        this.addressLigne1 = value;
    }

    /**
     * Obtient la valeur de la propriété addressLigne2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLigne2() {
        return addressLigne2;
    }

    /**
     * Définit la valeur de la propriété addressLigne2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLigne2(String value) {
        this.addressLigne2 = value;
    }

    /**
     * Obtient la valeur de la propriété addressLigne3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLigne3() {
        return addressLigne3;
    }

    /**
     * Définit la valeur de la propriété addressLigne3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLigne3(String value) {
        this.addressLigne3 = value;
    }

    /**
     * Obtient la valeur de la propriété addressLigne4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLigne4() {
        return addressLigne4;
    }

    /**
     * Définit la valeur de la propriété addressLigne4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLigne4(String value) {
        this.addressLigne4 = value;
    }

    /**
     * Obtient la valeur de la propriété careOf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOf() {
        return careOf;
    }

    /**
     * Définit la valeur de la propriété careOf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareOf(String value) {
        this.careOf = value;
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
     * Obtient la valeur de la propriété contactAddressLigne1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddressLigne1() {
        return contactAddressLigne1;
    }

    /**
     * Définit la valeur de la propriété contactAddressLigne1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddressLigne1(String value) {
        this.contactAddressLigne1 = value;
    }

    /**
     * Obtient la valeur de la propriété contactAddressLigne2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddressLigne2() {
        return contactAddressLigne2;
    }

    /**
     * Définit la valeur de la propriété contactAddressLigne2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddressLigne2(String value) {
        this.contactAddressLigne2 = value;
    }

    /**
     * Obtient la valeur de la propriété contactAddressLigne3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddressLigne3() {
        return contactAddressLigne3;
    }

    /**
     * Définit la valeur de la propriété contactAddressLigne3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddressLigne3(String value) {
        this.contactAddressLigne3 = value;
    }

    /**
     * Obtient la valeur de la propriété contactAddressLigne4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddressLigne4() {
        return contactAddressLigne4;
    }

    /**
     * Définit la valeur de la propriété contactAddressLigne4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddressLigne4(String value) {
        this.contactAddressLigne4 = value;
    }

    /**
     * Obtient la valeur de la propriété contactCareOf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactCareOf() {
        return contactCareOf;
    }

    /**
     * Définit la valeur de la propriété contactCareOf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactCareOf(String value) {
        this.contactCareOf = value;
    }

    /**
     * Obtient la valeur de la propriété contactCity.
     * 
     * @return
     *     possible object is
     *     {@link CityDto }
     *     
     */
    public CityDto getContactCity() {
        return contactCity;
    }

    /**
     * Définit la valeur de la propriété contactCity.
     * 
     * @param value
     *     allowed object is
     *     {@link CityDto }
     *     
     */
    public void setContactCity(CityDto value) {
        this.contactCity = value;
    }

    /**
     * Obtient la valeur de la propriété contactCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryDto }
     *     
     */
    public CountryDto getContactCountry() {
        return contactCountry;
    }

    /**
     * Définit la valeur de la propriété contactCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDto }
     *     
     */
    public void setContactCountry(CountryDto value) {
        this.contactCountry = value;
    }

    /**
     * Obtient la valeur de la propriété contactEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    /**
     * Définit la valeur de la propriété contactEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmailAddress(String value) {
        this.contactEmailAddress = value;
    }

    /**
     * Obtient la valeur de la propriété contactFaxNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFaxNumber() {
        return contactFaxNumber;
    }

    /**
     * Définit la valeur de la propriété contactFaxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFaxNumber(String value) {
        this.contactFaxNumber = value;
    }

    /**
     * Obtient la valeur de la propriété contactFistName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFistName() {
        return contactFistName;
    }

    /**
     * Définit la valeur de la propriété contactFistName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFistName(String value) {
        this.contactFistName = value;
    }

    /**
     * Obtient la valeur de la propriété contactLanPhoneNumber1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLanPhoneNumber1() {
        return contactLanPhoneNumber1;
    }

    /**
     * Définit la valeur de la propriété contactLanPhoneNumber1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLanPhoneNumber1(String value) {
        this.contactLanPhoneNumber1 = value;
    }

    /**
     * Obtient la valeur de la propriété contactLanPhoneNumber2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLanPhoneNumber2() {
        return contactLanPhoneNumber2;
    }

    /**
     * Définit la valeur de la propriété contactLanPhoneNumber2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLanPhoneNumber2(String value) {
        this.contactLanPhoneNumber2 = value;
    }

    /**
     * Obtient la valeur de la propriété contactLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLastName() {
        return contactLastName;
    }

    /**
     * Définit la valeur de la propriété contactLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLastName(String value) {
        this.contactLastName = value;
    }

    /**
     * Obtient la valeur de la propriété contactMiddleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMiddleName() {
        return contactMiddleName;
    }

    /**
     * Définit la valeur de la propriété contactMiddleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMiddleName(String value) {
        this.contactMiddleName = value;
    }

    /**
     * Obtient la valeur de la propriété contactPosition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPosition() {
        return contactPosition;
    }

    /**
     * Définit la valeur de la propriété contactPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPosition(String value) {
        this.contactPosition = value;
    }

    /**
     * Obtient la valeur de la propriété contactRegion.
     * 
     * @return
     *     possible object is
     *     {@link RegionDto }
     *     
     */
    public RegionDto getContactRegion() {
        return contactRegion;
    }

    /**
     * Définit la valeur de la propriété contactRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionDto }
     *     
     */
    public void setContactRegion(RegionDto value) {
        this.contactRegion = value;
    }

    /**
     * Obtient la valeur de la propriété contactZipcode.
     * 
     * @return
     *     possible object is
     *     {@link ZipcodeDto }
     *     
     */
    public ZipcodeDto getContactZipcode() {
        return contactZipcode;
    }

    /**
     * Définit la valeur de la propriété contactZipcode.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipcodeDto }
     *     
     */
    public void setContactZipcode(ZipcodeDto value) {
        this.contactZipcode = value;
    }

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
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propriété emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Définit la valeur de la propriété emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Obtient la valeur de la propriété establishment.
     * 
     * @return
     *     possible object is
     *     {@link EstablishmentDto }
     *     
     */
    public EstablishmentDto getEstablishment() {
        return establishment;
    }

    /**
     * Définit la valeur de la propriété establishment.
     * 
     * @param value
     *     allowed object is
     *     {@link EstablishmentDto }
     *     
     */
    public void setEstablishment(EstablishmentDto value) {
        this.establishment = value;
    }

    /**
     * Obtient la valeur de la propriété facebookId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebookId() {
        return facebookId;
    }

    /**
     * Définit la valeur de la propriété facebookId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebookId(String value) {
        this.facebookId = value;
    }

    /**
     * Obtient la valeur de la propriété faxNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Définit la valeur de la propriété faxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Obtient la valeur de la propriété idSubEstablishmentDto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSubEstablishmentDto() {
        return idSubEstablishmentDto;
    }

    /**
     * Définit la valeur de la propriété idSubEstablishmentDto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSubEstablishmentDto(Long value) {
        this.idSubEstablishmentDto = value;
    }

    /**
     * Obtient la valeur de la propriété lanPhoneNumber1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanPhoneNumber1() {
        return lanPhoneNumber1;
    }

    /**
     * Définit la valeur de la propriété lanPhoneNumber1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanPhoneNumber1(String value) {
        this.lanPhoneNumber1 = value;
    }

    /**
     * Obtient la valeur de la propriété lanPhoneNumber2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanPhoneNumber2() {
        return lanPhoneNumber2;
    }

    /**
     * Définit la valeur de la propriété lanPhoneNumber2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanPhoneNumber2(String value) {
        this.lanPhoneNumber2 = value;
    }

    /**
     * Obtient la valeur de la propriété location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Définit la valeur de la propriété location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Obtient la valeur de la propriété managerAddressLigne1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerAddressLigne1() {
        return managerAddressLigne1;
    }

    /**
     * Définit la valeur de la propriété managerAddressLigne1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerAddressLigne1(String value) {
        this.managerAddressLigne1 = value;
    }

    /**
     * Obtient la valeur de la propriété managerAddressLigne2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerAddressLigne2() {
        return managerAddressLigne2;
    }

    /**
     * Définit la valeur de la propriété managerAddressLigne2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerAddressLigne2(String value) {
        this.managerAddressLigne2 = value;
    }

    /**
     * Obtient la valeur de la propriété managerAddressLigne3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerAddressLigne3() {
        return managerAddressLigne3;
    }

    /**
     * Définit la valeur de la propriété managerAddressLigne3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerAddressLigne3(String value) {
        this.managerAddressLigne3 = value;
    }

    /**
     * Obtient la valeur de la propriété managerAddressLigne4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerAddressLigne4() {
        return managerAddressLigne4;
    }

    /**
     * Définit la valeur de la propriété managerAddressLigne4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerAddressLigne4(String value) {
        this.managerAddressLigne4 = value;
    }

    /**
     * Obtient la valeur de la propriété managerCareOf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerCareOf() {
        return managerCareOf;
    }

    /**
     * Définit la valeur de la propriété managerCareOf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerCareOf(String value) {
        this.managerCareOf = value;
    }

    /**
     * Obtient la valeur de la propriété managerCity.
     * 
     * @return
     *     possible object is
     *     {@link CityDto }
     *     
     */
    public CityDto getManagerCity() {
        return managerCity;
    }

    /**
     * Définit la valeur de la propriété managerCity.
     * 
     * @param value
     *     allowed object is
     *     {@link CityDto }
     *     
     */
    public void setManagerCity(CityDto value) {
        this.managerCity = value;
    }

    /**
     * Obtient la valeur de la propriété managerCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryDto }
     *     
     */
    public CountryDto getManagerCountry() {
        return managerCountry;
    }

    /**
     * Définit la valeur de la propriété managerCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDto }
     *     
     */
    public void setManagerCountry(CountryDto value) {
        this.managerCountry = value;
    }

    /**
     * Obtient la valeur de la propriété managerEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerEmailAddress() {
        return managerEmailAddress;
    }

    /**
     * Définit la valeur de la propriété managerEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerEmailAddress(String value) {
        this.managerEmailAddress = value;
    }

    /**
     * Obtient la valeur de la propriété managerFaxNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerFaxNumber() {
        return managerFaxNumber;
    }

    /**
     * Définit la valeur de la propriété managerFaxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerFaxNumber(String value) {
        this.managerFaxNumber = value;
    }

    /**
     * Obtient la valeur de la propriété managerFistName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerFistName() {
        return managerFistName;
    }

    /**
     * Définit la valeur de la propriété managerFistName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerFistName(String value) {
        this.managerFistName = value;
    }

    /**
     * Obtient la valeur de la propriété managerLanPhoneNumber1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerLanPhoneNumber1() {
        return managerLanPhoneNumber1;
    }

    /**
     * Définit la valeur de la propriété managerLanPhoneNumber1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerLanPhoneNumber1(String value) {
        this.managerLanPhoneNumber1 = value;
    }

    /**
     * Obtient la valeur de la propriété managerLanPhoneNumber2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerLanPhoneNumber2() {
        return managerLanPhoneNumber2;
    }

    /**
     * Définit la valeur de la propriété managerLanPhoneNumber2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerLanPhoneNumber2(String value) {
        this.managerLanPhoneNumber2 = value;
    }

    /**
     * Obtient la valeur de la propriété managerLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerLastName() {
        return managerLastName;
    }

    /**
     * Définit la valeur de la propriété managerLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerLastName(String value) {
        this.managerLastName = value;
    }

    /**
     * Obtient la valeur de la propriété managerMiddleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerMiddleName() {
        return managerMiddleName;
    }

    /**
     * Définit la valeur de la propriété managerMiddleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerMiddleName(String value) {
        this.managerMiddleName = value;
    }

    /**
     * Obtient la valeur de la propriété managerPosition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerPosition() {
        return managerPosition;
    }

    /**
     * Définit la valeur de la propriété managerPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerPosition(String value) {
        this.managerPosition = value;
    }

    /**
     * Obtient la valeur de la propriété managerRegion.
     * 
     * @return
     *     possible object is
     *     {@link RegionDto }
     *     
     */
    public RegionDto getManagerRegion() {
        return managerRegion;
    }

    /**
     * Définit la valeur de la propriété managerRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionDto }
     *     
     */
    public void setManagerRegion(RegionDto value) {
        this.managerRegion = value;
    }

    /**
     * Obtient la valeur de la propriété managerZipcode.
     * 
     * @return
     *     possible object is
     *     {@link ZipcodeDto }
     *     
     */
    public ZipcodeDto getManagerZipcode() {
        return managerZipcode;
    }

    /**
     * Définit la valeur de la propriété managerZipcode.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipcodeDto }
     *     
     */
    public void setManagerZipcode(ZipcodeDto value) {
        this.managerZipcode = value;
    }

    /**
     * Obtient la valeur de la propriété nameSubestablishment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSubestablishment() {
        return nameSubestablishment;
    }

    /**
     * Définit la valeur de la propriété nameSubestablishment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSubestablishment(String value) {
        this.nameSubestablishment = value;
    }

    /**
     * Obtient la valeur de la propriété region.
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
     * Définit la valeur de la propriété region.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionDto }
     *     
     */
    public void setRegion(RegionDto value) {
        this.region = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété twitterId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitterId() {
        return twitterId;
    }

    /**
     * Définit la valeur de la propriété twitterId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitterId(String value) {
        this.twitterId = value;
    }

    /**
     * Obtient la valeur de la propriété websiteAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsiteAddress() {
        return websiteAddress;
    }

    /**
     * Définit la valeur de la propriété websiteAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsiteAddress(String value) {
        this.websiteAddress = value;
    }

    /**
     * Obtient la valeur de la propriété youtubechannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYoutubechannel() {
        return youtubechannel;
    }

    /**
     * Définit la valeur de la propriété youtubechannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYoutubechannel(String value) {
        this.youtubechannel = value;
    }

    /**
     * Obtient la valeur de la propriété zipcode.
     * 
     * @return
     *     possible object is
     *     {@link ZipcodeDto }
     *     
     */
    public ZipcodeDto getZipcode() {
        return zipcode;
    }

    /**
     * Définit la valeur de la propriété zipcode.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipcodeDto }
     *     
     */
    public void setZipcode(ZipcodeDto value) {
        this.zipcode = value;
    }

}
