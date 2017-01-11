
package org.sepro.studentweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createExamModuleGroupServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createExamModuleGroupServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="examModuleGroupDto" type="{http://serviceapi.studentweb.sepro.org/}examModuleGroupDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createExamModuleGroupServicews", propOrder = {
    "examModuleGroupDto"
})
public class CreateExamModuleGroupServicews {

    protected ExamModuleGroupDto examModuleGroupDto;

    /**
     * Obtient la valeur de la propriété examModuleGroupDto.
     * 
     * @return
     *     possible object is
     *     {@link ExamModuleGroupDto }
     *     
     */
    public ExamModuleGroupDto getExamModuleGroupDto() {
        return examModuleGroupDto;
    }

    /**
     * Définit la valeur de la propriété examModuleGroupDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ExamModuleGroupDto }
     *     
     */
    public void setExamModuleGroupDto(ExamModuleGroupDto value) {
        this.examModuleGroupDto = value;
    }

}
