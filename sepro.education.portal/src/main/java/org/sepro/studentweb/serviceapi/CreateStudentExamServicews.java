
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createStudentExamServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createStudentExamServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentExamDto" type="{http://serviceapi.studentweb.sepro.org/}studentExamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createStudentExamServicews", propOrder = {
    "studentExamDto"
})
public class CreateStudentExamServicews {

    protected StudentExamDto studentExamDto;

    /**
     * Obtient la valeur de la propriété studentExamDto.
     * 
     * @return
     *     possible object is
     *     {@link StudentExamDto }
     *     
     */
    public StudentExamDto getStudentExamDto() {
        return studentExamDto;
    }

    /**
     * Définit la valeur de la propriété studentExamDto.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentExamDto }
     *     
     */
    public void setStudentExamDto(StudentExamDto value) {
        this.studentExamDto = value;
    }

}
