
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchStudentCVServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchStudentCVServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentCVDto" type="{http://serviceapi.studentweb.sepro.org/}studentCVDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchStudentCVServicews", propOrder = {
    "studentCVDto"
})
public class SearchStudentCVServicews {

    protected StudentCVDto studentCVDto;

    /**
     * Obtient la valeur de la propriété studentCVDto.
     * 
     * @return
     *     possible object is
     *     {@link StudentCVDto }
     *     
     */
    public StudentCVDto getStudentCVDto() {
        return studentCVDto;
    }

    /**
     * Définit la valeur de la propriété studentCVDto.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentCVDto }
     *     
     */
    public void setStudentCVDto(StudentCVDto value) {
        this.studentCVDto = value;
    }

}
