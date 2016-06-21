
package org.sepro.teacherweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createIdentityTeacherServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createIdentityTeacherServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identityTeacherDto" type="{http://serviceapi.teacherweb.sepro.org/}identityTeacherDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createIdentityTeacherServicews", propOrder = {
    "identityTeacherDto"
})
public class CreateIdentityTeacherServicews {

    protected IdentityTeacherDto identityTeacherDto;

    /**
     * Obtient la valeur de la propriété identityTeacherDto.
     * 
     * @return
     *     possible object is
     *     {@link IdentityTeacherDto }
     *     
     */
    public IdentityTeacherDto getIdentityTeacherDto() {
        return identityTeacherDto;
    }

    /**
     * Définit la valeur de la propriété identityTeacherDto.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityTeacherDto }
     *     
     */
    public void setIdentityTeacherDto(IdentityTeacherDto value) {
        this.identityTeacherDto = value;
    }

}
