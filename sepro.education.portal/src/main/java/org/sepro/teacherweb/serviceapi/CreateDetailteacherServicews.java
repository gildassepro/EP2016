
package org.sepro.teacherweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createDetailteacherServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createDetailteacherServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detailteacherDto" type="{http://serviceapi.teacherweb.sepro.org/}detailteacherDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createDetailteacherServicews", propOrder = {
    "detailteacherDto"
})
public class CreateDetailteacherServicews {

    protected DetailteacherDto detailteacherDto;

    /**
     * Obtient la valeur de la propriété detailteacherDto.
     * 
     * @return
     *     possible object is
     *     {@link DetailteacherDto }
     *     
     */
    public DetailteacherDto getDetailteacherDto() {
        return detailteacherDto;
    }

    /**
     * Définit la valeur de la propriété detailteacherDto.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailteacherDto }
     *     
     */
    public void setDetailteacherDto(DetailteacherDto value) {
        this.detailteacherDto = value;
    }

}
