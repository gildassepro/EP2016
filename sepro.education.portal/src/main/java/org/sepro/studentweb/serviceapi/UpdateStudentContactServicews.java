
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateStudentContactServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateStudentContactServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentContactDto" type="{http://serviceapi.studentweb.sepro.org/}studentContactDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStudentContactServicews", propOrder = {
    "studentContactDto"
})
public class UpdateStudentContactServicews {

    protected StudentContactDto studentContactDto;

    /**
     * Obtient la valeur de la propri�t� studentContactDto.
     * 
     * @return
     *     possible object is
     *     {@link StudentContactDto }
     *     
     */
    public StudentContactDto getStudentContactDto() {
        return studentContactDto;
    }

    /**
     * D�finit la valeur de la propri�t� studentContactDto.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentContactDto }
     *     
     */
    public void setStudentContactDto(StudentContactDto value) {
        this.studentContactDto = value;
    }

}
