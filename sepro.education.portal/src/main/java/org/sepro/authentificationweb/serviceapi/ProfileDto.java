
package org.sepro.authentificationweb.serviceapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour profileDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="profileDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProfile" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="modules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="module" type="{http://serviceapi.authentificationweb.sepro.org/}moduleDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="profilName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileDto", propOrder = {
    "idProfile",
    "modules",
    "profilName"
})
public class ProfileDto {

    protected Long idProfile;
    protected ProfileDto.Modules modules;
    protected String profilName;

    /**
     * Obtient la valeur de la propriété idProfile.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProfile() {
        return idProfile;
    }

    /**
     * Définit la valeur de la propriété idProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProfile(Long value) {
        this.idProfile = value;
    }

    /**
     * Obtient la valeur de la propriété modules.
     * 
     * @return
     *     possible object is
     *     {@link ProfileDto.Modules }
     *     
     */
    public ProfileDto.Modules getModules() {
        return modules;
    }

    /**
     * Définit la valeur de la propriété modules.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileDto.Modules }
     *     
     */
    public void setModules(ProfileDto.Modules value) {
        this.modules = value;
    }

    /**
     * Obtient la valeur de la propriété profilName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilName() {
        return profilName;
    }

    /**
     * Définit la valeur de la propriété profilName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilName(String value) {
        this.profilName = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="module" type="{http://serviceapi.authentificationweb.sepro.org/}moduleDto" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "module"
    })
    public static class Modules {

        protected List<ModuleDto> module;

        /**
         * Gets the value of the module property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the module property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModuleDto }
         * 
         * 
         */
        public List<ModuleDto> getModule() {
            if (module == null) {
                module = new ArrayList<ModuleDto>();
            }
            return this.module;
        }

    }

}
