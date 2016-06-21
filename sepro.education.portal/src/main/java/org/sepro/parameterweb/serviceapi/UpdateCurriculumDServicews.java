
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateCurriculumDServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateCurriculumDServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curriculumDto" type="{http://serviceapi.parameterweb.sepro.org/}curriculumDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCurriculumDServicews", propOrder = {
    "curriculumDto"
})
public class UpdateCurriculumDServicews {

    protected CurriculumDto curriculumDto;

    /**
     * Obtient la valeur de la propriété curriculumDto.
     * 
     * @return
     *     possible object is
     *     {@link CurriculumDto }
     *     
     */
    public CurriculumDto getCurriculumDto() {
        return curriculumDto;
    }

    /**
     * Définit la valeur de la propriété curriculumDto.
     * 
     * @param value
     *     allowed object is
     *     {@link CurriculumDto }
     *     
     */
    public void setCurriculumDto(CurriculumDto value) {
        this.curriculumDto = value;
    }

}
