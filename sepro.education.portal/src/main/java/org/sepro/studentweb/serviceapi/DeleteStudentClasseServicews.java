
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteStudentClasseServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteStudentClasseServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentClasseDto" type="{http://serviceapi.studentweb.sepro.org/}studentClasseDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteStudentClasseServicews", propOrder = {
    "studentClasseDto"
})
public class DeleteStudentClasseServicews {

    protected StudentClasseDto studentClasseDto;

    /**
     * Obtient la valeur de la propriété studentClasseDto.
     * 
     * @return
     *     possible object is
     *     {@link StudentClasseDto }
     *     
     */
    public StudentClasseDto getStudentClasseDto() {
        return studentClasseDto;
    }

    /**
     * Définit la valeur de la propriété studentClasseDto.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentClasseDto }
     *     
     */
    public void setStudentClasseDto(StudentClasseDto value) {
        this.studentClasseDto = value;
    }

}
