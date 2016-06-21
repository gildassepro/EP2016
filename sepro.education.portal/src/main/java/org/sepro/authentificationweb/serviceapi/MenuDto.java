
package org.sepro.authentificationweb.serviceapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour menuDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="menuDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="childMenu" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="childMenu" type="{http://serviceapi.authentificationweb.sepro.org/}menuDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idMenu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isSystem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="menuClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="menuName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="menuRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="role" type="{http://serviceapi.authentificationweb.sepro.org/}roleDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "menuDto", propOrder = {
    "childMenu",
    "description",
    "idMenu",
    "isSystem",
    "menuClass",
    "menuName",
    "menuRef",
    "roles"
})
public class MenuDto {

    protected MenuDto.ChildMenu childMenu;
    protected String description;
    protected Long idMenu;
    protected Boolean isSystem;
    protected String menuClass;
    protected String menuName;
    protected String menuRef;
    protected MenuDto.Roles roles;

    /**
     * Obtient la valeur de la propri�t� childMenu.
     * 
     * @return
     *     possible object is
     *     {@link MenuDto.ChildMenu }
     *     
     */
    public MenuDto.ChildMenu getChildMenu() {
        return childMenu;
    }

    /**
     * D�finit la valeur de la propri�t� childMenu.
     * 
     * @param value
     *     allowed object is
     *     {@link MenuDto.ChildMenu }
     *     
     */
    public void setChildMenu(MenuDto.ChildMenu value) {
        this.childMenu = value;
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
     * Obtient la valeur de la propri�t� idMenu.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdMenu() {
        return idMenu;
    }

    /**
     * D�finit la valeur de la propri�t� idMenu.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdMenu(Long value) {
        this.idMenu = value;
    }

    /**
     * Obtient la valeur de la propri�t� isSystem.
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
     * D�finit la valeur de la propri�t� isSystem.
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
     * Obtient la valeur de la propri�t� menuClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuClass() {
        return menuClass;
    }

    /**
     * D�finit la valeur de la propri�t� menuClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuClass(String value) {
        this.menuClass = value;
    }

    /**
     * Obtient la valeur de la propri�t� menuName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * D�finit la valeur de la propri�t� menuName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuName(String value) {
        this.menuName = value;
    }

    /**
     * Obtient la valeur de la propri�t� menuRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuRef() {
        return menuRef;
    }

    /**
     * D�finit la valeur de la propri�t� menuRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuRef(String value) {
        this.menuRef = value;
    }

    /**
     * Obtient la valeur de la propri�t� roles.
     * 
     * @return
     *     possible object is
     *     {@link MenuDto.Roles }
     *     
     */
    public MenuDto.Roles getRoles() {
        return roles;
    }

    /**
     * D�finit la valeur de la propri�t� roles.
     * 
     * @param value
     *     allowed object is
     *     {@link MenuDto.Roles }
     *     
     */
    public void setRoles(MenuDto.Roles value) {
        this.roles = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="childMenu" type="{http://serviceapi.authentificationweb.sepro.org/}menuDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "childMenu"
    })
    public static class ChildMenu {

        protected List<MenuDto> childMenu;

        /**
         * Gets the value of the childMenu property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the childMenu property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChildMenu().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MenuDto }
         * 
         * 
         */
        public List<MenuDto> getChildMenu() {
            if (childMenu == null) {
                childMenu = new ArrayList<MenuDto>();
            }
            return this.childMenu;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="role" type="{http://serviceapi.authentificationweb.sepro.org/}roleDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "role"
    })
    public static class Roles {

        protected List<RoleDto> role;

        /**
         * Gets the value of the role property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the role property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRole().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoleDto }
         * 
         * 
         */
        public List<RoleDto> getRole() {
            if (role == null) {
                role = new ArrayList<RoleDto>();
            }
            return this.role;
        }

    }

}
