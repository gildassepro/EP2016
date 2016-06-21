
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour languageDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="languageDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idLanguage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="language_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "languageDto", propOrder = {
    "idLanguage",
    "languageCode",
    "languageName"
})
public class LanguageDto {

    protected Long idLanguage;
    @XmlElement(name = "language_code")
    protected String languageCode;
    @XmlElement(name = "language_name", nillable = true)
    protected String languageName;

    /**
     * Obtient la valeur de la propriété idLanguage.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdLanguage() {
        return idLanguage;
    }

    /**
     * Définit la valeur de la propriété idLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdLanguage(Long value) {
        this.idLanguage = value;
    }

    /**
     * Obtient la valeur de la propriété languageCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Définit la valeur de la propriété languageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Obtient la valeur de la propriété languageName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * Définit la valeur de la propriété languageName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageName(String value) {
        this.languageName = value;
    }

}
