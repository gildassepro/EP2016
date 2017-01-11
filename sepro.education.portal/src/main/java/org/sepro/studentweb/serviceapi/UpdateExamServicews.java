
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateExamServicews complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateExamServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="examDto" type="{http://serviceapi.studentweb.sepro.org/}examDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateExamServicews", propOrder = {
    "examDto"
})
public class UpdateExamServicews {

    protected ExamDto examDto;

    /**
     * Obtient la valeur de la propri�t� examDto.
     * 
     * @return
     *     possible object is
     *     {@link ExamDto }
     *     
     */
    public ExamDto getExamDto() {
        return examDto;
    }

    /**
     * D�finit la valeur de la propri�t� examDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ExamDto }
     *     
     */
    public void setExamDto(ExamDto value) {
        this.examDto = value;
    }

}
