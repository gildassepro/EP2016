
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour roomInventoryDto complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="roomInventoryDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classe" type="{http://serviceapi.parameterweb.sepro.org/}classeDto" minOccurs="0"/>
 *         &lt;element name="commissioningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="idRoomInventory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="material" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomInventoryDto", propOrder = {
    "classe",
    "commissioningDate",
    "idRoomInventory",
    "material",
    "quantity",
    "ref"
})
public class RoomInventoryDto {

    protected ClasseDto classe;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commissioningDate;
    protected Long idRoomInventory;
    protected String material;
    protected int quantity;
    @XmlElement(nillable = true)
    protected String ref;

    /**
     * Obtient la valeur de la propriété classe.
     * 
     * @return
     *     possible object is
     *     {@link ClasseDto }
     *     
     */
    public ClasseDto getClasse() {
        return classe;
    }

    /**
     * Définit la valeur de la propriété classe.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasseDto }
     *     
     */
    public void setClasse(ClasseDto value) {
        this.classe = value;
    }

    /**
     * Obtient la valeur de la propriété commissioningDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommissioningDate() {
        return commissioningDate;
    }

    /**
     * Définit la valeur de la propriété commissioningDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommissioningDate(XMLGregorianCalendar value) {
        this.commissioningDate = value;
    }

    /**
     * Obtient la valeur de la propriété idRoomInventory.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdRoomInventory() {
        return idRoomInventory;
    }

    /**
     * Définit la valeur de la propriété idRoomInventory.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdRoomInventory(Long value) {
        this.idRoomInventory = value;
    }

    /**
     * Obtient la valeur de la propriété material.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Définit la valeur de la propriété material.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Obtient la valeur de la propriété quantity.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Définit la valeur de la propriété quantity.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Obtient la valeur de la propriété ref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Définit la valeur de la propriété ref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

}
