
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchExamGroupServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchExamGroupServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="examGroupDto" type="{http://serviceapi.studentweb.sepro.org/}examGroupDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchExamGroupServicews", propOrder = {
    "examGroupDto"
})
public class SearchExamGroupServicews {

    protected ExamGroupDto examGroupDto;

    /**
     * Obtient la valeur de la propriété examGroupDto.
     * 
     * @return
     *     possible object is
     *     {@link ExamGroupDto }
     *     
     */
    public ExamGroupDto getExamGroupDto() {
        return examGroupDto;
    }

    /**
     * Définit la valeur de la propriété examGroupDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ExamGroupDto }
     *     
     */
    public void setExamGroupDto(ExamGroupDto value) {
        this.examGroupDto = value;
    }

}
