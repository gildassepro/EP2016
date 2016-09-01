
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchStudentEventsServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchStudentEventsServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentEventsDto" type="{http://serviceapi.studentweb.sepro.org/}studentEventsDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchStudentEventsServicews", propOrder = {
    "studentEventsDto"
})
public class SearchStudentEventsServicews {

    protected StudentEventsDto studentEventsDto;

    /**
     * Obtient la valeur de la propriété studentEventsDto.
     * 
     * @return
     *     possible object is
     *     {@link StudentEventsDto }
     *     
     */
    public StudentEventsDto getStudentEventsDto() {
        return studentEventsDto;
    }

    /**
     * Définit la valeur de la propriété studentEventsDto.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentEventsDto }
     *     
     */
    public void setStudentEventsDto(StudentEventsDto value) {
        this.studentEventsDto = value;
    }

}
