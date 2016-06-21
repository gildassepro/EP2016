
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeofClassDto complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeofClassDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTypeOfClass" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="typeclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeofClassDto", propOrder = {
    "idTypeOfClass",
    "typeclass"
})
public class TypeofClassDto {

    protected Long idTypeOfClass;
    protected String typeclass;

    /**
     * Obtient la valeur de la propri�t� idTypeOfClass.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTypeOfClass() {
        return idTypeOfClass;
    }

    /**
     * D�finit la valeur de la propri�t� idTypeOfClass.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTypeOfClass(Long value) {
        this.idTypeOfClass = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeclass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeclass() {
        return typeclass;
    }

    /**
     * D�finit la valeur de la propri�t� typeclass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeclass(String value) {
        this.typeclass = value;
    }

}
