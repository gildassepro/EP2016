
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createAcademicModuleServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createAcademicModuleServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academicModuleDto" type="{http://serviceapi.parameterweb.sepro.org/}academicModuleDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAcademicModuleServicews", propOrder = {
    "academicModuleDto"
})
public class CreateAcademicModuleServicews {

    protected AcademicModuleDto academicModuleDto;

    /**
     * Obtient la valeur de la propriété academicModuleDto.
     * 
     * @return
     *     possible object is
     *     {@link AcademicModuleDto }
     *     
     */
    public AcademicModuleDto getAcademicModuleDto() {
        return academicModuleDto;
    }

    /**
     * Définit la valeur de la propriété academicModuleDto.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicModuleDto }
     *     
     */
    public void setAcademicModuleDto(AcademicModuleDto value) {
        this.academicModuleDto = value;
    }

}
