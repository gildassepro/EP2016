
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateStudentExamGroupServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateStudentExamGroupServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentExamGroupDto" type="{http://serviceapi.studentweb.sepro.org/}studentExamGroupDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStudentExamGroupServicews", propOrder = {
    "studentExamGroupDto"
})
public class UpdateStudentExamGroupServicews {

    protected StudentExamGroupDto studentExamGroupDto;

    /**
     * Obtient la valeur de la propriété studentExamGroupDto.
     * 
     * @return
     *     possible object is
     *     {@link StudentExamGroupDto }
     *     
     */
    public StudentExamGroupDto getStudentExamGroupDto() {
        return studentExamGroupDto;
    }

    /**
     * Définit la valeur de la propriété studentExamGroupDto.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentExamGroupDto }
     *     
     */
    public void setStudentExamGroupDto(StudentExamGroupDto value) {
        this.studentExamGroupDto = value;
    }

}
