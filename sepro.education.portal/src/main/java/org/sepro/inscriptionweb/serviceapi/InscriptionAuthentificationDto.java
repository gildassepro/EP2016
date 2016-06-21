
package org.sepro.inscriptionweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.sepro.authentificationweb.serviceapi.ProfileDto;


/**
 * <p>Classe Java pour inscriptionAuthentificationDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="inscriptionAuthentificationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailAdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idInscription" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profile" type="{http://serviceapi.authentificationweb.sepro.org/}profileDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inscriptionAuthentificationDto", propOrder = {
    "emailAdd",
    "idInscription",
    "password",
    "profile"
})
public class InscriptionAuthentificationDto {

    protected String emailAdd;
    protected Long idInscription;
    protected String password;
    protected ProfileDto profile;

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
     * Obtient la valeur de la propriété idInscription.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdInscription() {
        return idInscription;
    }

    /**
     * Définit la valeur de la propriété idInscription.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdInscription(Long value) {
        this.idInscription = value;
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

}
