
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour userDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="userDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountIslocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="credentialsNonExpired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailAdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="lastConnection" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numberOfAttempt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="passwordNbrDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="profile" type="{http://serviceapi.authentificationweb.sepro.org/}profileDto" minOccurs="0"/>
 *         &lt;element name="userlogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDto", propOrder = {
    "accountIslocked",
    "credentialsNonExpired",
    "emailAdd",
    "enabled",
    "idUser",
    "image",
    "lastConnection",
    "numberOfAttempt",
    "password",
    "passwordDate",
    "passwordNbrDay",
    "profile",
    "userlogin"
})
public class UserDto {

    @XmlElement(nillable = true)
    protected Boolean accountIslocked;
    @XmlElement(nillable = true)
    protected Boolean credentialsNonExpired;
    protected String emailAdd;
    @XmlElement(nillable = true)
    protected Boolean enabled;
    protected Long idUser;
    protected byte[] image;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastConnection;
    protected int numberOfAttempt;
    protected String password;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar passwordDate;
    protected int passwordNbrDay;
    protected ProfileDto profile;
    protected String userlogin;

    /**
     * Obtient la valeur de la propri�t� accountIslocked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountIslocked() {
        return accountIslocked;
    }

    /**
     * D�finit la valeur de la propri�t� accountIslocked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountIslocked(Boolean value) {
        this.accountIslocked = value;
    }

    /**
     * Obtient la valeur de la propri�t� credentialsNonExpired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    /**
     * D�finit la valeur de la propri�t� credentialsNonExpired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCredentialsNonExpired(Boolean value) {
        this.credentialsNonExpired = value;
    }

    /**
     * Obtient la valeur de la propri�t� emailAdd.
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
     * D�finit la valeur de la propri�t� emailAdd.
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
     * Obtient la valeur de la propri�t� enabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * D�finit la valeur de la propri�t� enabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Obtient la valeur de la propri�t� idUser.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdUser() {
        return idUser;
    }

    /**
     * D�finit la valeur de la propri�t� idUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdUser(Long value) {
        this.idUser = value;
    }

    /**
     * Obtient la valeur de la propri�t� image.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * D�finit la valeur de la propri�t� image.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

    /**
     * Obtient la valeur de la propri�t� lastConnection.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastConnection() {
        return lastConnection;
    }

    /**
     * D�finit la valeur de la propri�t� lastConnection.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastConnection(XMLGregorianCalendar value) {
        this.lastConnection = value;
    }

    /**
     * Obtient la valeur de la propri�t� numberOfAttempt.
     * 
     */
    public int getNumberOfAttempt() {
        return numberOfAttempt;
    }

    /**
     * D�finit la valeur de la propri�t� numberOfAttempt.
     * 
     */
    public void setNumberOfAttempt(int value) {
        this.numberOfAttempt = value;
    }

    /**
     * Obtient la valeur de la propri�t� password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * D�finit la valeur de la propri�t� password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtient la valeur de la propri�t� passwordDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPasswordDate() {
        return passwordDate;
    }

    /**
     * D�finit la valeur de la propri�t� passwordDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPasswordDate(XMLGregorianCalendar value) {
        this.passwordDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� passwordNbrDay.
     * 
     */
    public int getPasswordNbrDay() {
        return passwordNbrDay;
    }

    /**
     * D�finit la valeur de la propri�t� passwordNbrDay.
     * 
     */
    public void setPasswordNbrDay(int value) {
        this.passwordNbrDay = value;
    }

    /**
     * Obtient la valeur de la propri�t� profile.
     * 
     * @return
     *     possible object is
     *     {@link ProfileDto }
     *     
     */
    public ProfileDto getProfile() {
        return profile;
    }

    /**
     * D�finit la valeur de la propri�t� profile.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileDto }
     *     
     */
    public void setProfile(ProfileDto value) {
        this.profile = value;
    }

    /**
     * Obtient la valeur de la propri�t� userlogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserlogin() {
        return userlogin;
    }

    /**
     * D�finit la valeur de la propri�t� userlogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserlogin(String value) {
        this.userlogin = value;
    }

}
