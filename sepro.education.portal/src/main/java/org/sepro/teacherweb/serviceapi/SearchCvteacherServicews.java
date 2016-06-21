
package org.sepro.teacherweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchCvteacherServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchCvteacherServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cvteacherDto" type="{http://serviceapi.teacherweb.sepro.org/}cvteacherDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchCvteacherServicews", propOrder = {
    "cvteacherDto"
})
public class SearchCvteacherServicews {

    protected CvteacherDto cvteacherDto;

    /**
     * Obtient la valeur de la propriété cvteacherDto.
     * 
     * @return
     *     possible object is
     *     {@link CvteacherDto }
     *     
     */
    public CvteacherDto getCvteacherDto() {
        return cvteacherDto;
    }

    /**
     * Définit la valeur de la propriété cvteacherDto.
     * 
     * @param value
     *     allowed object is
     *     {@link CvteacherDto }
     *     
     */
    public void setCvteacherDto(CvteacherDto value) {
        this.cvteacherDto = value;
    }

}
