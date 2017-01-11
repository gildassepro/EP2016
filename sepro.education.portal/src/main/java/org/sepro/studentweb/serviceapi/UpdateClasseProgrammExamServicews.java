
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateClasseProgrammExamServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateClasseProgrammExamServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classeProgrammExamDto" type="{http://serviceapi.studentweb.sepro.org/}classeProgrammExamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateClasseProgrammExamServicews", propOrder = {
    "classeProgrammExamDto"
})
public class UpdateClasseProgrammExamServicews {

    protected ClasseProgrammExamDto classeProgrammExamDto;

    /**
     * Obtient la valeur de la propriété classeProgrammExamDto.
     * 
     * @return
     *     possible object is
     *     {@link ClasseProgrammExamDto }
     *     
     */
    public ClasseProgrammExamDto getClasseProgrammExamDto() {
        return classeProgrammExamDto;
    }

    /**
     * Définit la valeur de la propriété classeProgrammExamDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasseProgrammExamDto }
     *     
     */
    public void setClasseProgrammExamDto(ClasseProgrammExamDto value) {
        this.classeProgrammExamDto = value;
    }

}
