
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateClasseServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateClasseServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classeDto" type="{http://serviceapi.parameterweb.sepro.org/}classeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateClasseServicews", propOrder = {
    "classeDto"
})
public class UpdateClasseServicews {

    protected ClasseDto classeDto;

    /**
     * Obtient la valeur de la propriété classeDto.
     * 
     * @return
     *     possible object is
     *     {@link ClasseDto }
     *     
     */
    public ClasseDto getClasseDto() {
        return classeDto;
    }

    /**
     * Définit la valeur de la propriété classeDto.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasseDto }
     *     
     */
    public void setClasseDto(ClasseDto value) {
        this.classeDto = value;
    }

}
