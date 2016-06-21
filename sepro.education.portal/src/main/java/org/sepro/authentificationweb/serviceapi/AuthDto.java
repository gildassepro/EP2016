
package org.sepro.authentificationweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour authDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="authDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountIslocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="credentialsNonExpired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailAdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "authDto", propOrder = {
    "accountIslocked",
    "credentialsNonExpired",
    "emailAdd",
    "enabled",
    "idUser",
    "numberOfAttempt",
    "password",
    "passwordDate",
    "passwordNbrDay",
    "profile",
    "userlogin"
})
public class AuthDto {

    @XmlElement(nillable = true)
    protected Boolean accountIslocked;
    @XmlElement(nillable = true)
    protected Boolean credentialsNonExpired;
    protected String emailAdd;
    @XmlElement(nillable = true)
    protected Boolean enabled;
    protected Long idUser;
    protected int numberOfAttempt;
    protected String password;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar passwordDate;
    protected int passwordNbrDay;
    protected ProfileDto profile;
    protected String userlogin;

    /**
     * Obtient la valeur de la propriété accountIslocked.
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
     * Définit la valeur de la propriété accountIslocked.
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
     * Obtient la valeur de la propriété credentialsNonExpired.
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
     * Définit la valeur de la propriété credentialsNonExpired.
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
     * Obtient la valeur de la propriété enabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Définit la valeur de la propriété enabled.
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
     * Obtient la valeur de la propriété idUser.
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
     * Définit la valeur de la propriété idUser.
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
     * Obtient la valeur de la propriété numberOfAttempt.
     * 
     */
    public int getNumberOfAttempt() {
        return numberOfAttempt;
    }

    /**
     * Définit la valeur de la propriété numberOfAttempt.
     * 
     */
    public void setNumberOfAttempt(int value) {
        this.numberOfAttempt = value;
    }

    /**
     * Obtient la valeur de la propriété password.
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
     * Définit la valeur de la propriété password.
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
     * Obtient la valeur de la propriété passwordDate.
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
     * Définit la valeur de la propriété passwordDate.
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
     * Obtient la valeur de la propriété passwordNbrDay.
     * 
     */
    public int getPasswordNbrDay() {
        return passwordNbrDay;
    }

    /**
     * Définit la valeur de la propriété passwordNbrDay.
     * 
     */
    public void setPasswordNbrDay(int value) {
        this.passwordNbrDay = value;
    }

    /**
     * Obtient la valeur de la propriété profile.
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
     * Définit la valeur de la propriété profile.
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
     * Obtient la valeur de la propriété userlogin.
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
     * Définit la valeur de la propriété userlogin.
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
