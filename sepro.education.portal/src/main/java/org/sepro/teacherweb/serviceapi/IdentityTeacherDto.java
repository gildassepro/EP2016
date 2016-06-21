
package org.sepro.teacherweb.serviceapi;

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
 * <p>Classe Java pour identityTeacherDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="identityTeacherDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address_ligne_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_ligne_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_ligne_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_ligne_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cityAddress" type="{http://serviceapi.parameterweb.sepro.org/}cityDto" minOccurs="0"/>
 *         &lt;element name="countryAddress" type="{http://serviceapi.parameterweb.sepro.org/}countryDto" minOccurs="0"/>
 *         &lt;element name="countryOfBirthday" type="{http://serviceapi.parameterweb.sepro.org/}countryDto" minOccurs="0"/>
 *         &lt;element name="emailAdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idIdentityTeacher" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="identityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeOfBirthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionAddress" type="{http://serviceapi.parameterweb.sepro.org/}regionDto" minOccurs="0"/>
 *         &lt;element name="sexe" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="speciality" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
 *         &lt;element name="typeOfDocument" type="{http://serviceapi.parameterweb.sepro.org/}popuplistDto" minOccurs="0"/>
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
@XmlType(name = "identityTeacherDto", propOrder = {
    "addressLigne1",
    "addressLigne2",
    "addressLigne3",
    "addressLigne4",
    "birthday",
    "cityAddress",
    "countryAddress",
    "countryOfBirthday",
    "emailAdd",
    "firstName",
    "idIdentityTeacher",
    "identityNumber",
    "maritalStatus",
    "name",
    "nationality",
    "phoneNumber",
    "placeOfBirthday",
    "regionAddress",
    "sexe",
    "speciality",
    "typeOfDocument",
    "zipcodeAddress"
})
public class IdentityTeacherDto {

    @XmlElement(name = "address_ligne_1")
    protected String addressLigne1;
    @XmlElement(name = "address_ligne_2", nillable = true)
    protected String addressLigne2;
    @XmlElement(name = "address_ligne_3", nillable = true)
    protected String addressLigne3;
    @XmlElement(name = "address_ligne_4", nillable = true)
    protected String addressLigne4;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    protected CityDto cityAddress;
    protected CountryDto countryAddress;
    protected CountryDto countryOfBirthday;
    protected String emailAdd;
    protected String firstName;
    protected Long idIdentityTeacher;
    protected String identityNumber;
    protected PopuplistDto maritalStatus;
    protected String name;
    protected PopuplistDto nationality;
    protected String phoneNumber;
    protected String placeOfBirthday;
    protected RegionDto regionAddress;
    protected PopuplistDto sexe;
    protected PopuplistDto speciality;
    protected PopuplistDto typeOfDocument;
    protected ZipcodeDto zipcodeAddress;

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
     * Obtient la valeur de la propriété birthday.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Définit la valeur de la propriété birthday.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Obtient la valeur de la propriété cityAddress.
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
     * Définit la valeur de la propriété cityAddress.
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
     * Obtient la valeur de la propriété countryAddress.
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
     * Définit la valeur de la propriété countryAddress.
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
     * Obtient la valeur de la propriété countryOfBirthday.
     * 
     * @return
     *     possible object is
     *     {@link CountryDto }
     *     
     */
    public CountryDto getCountryOfBirthday() {
        return countryOfBirthday;
    }

    /**
     * Définit la valeur de la propriété countryOfBirthday.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDto }
     *     
     */
    public void setCountryOfBirthday(CountryDto value) {
        this.countryOfBirthday = value;
    }

    /**
     * Obtient la valeur de la propriété emailAdd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAdd() {
        return emailAdd;
    }

    /**
     * Définit la valeur de la propriété emailAdd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAdd(String value) {
        this.emailAdd = value;
    }

    /**
     * Obtient la valeur de la propriété firstName.
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
     * Définit la valeur de la propriété firstName.
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
     * Obtient la valeur de la propriété idIdentityTeacher.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdIdentityTeacher() {
        return idIdentityTeacher;
    }

    /**
     * Définit la valeur de la propriété idIdentityTeacher.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdIdentityTeacher(Long value) {
        this.idIdentityTeacher = value;
    }

    /**
     * Obtient la valeur de la propriété identityNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    /**
     * Définit la valeur de la propriété identityNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityNumber(String value) {
        this.identityNumber = value;
    }

    /**
     * Obtient la valeur de la propriété maritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Définit la valeur de la propriété maritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setMaritalStatus(PopuplistDto value) {
        this.maritalStatus = value;
    }

    /**
     * Obtient la valeur de la propriété name.
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
     * Définit la valeur de la propriété name.
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
     * Obtient la valeur de la propriété nationality.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getNationality() {
        return nationality;
    }

    /**
     * Définit la valeur de la propriété nationality.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setNationality(PopuplistDto value) {
        this.nationality = value;
    }

    /**
     * Obtient la valeur de la propriété phoneNumber.
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
     * Définit la valeur de la propriété phoneNumber.
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
     * Obtient la valeur de la propriété placeOfBirthday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirthday() {
        return placeOfBirthday;
    }

    /**
     * Définit la valeur de la propriété placeOfBirthday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirthday(String value) {
        this.placeOfBirthday = value;
    }

    /**
     * Obtient la valeur de la propriété regionAddress.
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
     * Définit la valeur de la propriété regionAddress.
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
     * Obtient la valeur de la propriété sexe.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getSexe() {
        return sexe;
    }

    /**
     * Définit la valeur de la propriété sexe.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setSexe(PopuplistDto value) {
        this.sexe = value;
    }

    /**
     * Obtient la valeur de la propriété speciality.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getSpeciality() {
        return speciality;
    }

    /**
     * Définit la valeur de la propriété speciality.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setSpeciality(PopuplistDto value) {
        this.speciality = value;
    }

    /**
     * Obtient la valeur de la propriété typeOfDocument.
     * 
     * @return
     *     possible object is
     *     {@link PopuplistDto }
     *     
     */
    public PopuplistDto getTypeOfDocument() {
        return typeOfDocument;
    }

    /**
     * Définit la valeur de la propriété typeOfDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link PopuplistDto }
     *     
     */
    public void setTypeOfDocument(PopuplistDto value) {
        this.typeOfDocument = value;
    }

    /**
     * Obtient la valeur de la propriété zipcodeAddress.
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
     * Définit la valeur de la propriété zipcodeAddress.
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
