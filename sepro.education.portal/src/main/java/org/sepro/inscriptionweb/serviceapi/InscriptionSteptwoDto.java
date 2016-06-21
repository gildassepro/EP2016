
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.sepro.parameterweb.serviceapi.CityDto;
import org.sepro.parameterweb.serviceapi.CountryDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
import org.sepro.parameterweb.serviceapi.ZipcodeDto;


/**
 * <p>Classe Java pour inscriptionSteptwoDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="inscriptionSteptwoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address_ligne_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_ligne_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_ligne_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_ligne_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityAddress" type="{http://serviceapi.parameterweb.sepro.org/}cityDto" minOccurs="0"/>
 *         &lt;element name="countryAddress" type="{http://serviceapi.parameterweb.sepro.org/}countryDto" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idInscriptionSteptwo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inscriptionAuthentification" type="{http://serviceapi.inscriptionweb.sepro.org/}inscriptionAuthentificationDto" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionAddress" type="{http://serviceapi.parameterweb.sepro.org/}regionDto" minOccurs="0"/>
 *         &lt;element name="relationship" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="stepIndicator" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="stepStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="typeOfContact" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="zipcodeAddress" type="{http://serviceapi.parameterweb.sepro.org/}zipcodeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inscriptionSteptwoDto", propOrder = {
    "addressLigne1",
    "addressLigne2",
    "addressLigne3",
    "addressLigne4",
    "cityAddress",
    "countryAddress",
    "emailAddress",
    "firstName",
    "idInscriptionSteptwo",
    "inscriptionAuthentification",
    "name",
    "phoneNumber",
    "regionAddress",
    "relationship",
    "stepIndicator",
    "stepStartDate",
    "typeOfContact",
    "zipcodeAddress"
})
public class InscriptionSteptwoDto {

    @XmlElement(name = "address_ligne_1", nillable = true)
    protected String addressLigne1;
    @XmlElement(name = "address_ligne_2", nillable = true)
    protected String addressLigne2;
    @XmlElement(name = "address_ligne_3", nillable = true)
    protected String addressLigne3;
    @XmlElement(name = "address_ligne_4", nillable = true)
    protected String addressLigne4;
    @XmlElement(nillable = true)
    protected CityDto cityAddress;
    @XmlElement(nillable = true)
    protected CountryDto countryAddress;
    @XmlElement(nillable = true)
    protected String emailAddress;
    @XmlElement(nillable = true)
    protected String firstName;
    protected Long idInscriptionSteptwo;
    protected InscriptionAuthentificationDto inscriptionAuthentification;
    @XmlElement(nillable = true)
    protected String name;
    @XmlElement(nillable = true)
    protected String phoneNumber;
    @XmlElement(nillable = true)
    protected RegionDto regionAddress;
    @XmlElement(nillable = true)
    protected PopuplistDto relationship;
    protected Long stepIndicator;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stepStartDate;
    @XmlElement(nillable = true)
    protected PopuplistDto typeOfContact;
    @XmlElement(nillable = true)
    protected ZipcodeDto zipcodeAddress;

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
     * Obtient la valeur de la propri�t� cityAddress.
     * 
     * @return
     *     possible object is
     *     {@link CityDto }
     *     
     */
    public CityDto getCityAddress() {
        return cityAddress;
    }

    /**
     * D�finit la valeur de la propri�t� cityAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link CityDto }
     *     
     */
    public void setCityAddress(CityDto value) {
        this.cityAddress = value;
    }

    /**
     * Obtient la valeur de la propri�t� countryAddress.
     * 
     * @return
     *     possible object is
     *     {@link CountryDto }
     *     
     */
    public CountryDto getCountryAddress() {
        return countryAddress;
    }

    /**
     * D�finit la valeur de la propri�t� countryAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDto }
     *     
     */
    public void setCountryAddress(CountryDto value) {
        this.countryAddress = value;
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
     * Obtient la valeur de la propri�t� firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * D�finit la valeur de la propri�t� firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtient la valeur de la propri�t� idInscriptionSteptwo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdInscriptionSteptwo() {
        return idInscriptionSteptwo;
    }

    /**
     * D�finit la valeur de la propri�t� idInscriptionSteptwo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdInscriptionSteptwo(Long value) {
        this.idInscriptionSteptwo = value;
    }

    /**
     * Obtient la valeur de la propri�t� inscriptionAuthentification.
     * 
     * @return
     *     possible object is
     *     {@link InscriptionAuthentificationDto }
     *     
     */
    public InscriptionAuthentificationDto getInscriptionAuthentification() {
        return inscriptionAuthentification;
    }

    /**
     * D�finit la valeur de la propri�t� inscriptionAuthentification.
     * 
     * @param value
     *     allowed object is
     *     {@link InscriptionAuthentificationDto }
     *     
     */
    public void setInscriptionAuthentification(InscriptionAuthentificationDto value) {
        this.inscriptionAuthentification = value;
    }

    /**
     * Obtient la valeur de la propri�t� name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propri�t� phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * D�finit la valeur de la propri�t� phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� regionAddress.
     * 
     * @return
     *     possible object is
     *     {@link RegionDto }
     *     
     */
    public RegionDto getRegionAddress() {
        return regionAddress;
    }

    /**
     * D�finit la valeur de la propri�t� regionAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionDto }
     *     
     */
    public void setRegionAddress(RegionDto value) {
        this.regionAddress = value;
    }

    /**
     * Obtient la valeur de la propri�t� relationship.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getRelationship() {
        return relationship;
    }

    /**
     * D�finit la valeur de la propri�t� relationship.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setRelationship(PopuplistDto value) {
        this.relationship = value;
    }

    /**
     * Obtient la valeur de la propri�t� stepIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStepIndicator() {
        return stepIndicator;
    }

    /**
     * D�finit la valeur de la propri�t� stepIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStepIndicator(Long value) {
        this.stepIndicator = value;
    }

    /**
     * Obtient la valeur de la propri�t� stepStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStepStartDate() {
        return stepStartDate;
    }

    /**
     * D�finit la valeur de la propri�t� stepStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStepStartDate(XMLGregorianCalendar value) {
        this.stepStartDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeOfContact.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getTypeOfContact() {
        return typeOfContact;
    }

    /**
     * D�finit la valeur de la propri�t� typeOfContact.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setTypeOfContact(PopuplistDto value) {
        this.typeOfContact = value;
    }

    /**
     * Obtient la valeur de la propri�t� zipcodeAddress.
     * 
     * @return
     *     possible object is
     *     {@link ZipcodeDto }
     *     
     */
    public ZipcodeDto getZipcodeAddress() {
        return zipcodeAddress;
    }

    /**
     * D�finit la valeur de la propri�t� zipcodeAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipcodeDto }
     *     
     */
    public void setZipcodeAddress(ZipcodeDto value) {
        this.zipcodeAddress = value;
    }

}
