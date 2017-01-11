
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchExamServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchExamServicews">
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
@XmlType(name = "searchExamServicews", propOrder = {
    "examDto"
})
public class SearchExamServicews {

    protected ExamDto examDto;

    /**
     * Obtient la valeur de la propriété examDto.
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
     * Définit la valeur de la propriété examDto.
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
