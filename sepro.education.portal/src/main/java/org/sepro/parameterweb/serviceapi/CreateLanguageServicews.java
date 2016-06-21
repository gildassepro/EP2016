
package org.sepro.parameterweb.serviceapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createLanguageServicews complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createLanguageServicews">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="languageDto" type="{http://serviceapi.parameterweb.sepro.org/}languageDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createLanguageServicews", propOrder = {
    "languageDto"
})
public class CreateLanguageServicews {

    protected LanguageDto languageDto;

    /**
     * Obtient la valeur de la propriété languageDto.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDto }
     *     
     */
    public LanguageDto getLanguageDto() {
        return languageDto;
    }

    /**
     * Définit la valeur de la propriété languageDto.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDto }
     *     
     */
    public void setLanguageDto(LanguageDto value) {
        this.languageDto = value;
    }

}
