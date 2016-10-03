
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteStudentPresenceServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteStudentPresenceServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentPresenceDto" type="{http://serviceapi.studentweb.sepro.org/}studentPresenceDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteStudentPresenceServicews", propOrder = {
    "studentPresenceDto"
})
public class DeleteStudentPresenceServicews {

    protected StudentPresenceDto studentPresenceDto;

    /**
     * Obtient la valeur de la propriété studentPresenceDto.
     * 
     * @return
     *     possible object is
     *     {@link StudentPresenceDto }
     *     
     */
    public StudentPresenceDto getStudentPresenceDto() {
        return studentPresenceDto;
    }

    /**
     * Définit la valeur de la propriété studentPresenceDto.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPresenceDto }
     *     
     */
    public void setStudentPresenceDto(StudentPresenceDto value) {
        this.studentPresenceDto = value;
    }

}
