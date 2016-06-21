
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour establishmentDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="establishmentDto">
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
 *         &lt;element name="facebook_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="founder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEstablishment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="name_establishment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_address_ligne_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_address_ligne_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_address_ligne_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_address_ligne_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_care_of" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_city" type="{http://serviceapi.parameterweb.sepro.org/}cityDto" minOccurs="0"/>
 *         &lt;element name="owner_country" type="{http://serviceapi.parameterweb.sepro.org/}countryDto" minOccurs="0"/>
 *         &lt;element name="owner_email_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_fax_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_fist_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_lan_phone_number_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_lan_phone_number_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_last_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_middle_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner_region" type="{http://serviceapi.parameterweb.sepro.org/}regionDto" minOccurs="0"/>
 *         &lt;element name="owner_zipcode" type="{http://serviceapi.parameterweb.sepro.org/}zipcodeDto" minOccurs="0"/>
 *         &lt;element name="patent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region" type="{http://serviceapi.parameterweb.sepro.org/}regionDto" minOccurs="0"/>
 *         &lt;element name="registration_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="twitter_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="website_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="welcome_words" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year_of_creation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "establishmentDto", propOrder = {
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
    "facebookId",
    "faxNumber",
    "founder",
    "idEstablishment",
    "initials",
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
    "nameEstablishment",
    "ownerAddressLigne1",
    "ownerAddressLigne2",
    "ownerAddressLigne3",
    "ownerAddressLigne4",
    "ownerCareOf",
    "ownerCity",
    "ownerCountry",
    "ownerEmailAddress",
    "ownerFaxNumber",
    "ownerFistName",
    "ownerLanPhoneNumber1",
    "ownerLanPhoneNumber2",
    "ownerLastName",
    "ownerMiddleName",
    "ownerPosition",
    "ownerRegion",
    "ownerZipcode",
    "patent",
    "region",
    "registrationName",
    "twitterId",
    "websiteAddress",
    "welcomeWords",
    "yearOfCreation",
    "youtubechannel",
    "zipcode"
})
public class EstablishmentDto {

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
    @XmlElement(name = "facebook_id", nillable = true)
    protected String facebookId;
    @XmlElement(name = "fax_number", nillable = true)
    protected String faxNumber;
    @XmlElement(nillable = true)
    protected String founder;
    protected Long idEstablishment;
    @XmlElement(nillable = true)
    protected String initials;
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
    @XmlElement(name = "name_establishment")
    protected String nameEstablishment;
    @XmlElement(name = "owner_address_ligne_1", nillable = true)
    protected String ownerAddressLigne1;
    @XmlElement(name = "owner_address_ligne_2", nillable = true)
    protected String ownerAddressLigne2;
    @XmlElement(name = "owner_address_ligne_3", nillable = true)
    protected String ownerAddressLigne3;
    @XmlElement(name = "owner_address_ligne_4", nillable = true)
    protected String ownerAddressLigne4;
    @XmlElement(name = "owner_care_of", nillable = true)
    protected String ownerCareOf;
    @XmlElement(name = "owner_city")
    protected CityDto ownerCity;
    @XmlElement(name = "owner_country")
    protected CountryDto ownerCountry;
    @XmlElement(name = "owner_email_address", nillable = true)
    protected String ownerEmailAddress;
    @XmlElement(name = "owner_fax_number", nillable = true)
    protected String ownerFaxNumber;
    @XmlElement(name = "owner_fist_name", nillable = true)
    protected String ownerFistName;
    @XmlElement(name = "owner_lan_phone_number_1", nillable = true)
    protected String ownerLanPhoneNumber1;
    @XmlElement(name = "owner_lan_phone_number_2", nillable = true)
    protected String ownerLanPhoneNumber2;
    @XmlElement(name = "owner_last_name", nillable = true)
    protected String ownerLastName;
    @XmlElement(name = "owner_middle_name", nillable = true)
    protected String ownerMiddleName;
    @XmlElement(name = "owner_position", nillable = true)
    protected String ownerPosition;
    @XmlElement(name = "owner_region")
    protected RegionDto ownerRegion;
    @XmlElement(name = "owner_zipcode")
    protected ZipcodeDto ownerZipcode;
    protected String patent;
    protected RegionDto region;
    @XmlElement(name = "registration_name", nillable = true)
    protected String registrationName;
    @XmlElement(name = "twitter_id", nillable = true)
    protected String twitterId;
    @XmlElement(name = "website_address", nillable = true)
    protected String websiteAddress;
    @XmlElement(name = "welcome_words", nillable = true)
    protected String welcomeWords;
    @XmlElement(name = "year_of_creation")
    protected String yearOfCreation;
    @XmlElement(nillable = true)
    protected String youtubechannel;
    protected ZipcodeDto zipcode;

    /**
     * Obtient la valeur de la propri�t� addressLigne1.
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
     * D�finit la valeur de la propri�t� addressLigne1.
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
     * Obtient la valeur de la propri�t� addressLigne2.
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
     * D�finit la valeur de la propri�t� addressLigne2.
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
     * Obtient la valeur de la propri�t� addressLigne3.
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
     * D�finit la valeur de la propri�t� addressLigne3.
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
     * Obtient la valeur de la propri�t� addressLigne4.
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
     * D�finit la valeur de la propri�t� addressLigne4.
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
     * Obtient la valeur de la propri�t� careOf.
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
     * D�finit la valeur de la propri�t� careOf.
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
     * Obtient la valeur de la propri�t� contactAddressLigne1.
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
     * D�finit la valeur de la propri�t� contactAddressLigne1.
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
     * Obtient la valeur de la propri�t� contactAddressLigne2.
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
     * D�finit la valeur de la propri�t� contactAddressLigne2.
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
     * Obtient la valeur de la propri�t� contactAddressLigne3.
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
     * D�finit la valeur de la propri�t� contactAddressLigne3.
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
     * Obtient la valeur de la propri�t� contactAddressLigne4.
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
     * D�finit la valeur de la propri�t� contactAddressLigne4.
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
     * Obtient la valeur de la propri�t� contactCareOf.
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
     * D�finit la valeur de la propri�t� contactCareOf.
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
     * Obtient la valeur de la propri�t� contactCity.
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
     * D�finit la valeur de la propri�t� contactCity.
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
     * Obtient la valeur de la propri�t� contactCountry.
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
     * D�finit la valeur de la propri�t� contactCountry.
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
     * Obtient la valeur de la propri�t� contactEmailAddress.
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
     * D�finit la valeur de la propri�t� contactEmailAddress.
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
     * Obtient la valeur de la propri�t� contactFaxNumber.
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
     * D�finit la valeur de la propri�t� contactFaxNumber.
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
     * Obtient la valeur de la propri�t� contactFistName.
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
     * D�finit la valeur de la propri�t� contactFistName.
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
     * Obtient la valeur de la propri�t� contactLanPhoneNumber1.
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
     * D�finit la valeur de la propri�t� contactLanPhoneNumber1.
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
     * Obtient la valeur de la propri�t� contactLanPhoneNumber2.
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
     * D�finit la valeur de la propri�t� contactLanPhoneNumber2.
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
     * Obtient la valeur de la propri�t� contactLastName.
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
     * D�finit la valeur de la propri�t� contactLastName.
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
     * Obtient la valeur de la propri�t� contactMiddleName.
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
     * D�finit la valeur de la propri�t� contactMiddleName.
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
     * Obtient la valeur de la propri�t� contactPosition.
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
     * D�finit la valeur de la propri�t� contactPosition.
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
     * Obtient la valeur de la propri�t� contactRegion.
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
     * D�finit la valeur de la propri�t� contactRegion.
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
     * Obtient la valeur de la propri�t� contactZipcode.
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
     * D�finit la valeur de la propri�t� contactZipcode.
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
     * Obtient la valeur de la propri�t� country.
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
     * D�finit la valeur de la propri�t� country.
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
     * Obtient la valeur de la propri�t� description.
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
     * D�finit la valeur de la propri�t� description.
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
     * Obtient la valeur de la propri�t� emailAddress.
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
     * D�finit la valeur de la propri�t� emailAddress.
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
     * Obtient la valeur de la propri�t� facebookId.
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
     * D�finit la valeur de la propri�t� facebookId.
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
     * Obtient la valeur de la propri�t� faxNumber.
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
     * D�finit la valeur de la propri�t� faxNumber.
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
     * Obtient la valeur de la propri�t� founder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFounder() {
        return founder;
    }

    /**
     * D�finit la valeur de la propri�t� founder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFounder(String value) {
        this.founder = value;
    }

    /**
     * Obtient la valeur de la propri�t� idEstablishment.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEstablishment() {
        return idEstablishment;
    }

    /**
     * D�finit la valeur de la propri�t� idEstablishment.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEstablishment(Long value) {
        this.idEstablishment = value;
    }

    /**
     * Obtient la valeur de la propri�t� initials.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * D�finit la valeur de la propri�t� initials.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Obtient la valeur de la propri�t� lanPhoneNumber1.
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
     * D�finit la valeur de la propri�t� lanPhoneNumber1.
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
     * Obtient la valeur de la propri�t� lanPhoneNumber2.
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
     * D�finit la valeur de la propri�t� lanPhoneNumber2.
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
     * Obtient la valeur de la propri�t� location.
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
     * D�finit la valeur de la propri�t� location.
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
     * Obtient la valeur de la propri�t� managerAddressLigne1.
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
     * D�finit la valeur de la propri�t� managerAddressLigne1.
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
     * Obtient la valeur de la propri�t� managerAddressLigne2.
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
     * D�finit la valeur de la propri�t� managerAddressLigne2.
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
     * Obtient la valeur de la propri�t� managerAddressLigne3.
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
     * D�finit la valeur de la propri�t� managerAddressLigne3.
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
     * Obtient la valeur de la propri�t� managerAddressLigne4.
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
     * D�finit la valeur de la propri�t� managerAddressLigne4.
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
     * Obtient la valeur de la propri�t� managerCareOf.
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
     * D�finit la valeur de la propri�t� managerCareOf.
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
     * Obtient la valeur de la propri�t� managerCity.
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
     * D�finit la valeur de la propri�t� managerCity.
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
     * Obtient la valeur de la propri�t� managerCountry.
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
     * D�finit la valeur de la propri�t� managerCountry.
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
     * Obtient la valeur de la propri�t� managerEmailAddress.
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
     * D�finit la valeur de la propri�t� managerEmailAddress.
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
     * Obtient la valeur de la propri�t� managerFaxNumber.
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
     * D�finit la valeur de la propri�t� managerFaxNumber.
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
     * Obtient la valeur de la propri�t� managerFistName.
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
     * D�finit la valeur de la propri�t� managerFistName.
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
     * Obtient la valeur de la propri�t� managerLanPhoneNumber1.
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
     * D�finit la valeur de la propri�t� managerLanPhoneNumber1.
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
     * Obtient la valeur de la propri�t� managerLanPhoneNumber2.
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
     * D�finit la valeur de la propri�t� managerLanPhoneNumber2.
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
     * Obtient la valeur de la propri�t� managerLastName.
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
     * D�finit la valeur de la propri�t� managerLastName.
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
     * Obtient la valeur de la propri�t� managerMiddleName.
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
     * D�finit la valeur de la propri�t� managerMiddleName.
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
     * Obtient la valeur de la propri�t� managerPosition.
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
     * D�finit la valeur de la propri�t� managerPosition.
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
     * Obtient la valeur de la propri�t� managerRegion.
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
     * D�finit la valeur de la propri�t� managerRegion.
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
     * Obtient la valeur de la propri�t� managerZipcode.
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
     * D�finit la valeur de la propri�t� managerZipcode.
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
     * Obtient la valeur de la propri�t� nameEstablishment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEstablishment() {
        return nameEstablishment;
    }

    /**
     * D�finit la valeur de la propri�t� nameEstablishment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEstablishment(String value) {
        this.nameEstablishment = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerAddressLigne1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAddressLigne1() {
        return ownerAddressLigne1;
    }

    /**
     * D�finit la valeur de la propri�t� ownerAddressLigne1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAddressLigne1(String value) {
        this.ownerAddressLigne1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerAddressLigne2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAddressLigne2() {
        return ownerAddressLigne2;
    }

    /**
     * D�finit la valeur de la propri�t� ownerAddressLigne2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAddressLigne2(String value) {
        this.ownerAddressLigne2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerAddressLigne3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAddressLigne3() {
        return ownerAddressLigne3;
    }

    /**
     * D�finit la valeur de la propri�t� ownerAddressLigne3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAddressLigne3(String value) {
        this.ownerAddressLigne3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerAddressLigne4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAddressLigne4() {
        return ownerAddressLigne4;
    }

    /**
     * D�finit la valeur de la propri�t� ownerAddressLigne4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAddressLigne4(String value) {
        this.ownerAddressLigne4 = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerCareOf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCareOf() {
        return ownerCareOf;
    }

    /**
     * D�finit la valeur de la propri�t� ownerCareOf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCareOf(String value) {
        this.ownerCareOf = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerCity.
     * 
     * @return
     *     possible object is
     *     {@link CityDto }
     *     
     */
    public CityDto getOwnerCity() {
        return ownerCity;
    }

    /**
     * D�finit la valeur de la propri�t� ownerCity.
     * 
     * @param value
     *     allowed object is
     *     {@link CityDto }
     *     
     */
    public void setOwnerCity(CityDto value) {
        this.ownerCity = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryDto }
     *     
     */
    public CountryDto getOwnerCountry() {
        return ownerCountry;
    }

    /**
     * D�finit la valeur de la propri�t� ownerCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDto }
     *     
     */
    public void setOwnerCountry(CountryDto value) {
        this.ownerCountry = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerEmailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerEmailAddress() {
        return ownerEmailAddress;
    }

    /**
     * D�finit la valeur de la propri�t� ownerEmailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerEmailAddress(String value) {
        this.ownerEmailAddress = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerFaxNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerFaxNumber() {
        return ownerFaxNumber;
    }

    /**
     * D�finit la valeur de la propri�t� ownerFaxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerFaxNumber(String value) {
        this.ownerFaxNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerFistName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerFistName() {
        return ownerFistName;
    }

    /**
     * D�finit la valeur de la propri�t� ownerFistName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerFistName(String value) {
        this.ownerFistName = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerLanPhoneNumber1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerLanPhoneNumber1() {
        return ownerLanPhoneNumber1;
    }

    /**
     * D�finit la valeur de la propri�t� ownerLanPhoneNumber1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerLanPhoneNumber1(String value) {
        this.ownerLanPhoneNumber1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerLanPhoneNumber2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerLanPhoneNumber2() {
        return ownerLanPhoneNumber2;
    }

    /**
     * D�finit la valeur de la propri�t� ownerLanPhoneNumber2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerLanPhoneNumber2(String value) {
        this.ownerLanPhoneNumber2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerLastName() {
        return ownerLastName;
    }

    /**
     * D�finit la valeur de la propri�t� ownerLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerLastName(String value) {
        this.ownerLastName = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerMiddleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerMiddleName() {
        return ownerMiddleName;
    }

    /**
     * D�finit la valeur de la propri�t� ownerMiddleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerMiddleName(String value) {
        this.ownerMiddleName = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerPosition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerPosition() {
        return ownerPosition;
    }

    /**
     * D�finit la valeur de la propri�t� ownerPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerPosition(String value) {
        this.ownerPosition = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerRegion.
     * 
     * @return
     *     possible object is
     *     {@link RegionDto }
     *     
     */
    public RegionDto getOwnerRegion() {
        return ownerRegion;
    }

    /**
     * D�finit la valeur de la propri�t� ownerRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionDto }
     *     
     */
    public void setOwnerRegion(RegionDto value) {
        this.ownerRegion = value;
    }

    /**
     * Obtient la valeur de la propri�t� ownerZipcode.
     * 
     * @return
     *     possible object is
     *     {@link ZipcodeDto }
     *     
     */
    public ZipcodeDto getOwnerZipcode() {
        return ownerZipcode;
    }

    /**
     * D�finit la valeur de la propri�t� ownerZipcode.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipcodeDto }
     *     
     */
    public void setOwnerZipcode(ZipcodeDto value) {
        this.ownerZipcode = value;
    }

    /**
     * Obtient la valeur de la propri�t� patent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatent() {
        return patent;
    }

    /**
     * D�finit la valeur de la propri�t� patent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatent(String value) {
        this.patent = value;
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

    /**
     * Obtient la valeur de la propri�t� registrationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationName() {
        return registrationName;
    }

    /**
     * D�finit la valeur de la propri�t� registrationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationName(String value) {
        this.registrationName = value;
    }

    /**
     * Obtient la valeur de la propri�t� twitterId.
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
     * D�finit la valeur de la propri�t� twitterId.
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
     * Obtient la valeur de la propri�t� websiteAddress.
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
     * D�finit la valeur de la propri�t� websiteAddress.
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
     * Obtient la valeur de la propri�t� welcomeWords.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWelcomeWords() {
        return welcomeWords;
    }

    /**
     * D�finit la valeur de la propri�t� welcomeWords.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWelcomeWords(String value) {
        this.welcomeWords = value;
    }

    /**
     * Obtient la valeur de la propri�t� yearOfCreation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearOfCreation() {
        return yearOfCreation;
    }

    /**
     * D�finit la valeur de la propri�t� yearOfCreation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearOfCreation(String value) {
        this.yearOfCreation = value;
    }

    /**
     * Obtient la valeur de la propri�t� youtubechannel.
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
     * D�finit la valeur de la propri�t� youtubechannel.
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
     * Obtient la valeur de la propri�t� zipcode.
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
     * D�finit la valeur de la propri�t� zipcode.
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
