
package org.sepro.authentificationweb.serviceapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour moduleDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="moduleDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idModule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isSystem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="menus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="menu" type="{http://serviceapi.authentificationweb.sepro.org/}menuDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="moduleClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moduleImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moduleRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moduleDto", propOrder = {
    "description",
    "idModule",
    "isSystem",
    "menus",
    "moduleClass",
    "moduleImage",
    "moduleName",
    "moduleRef"
})
public class ModuleDto {

    protected String description;
    protected Long idModule;
    protected Boolean isSystem;
    protected ModuleDto.Menus menus;
    protected String moduleClass;
    protected String moduleImage;
    protected String moduleName;
    protected String moduleRef;

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
     * Obtient la valeur de la propriété idModule.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdModule() {
        return idModule;
    }

    /**
     * Définit la valeur de la propriété idModule.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdModule(Long value) {
        this.idModule = value;
    }

    /**
     * Obtient la valeur de la propriété isSystem.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSystem() {
        return isSystem;
    }

    /**
     * Définit la valeur de la propriété isSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSystem(Boolean value) {
        this.isSystem = value;
    }

    /**
     * Obtient la valeur de la propriété menus.
     * 
     * @return
     *     possible object is
     *     {@link ModuleDto.Menus }
     *     
     */
    public ModuleDto.Menus getMenus() {
        return menus;
    }

    /**
     * Définit la valeur de la propriété menus.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleDto.Menus }
     *     
     */
    public void setMenus(ModuleDto.Menus value) {
        this.menus = value;
    }

    /**
     * Obtient la valeur de la propriété moduleClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleClass() {
        return moduleClass;
    }

    /**
     * Définit la valeur de la propriété moduleClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleClass(String value) {
        this.moduleClass = value;
    }

    /**
     * Obtient la valeur de la propriété moduleImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleImage() {
        return moduleImage;
    }

    /**
     * Définit la valeur de la propriété moduleImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleImage(String value) {
        this.moduleImage = value;
    }

    /**
     * Obtient la valeur de la propriété moduleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Définit la valeur de la propriété moduleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Obtient la valeur de la propriété moduleRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleRef() {
        return moduleRef;
    }

    /**
     * Définit la valeur de la propriété moduleRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleRef(String value) {
        this.moduleRef = value;
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
     *         &lt;element name="menu" type="{http://serviceapi.authentificationweb.sepro.org/}menuDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "menu"
    })
    public static class Menus {

        protected List<MenuDto> menu;

        /**
         * Gets the value of the menu property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the menu property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMenu().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MenuDto }
         * 
         * 
         */
        public List<MenuDto> getMenu() {
            if (menu == null) {
                menu = new ArrayList<MenuDto>();
            }
            return this.menu;
        }

    }

}
